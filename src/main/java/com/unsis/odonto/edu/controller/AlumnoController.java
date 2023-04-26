
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
        String cadena = request.getParameter("accion");

        switch (cadena) {
            case "crear":
                // crear(request, response);
                break;
            case "listar":
                listar(request, response);
                break;
            case "eliminar":
                eliminar(request, response);
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
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/viewAdministrador/gestionarAlumno.jsp");
        System.out.println("holasss");
        int idAlumno = Integer.parseInt(request.getParameter("idAlumno"));

        IAlumnoService service = new AlumnosServiceImpl();
        Alumnos alumno = service.obtenerRegistro(idAlumno);
        service.eliminarRegistro(alumno);

        List<Alumnos> listaAlumno = service.obtenerRegistros();
        request.setAttribute("listaAlumnos", listaAlumno);

        dispatcher.forward(request, response);

    }

    private void listar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("---------------------------------------------");

        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/viewAdministrador/gestionarAlumno.jsp");

        IAlumnoService service = new AlumnosServiceImpl();
        List<Alumnos> listaAlumno = service.obtenerRegistros();
        request.setAttribute("listaAlumnos", listaAlumno);

        dispatcher.forward(request, response);

    }

}
