/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.unsis.odonto.edu.controller;

import com.unsis.odonto.edu.entity.Alumnos;
import com.unsis.odonto.edu.service.AlumnosServiceImpl;
import com.unsis.odonto.edu.service.IAlumnoService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AlumnoController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        System.out.println("---------------------------------------------");
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/viewAdministrador/gestionarAlumno.jsp");
        
        IAlumnoService service = new AlumnosServiceImpl();
        List<Alumnos> listaAlumno = service.obtenerRegistros();
        request.setAttribute("listaAlumnos", listaAlumno);
        
        dispatcher.forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    

}
