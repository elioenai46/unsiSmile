
package com.unsis.odonto.edu.controller;

import com.unsis.odonto.edu.entity.Administradores;
import com.unsis.odonto.edu.service.AdministradorServiceImpl;
import com.unsis.odonto.edu.service.IAdministradorService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdministradoresServletController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
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

    
    public void listar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/viewAdministrador/gestionarAdministradores.jsp");

        IAdministradorService service = new AdministradorServiceImpl();
        List<Administradores> listaAdministradores = service.obtenerRegistros();
        request.setAttribute("listaAdministradores", listaAdministradores);

        dispatcher.forward(request, response);
    }
    private void eliminar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/viewAdministrador/gestionarAdministradores.jsp");

        int id = Integer.parseInt(request.getParameter("id"));

        IAdministradorService service = new AdministradorServiceImpl();
        Administradores administradores = service.obtenerRegistro(id);
        service.eliminarRegistro(administradores);
        
        List<Administradores> listaAdministradores = service.obtenerRegistros();
        request.setAttribute("listaAdministradores", listaAdministradores);
        
        dispatcher.forward(request, response);
}
    private void actualizarFormulario(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/viewAdministrador/gestionarAdministradores.jsp");
        int id = Integer.parseInt(request.getParameter("id"));
       
        IAdministradorService service = new AdministradorServiceImpl();
        Administradores administradores = service.obtenerRegistro(id);
        
        request.setAttribute("tenis", administradores);
        
        dispatcher.forward(request, response);
    }
}
