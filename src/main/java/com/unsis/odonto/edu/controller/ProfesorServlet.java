package com.unsis.odonto.edu.controller;

import com.unsis.odonto.edu.entity.Catedraticos;
import com.unsis.odonto.edu.service.CatedraticoServiceImpl;
import com.unsis.odonto.edu.service.IAdministradorService;
import com.unsis.odonto.edu.service.ICatedraticoService;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProfesorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String cadena = request.getParameter("accion");

        switch (cadena) {
            case "crear":
                doPost(request, response);
                break;
            case "listar":
                listar(request, response);
                break;
            case "eliminar":
                doDelete(request, response);
                break;
            case "actualizarFormulario":
                //actualizarFormulario(request, response);
                break;
            case "actualizar":
                //actualizar(request, response);
                break;
            default:
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Date fechaN=null;
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/viewAdministrador/gestionarProfesor.jsp");
        Catedraticos catedratico = new Catedraticos();
        catedratico.setNombre(request.getParameter("firstN"));
        catedratico.setNombre2(request.getParameter("secondN"));
        catedratico.setApellido(request.getParameter("Apa"));
        catedratico.setApellido2(request.getParameter("Ama"));
        catedratico.setCurp(request.getParameter("curp"));
        catedratico.setTelefono(request.getParameter("NumTel"));
        catedratico.setSexo(request.getParameter("sexo").charAt(0));
        String dia = request.getParameter("dia");
        String mes = request.getParameter("mes");
        String anio = request.getParameter("anio");
        String fecha = dia+"/"+mes+"/"+anio;
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        try {
            fechaN = formato.parse(fecha);
        } catch (ParseException ex) {
            Logger.getLogger(ProfesorServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        catedratico.setFechaNacimiento(fechaN);
        catedratico.setNumeroTrabajador(request.getParameter("NumT"));
        catedratico.setEmailCatedratico(request.getParameter("correo"));
        
        
        ICatedraticoService service = new CatedraticoServiceImpl();

        
        service.crearRegistro(catedratico);

        List<Catedraticos> listaCatedratico = service.obtenerRegistros();

        request.setAttribute(
                "listaCatedratico", listaCatedratico);

        dispatcher.forward(request, response);
    }

    private void listar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {        
        System.out.println(
                "---------------VITE------------------------------");

        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/viewAdministrador/gestionarProfesor.jsp");

        //IAdministradorService service = new CatedraticoServiceImpl();
        ICatedraticoService service = new CatedraticoServiceImpl();
        List<Catedraticos> listaCatedratico = service.obtenerRegistros();

        request.setAttribute(
                "listaCatedratico", listaCatedratico);

        dispatcher.forward(request, response);
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/viewAdministrador/gestionarProfesor.jsp");

        int id = Integer.parseInt(request.getParameter("id"));
        
        ICatedraticoService service = new CatedraticoServiceImpl();

        Catedraticos catedraticos = service.obtenerRegistro(id);
        service.eliminarRegistro(catedraticos);

        List<Catedraticos> listaCatedratico = service.obtenerRegistros();

        request.setAttribute(
                "listaCatedratico", listaCatedratico);

        dispatcher.forward(request, response);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    }

    
}
