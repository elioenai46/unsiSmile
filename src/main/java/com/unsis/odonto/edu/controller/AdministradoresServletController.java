/**
 *Autor:Nancy Obed Martínez Miguel
 *Fecha de creación:24 de abril 2023
 *Fecha de Modificación:26 de abril del 2023
 *Descripción: se crea la clase del servlet para hacer uso de los métodos que
 *             nos van a ayudar a crear, listar, eliminar y actualizar
 *             administradores
 */
package com.unsis.odonto.edu.controller;

import com.unsis.odonto.edu.entity.Administradores;
import com.unsis.odonto.edu.service.AdministradorServiceImpl;
import com.unsis.odonto.edu.service.IAdministradorService;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
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

    private void crear(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/viewAdministrador/gestionarAdministradores.jsp");
        Administradores administradores = new Administradores();
        administradores.setNombre1(request.getParameter("primerNombre"));
        administradores.setNombre2(request.getParameter("segundoNombre"));
        administradores.setApellido1(request.getParameter("apellidoPaterno"));
        administradores.setApellido2(request.getParameter("apellidoMaterno"));
        administradores.setCurp(request.getParameter("curp"));
        administradores.setTelefono(request.getParameter("telefono"));
        administradores.setNumeroTrabajador(request.getParameter("numeroTrabajador"));
        // administradores.setSexo(Char.parrequest.getParameter("sexo"));

        Date now = new Date();
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat formatter = new SimpleDateFormat(pattern);
        String mysqlDateString = formatter.format(now);

        administradores.setFechaNacimiento(now);
        administradores.setEmailAdmin(request.getParameter("email"));

        IAdministradorService service = new AdministradorServiceImpl();
        service.crearRegistro(administradores);
        
        List<Administradores> listaAdministradores = service.obtenerRegistros();
        request.setAttribute("listaAdministradores", listaAdministradores);

        dispatcher.forward(request, response);
    }
}
