/**
 * Autor: Baldomero Sainos Hernández
 * Fecha de creación: 25 de abril de 2023
 * Fecha de actualización: 05 de mayo de 2023
 * Modificado por: Oscar Fuentes Alvarado
 * Descripción: Controller para gestionar la conexión con la vista de
 *              de adiministación de alumno
 */
package com.unsis.odonto.edu.controller;

import com.google.gson.Gson;
import com.unsis.odonto.edu.entity.Alumnos;
import com.unsis.odonto.edu.entity.Catedraticos;
import com.unsis.odonto.edu.entity.SemestreGrupo;
import com.unsis.odonto.edu.service.AlumnosServiceImpl;
import com.unsis.odonto.edu.service.IAlumnoService;
import com.unsis.odonto.edu.service.ObtenerGrupoServiceImpl;
import java.io.IOException;
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
        System.out.println(cadena);
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
            default:
                break;
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    private void crear(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/viewAdministrador/gestionarAlumno.jsp");
        Integer i = 1;
        Alumnos alumnos = new Alumnos();

        alumnos.setNombre(request.getParameter("nombre"));
        alumnos.setNombre2(request.getParameter("nombre2"));
        alumnos.setApellido(request.getParameter("apellido"));
        alumnos.setApellido2(request.getParameter("apellido2"));
        alumnos.setSexo('M');
        alumnos.setCurp(request.getParameter("curp"));
        //Semestre
        SemestreGrupo sg = new SemestreGrupo(i);
        alumnos.setFkIdSemestreGrupo(sg);
        alumnos.setMatricula(request.getParameter("matricula"));
        alumnos.setTelefono(request.getParameter("telefono"));
        alumnos.setEmailAlumno(request.getParameter("email"));
        //catedratico
        Catedraticos catedratico = new Catedraticos(i);
        alumnos.setFIdCatedraticoResponsable(catedratico);

        IAlumnoService service = new AlumnosServiceImpl();
        service.crearRegistro(alumnos);

        List<Alumnos> listaAlumno = service.obtenerRegistros();
        request.setAttribute("listaAlumno", listaAlumno);

        dispatcher.forward(request, response);
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

    private void cargar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int idAlumno = Integer.parseInt(request.getParameter("idAlumno"));

        IAlumnoService service = new AlumnosServiceImpl();
        Alumnos alumno = service.obtenerRegistro(idAlumno);
        service.eliminarRegistro(alumno);

        List<Alumnos> listaAlumno = service.obtenerRegistros();
        request.setAttribute("listaAlumnos", listaAlumno);

    }

}
