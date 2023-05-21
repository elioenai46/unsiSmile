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
import com.unsis.odonto.edu.entity.Administradores;
import com.unsis.odonto.edu.entity.Alumnos;
import com.unsis.odonto.edu.entity.Catedraticos;
import com.unsis.odonto.edu.entity.SemestreGrupo;
import com.unsis.odonto.edu.service.AdministradorServiceImpl;
import com.unsis.odonto.edu.service.AlumnosServiceImpl;
import com.unsis.odonto.edu.service.IAdministradorService;
import com.unsis.odonto.edu.service.IAlumnoService;
import com.unsis.odonto.edu.service.IObtenerGrupoService;
import com.unsis.odonto.edu.service.ObtenerGrupoServiceImpl;
import java.io.IOException;
import java.util.ArrayList;
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
            case "actualizarFormulario":
                actualizarFormulario(request, response);
            default:
                break;
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/viewAdministrador/gestionarAlumno.jsp");

        Alumnos alumnos = new Alumnos();
        // System.out.println(request.getParameter("nombre"));
        alumnos.setNombre(request.getParameter("nombre"));
        alumnos.setNombre2(request.getParameter("nombre2"));
        alumnos.setApellido(request.getParameter("apellido"));
        alumnos.setApellido2(request.getParameter("apellido2"));
        alumnos.setSexo('M');
        alumnos.setCurp(request.getParameter("curp"));
        String grupo, semestre;
        grupo = request.getParameter("grupo");
        semestre = request.getParameter("semestre");
        //Semestre        
        alumnos.setMatricula(request.getParameter("matricula"));
        alumnos.setTelefono(request.getParameter("telefono"));
        alumnos.setEmailAlumno(request.getParameter("email"));
        //catedratico
        //Catedraticos catedratico = new Catedraticos(i);
        // alumnos.setFIdCatedraticoResponsable(catedratico);
        
        IAlumnoService service = new AlumnosServiceImpl();
        service.crearRegistro(alumnos);

        List<Alumnos> listaAlumno = service.obtenerRegistros();
        request.setAttribute("listaAlumno", listaAlumno);

        dispatcher.forward(request, response);
    }

    private void crear(HttpServletRequest request, HttpServletResponse response)
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

    private void cargar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int idAlumno = Integer.parseInt(request.getParameter("idAlumno"));

        IAlumnoService service = new AlumnosServiceImpl();
        Alumnos alumno = service.obtenerRegistro(idAlumno);
        service.eliminarRegistro(alumno);

        List<Alumnos> listaAlumno = service.obtenerRegistros();
        request.setAttribute("listaAlumnos", listaAlumno);

    }

    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("----->>>>>>>>>>>>>>>>>");
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/viewAdministrador/gestionarAlumno.jsp");
        Alumnos alumno = new Alumnos();

        alumno.setNombre(request.getParameter("nombre"));
        alumno.setNombre2(request.getParameter("segundoNombre"));
        alumno.setApellido(request.getParameter("apellidoPaterno"));
        alumno.setApellido2(request.getParameter("apellidoMaterno"));
        alumno.setSexo(request.getParameter("sexo").toUpperCase().charAt(0));
        alumno.setCurp(request.getParameter("curp"));
        //alumno.setFkIdSemestreGrupo(fkIdSemestreGrupo);
    }

    private void actualizarFormulario(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/viewAdministrador/actualizarAlumno.jsp");
        int id = Integer.parseInt(request.getParameter("id"));
        
        
        //obtenemos los datos del alumno desde la base de datos mediante el id
        IAlumnoService service = new AlumnosServiceImpl();
        Alumnos alumno= service.obtenerRegistro(id);
        
        //obtenemos el semestre y grupo usando el id_semestre_grupo que tiene
        //el objeto alumno, y l guardamos en un array list de tipo String
        IObtenerGrupoService grupo= new ObtenerGrupoServiceImpl();
        ArrayList<String> lista=grupo.obtenerSemGrup(alumno.getFkIdSemestreGrupo().getIdSemestreGrupo());
        
        
        System.out.println(lista.get(0));
        System.out.println(lista.get(1));

        request.setAttribute("alumno", alumno);

        dispatcher.forward(request, response);
    }

}
