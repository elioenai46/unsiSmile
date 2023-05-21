/**
 * Autor     : Vite 
 * Fecha de creación : 20 abr 2023, 16:05
 * Fecha de modificación:26 abr 2023, 15:55
 * Descripción : ProfesorServlet controller de gestionar profesores, enlace con Catedraticos. 
 */

package com.unsis.odonto.edu.controller;

import com.unsis.odonto.edu.entity.Catedraticos;
import com.unsis.odonto.edu.service.CatedraticoServiceImpl;
import com.unsis.odonto.edu.service.ICatedraticoService;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SvltadminCatedraticosController extends HttpServlet {
    
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
                actualizarFormulario(request, response);
                break;
            case "actualizar":
                doPut(request, response);
                break;
            default:
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/viewAdministrador/gestionarProfesor.jsp");
//        Integer dia;
//        Integer mes;
//        Integer anio;
//        Catedraticos catedratico = new Catedraticos();
//        catedratico.setNombre(request.getParameter("firstN"));
//        catedratico.setNombre2(request.getParameter("secondN"));
//        catedratico.setApellido(request.getParameter("Apa"));
//        catedratico.setApellido2(request.getParameter("Ama"));
//        catedratico.setCurp(request.getParameter("curp"));
//        catedratico.setTelefono(request.getParameter("NumTel"));
//        catedratico.setSexo(request.getParameter("sexo").charAt(0));
//         dia = 14;
//         mes = 05;
//         anio = 1968;        
//        catedratico.setFechaNacimiento(LocalDate.of(anio, mes, dia));
//        catedratico.setNumeroTrabajador(request.getParameter("NumT"));
//        catedratico.setEmailCatedratico(request.getParameter("correo"));
//        
//        System.out.println(catedratico);
//        
//        
//        ICatedraticoService service = new CatedraticoServiceImpl();
//
//        
//        service.crearRegistro(catedratico);
//
//        List<Catedraticos> listaCatedratico = service.obtenerRegistros();
//
//        request.setAttribute(
//                "listaCatedratico", listaCatedratico);
//
//        dispatcher.forward(request, response);
    }

    private void listar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {        
        System.out.println(
                "---------------VITE------------------------------");

        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/viewAdministrador/gestionarProfesor.jsp");

        
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

        Catedraticos catedraticos = new Catedraticos(id);
        service.eliminarRegistro(catedraticos);

        List<Catedraticos> listaCatedratico = service.obtenerRegistros();

        request.setAttribute(
                "listaCatedratico", listaCatedratico);

        dispatcher.forward(request, response);
    }

    private void actualizarFormulario(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/viewAdministrador/actualizarProfesor.jsp");
        int id = Integer.parseInt(request.getParameter("id"));
       
        ICatedraticoService service = new CatedraticoServiceImpl();
        Catedraticos catedratico = service.obtenerRegistro(id);
        
        request.setAttribute("catedraticos", catedratico);
        
        dispatcher.forward(request, response);
    }
    
    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/viewAdministrador/gestionarProfesor.jsp");
        
        Catedraticos catedratico = new Catedraticos();
        catedratico.setIdCatedratico(Integer.parseInt(request.getParameter("idCatedratico")));
        catedratico.setNombre(request.getParameter("firstN"));
        catedratico.setNombre2(request.getParameter("secondN"));
        catedratico.setApellido(request.getParameter("Apa"));
        catedratico.setApellido2(request.getParameter("Ama"));
        catedratico.setCurp(request.getParameter("curp"));
        catedratico.setTelefono(request.getParameter("NumTel"));
        catedratico.setSexo(request.getParameter("sexo").charAt(0));
        Integer dia = Integer.parseInt(request.getParameter("dia"));
        Integer mes = Integer.parseInt(request.getParameter("mes"));
        Integer anio =  Integer.parseInt(request.getParameter("anio"));
        catedratico.setFechaNacimiento(LocalDate.of(anio, mes, dia));
        catedratico.setNumeroTrabajador(request.getParameter("NumT"));
        catedratico.setEmailCatedratico(request.getParameter("correo"));
        
        ICatedraticoService service = new CatedraticoServiceImpl();
        service.actualizarRegistro(catedratico);
        
        List<Catedraticos> listaCatedratico = service.obtenerRegistros();
        request.setAttribute("listaUsuario", listaCatedratico);
        
        dispatcher.forward(request, response);
    }

    
}
