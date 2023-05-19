/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.unsis.odonto.edu.controller;

import com.unsis.odonto.edu.entity.Paciente;
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

public class PacienteController extends HttpServlet {

   
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
      
    }

    private void listar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
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

    private void actualizarFormulario(HttpServletRequest request, HttpServletResponse response) {
       
    
    }

   


}
