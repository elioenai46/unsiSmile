/**
 * Autor     : Vite 
 * Fecha de creación : 20 abr 2023, 16:05
 * Fecha de modificación:12 may 2023, 16:55
 * Descripción : PacienteServletController de gestionar pacientes, enlace con Paciente. 
 */
 
package com.unsis.odonto.edu.controller;

import com.unsis.odonto.edu.entity.Paciente;
import com.unsis.odonto.edu.entity.Usuarios;
import com.unsis.odonto.edu.service.IPacienteService;
import com.unsis.odonto.edu.service.PacienteServiceImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SvltadminPacientesController extends HttpServlet {

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
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/viewAdministrador/gestionarPacientes.jsp");
        
        Paciente paciente = new Paciente();
        
        
        
        System.out.println(paciente);
        
        
        IPacienteService service = new PacienteServiceImpl();

        
        service.crearRegistro(paciente);

        List<Paciente> listaPaciente = service.obtenerRegistros();

        request.setAttribute(
                "listaPaciente", listaPaciente);

        dispatcher.forward(request, response);
    }

    //Método para listar pacientes mediante la valuación del id de alumno
    private void listar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {        
        System.out.println(
                "---------------VITE------------------------------");

        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/viewAlumno/gestionarPacientes.jsp");
        
        //obtener id
        String idUsuario = request.getParameter("idUsuario");
        Integer id = Integer.valueOf(idUsuario);
        System.out.println(id);
        
        //reenviar el id al jsp para evitar errores
        //Usuarios usuarios = new Usuarios();
        HttpSession session = request.getSession();
        session.setAttribute("idUsuario", id);
        
        //llamado al service
        IPacienteService service = new PacienteServiceImpl();
        List<Paciente> listaPaciente = service.obtenerRegistros(id);

        request.setAttribute(
                "listaPaciente", listaPaciente);

        dispatcher.forward(request, response);
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/viewAdministrador/gestionarPacientes.jsp");

        int id = Integer.parseInt(request.getParameter("id"));
        
        IPacienteService service = new PacienteServiceImpl();

        Paciente paciente = service.obtenerRegistro(id);
        service.eliminarRegistro(paciente);

        List<Paciente> listaPaciente = service.obtenerRegistros();

        request.setAttribute(
                "listaPaciente", listaPaciente);

        dispatcher.forward(request, response);
    }

    private void actualizarFormulario(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/viewAdministrador/actualizarProfesor.jsp");
        int id = Integer.parseInt(request.getParameter("id"));
       
        IPacienteService service = new PacienteServiceImpl();
        Paciente paciente = service.obtenerRegistro(id);
        
        request.setAttribute("paciente", paciente);
        
        dispatcher.forward(request, response);
    }
    
    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/viewAdministrador/gestionarProfesor.jsp");
        
        Paciente catedratico = new Paciente();
        catedratico.setIdPaciente(Integer.valueOf(request.getParameter("idCatedratico")));
        
        
        IPacienteService service = new PacienteServiceImpl();
        service.actualizarRegistro(catedratico);
        
        List<Paciente> listaPaciente = service.obtenerRegistros();
        request.setAttribute("listaPaciente", listaPaciente);
        
        dispatcher.forward(request, response);
    }

}
