package com.unsis.odonto.edu.controller;

import com.unsis.odonto.edu.entity.Catedraticos;
import com.unsis.odonto.edu.service.CatedraticoServiceImpl;
import com.unsis.odonto.edu.service.IAdministradorService;
import com.unsis.odonto.edu.service.ICatedraticoService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
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
                //crear(request, response);
                break;
            case "listar":
                listar(request, response);
                break;
            case "eliminar":
                eliminar(request, response);
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

    }

    private void eliminar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
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
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doDelete(req, resp); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPut(req, resp); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
}
