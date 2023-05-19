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
import java.time.LocalDate;
import java.time.Month;
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

        //int id = Integer.parseInt(request.getParameter("idDelUsuario"));
        //System.out.println("El idDelUsuario es: " + id);
        String cadena = request.getParameter("accion");
        System.out.println("controller 2" + cadena);
        switch (cadena) {
            case "crear":
                crear(request, response);
                break;
            case "listar":
                listar(request, response);
                break;
            case "eliminar":
                eliminar(request, response);
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
        Administradores administradores = new Administradores(id);

        service.eliminarRegistro(administradores);

        List<Administradores> listaAdministradores = service.obtenerRegistros();
        request.setAttribute("listaAdministradores", listaAdministradores);

        dispatcher.forward(request, response);
    }

    private void actualizarFormulario(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/viewAdministrador/actualizarAdministrador.jsp");
        int idAdministrador = Integer.parseInt(request.getParameter("id"));

        IAdministradorService service = new AdministradorServiceImpl();
        Administradores administradores = service.obtenerRegistro(idAdministrador);
        System.out.println("recibe: "+administradores.getIdAdministrador() + idAdministrador);

        request.setAttribute("administradores", administradores);

        dispatcher.forward(request, response);
    }

    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/viewAdministrador/actualizarAdministrador.jsp");
        
        Administradores administradores = new Administradores();
//        administradores.setIdAdministrador(Integer.parseInt(request.getParameter("idAdministrador")));
//        administradores.setNombre1(request.getParameter("nombre1"));
//        administradores.setNombre2(request.getParameter("nombre2"));
//        administradores.setApellido1(request.getParameter("apellido1"));
//        administradores.setApellido2(request.getParameter("apellido2"));
//        administradores.setCurp(request.getParameter("curp"));
//        administradores.setTelefono(request.getParameter("telefono"));
//        administradores.setNumeroTrabajador(request.getParameter("numeroTrabajador"));
//        System.out.println(request.getParameter("fechaNacimiento"));
//        LocalDate fechaNacimiento = LocalDate.parse(request.getParameter("fechaNacimiento"));
//        administradores.setFechaNacimiento(fechaNacimiento);
//        administradores.setSexo(request.getParameter("sexo").toUpperCase().charAt(0));
//        administradores.setEmailAdmin(request.getParameter("email"));
//        System.out.println(administradores.getFechaNacimiento().toString());
        
//        IAdministradorService service = new AdministradorServiceImpl();
//        service.actualizarRegistro(administradores);
//
//        List<Administradores> listaAdministradores = service.obtenerRegistros();
//        request.setAttribute("listaAdministradores", listaAdministradores);
//
//        dispatcher.forward(request, response);
    }

    private void crear(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/viewAdministrador/gestionarAdministradores.jsp");
        Integer anio;
        Integer mes;
        Integer dia;

        Administradores administradores = new Administradores();
        administradores.setNombre1(request.getParameter("primerNombre"));
        administradores.setNombre2(request.getParameter("segundoNombre"));
        administradores.setApellido1(request.getParameter("apellidoPaterno"));
        administradores.setApellido2(request.getParameter("apellidoMaterno"));
        administradores.setCurp(request.getParameter("curp"));
        administradores.setTelefono(request.getParameter("telefono"));

        administradores.setNumeroTrabajador(request.getParameter("numeroTrabajador"));

        anio = 2001;
        mes = 10;
        dia = 10; //Integer.valueOf(request.getParameter("dia"));

        System.out.println(request.getParameter("sexo").charAt(0));
        administradores.setSexo(request.getParameter("sexo").charAt(0));

        System.out.println(String.valueOf(dia + mes + anio + administradores.getSexo()));
        administradores.setFechaNacimiento(LocalDate.of(anio, mes, dia));
        administradores.setEmailAdmin(request.getParameter("email"));

        IAdministradorService service = new AdministradorServiceImpl();
        System.out.println("crear registro");
        service.crearRegistro(administradores);

        List<Administradores> listaAdministradores = service.obtenerRegistros();
        request.setAttribute("listaAdministradores", listaAdministradores);

        dispatcher.forward(request, response);
    }
}
