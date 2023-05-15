package com.unsis.odonto.edu.controller;

import com.unsis.odonto.edu.entity.Administradores;
import com.unsis.odonto.edu.entity.Usuarios;
import com.unsis.odonto.edu.service.AdministradorServiceImpl;
import com.unsis.odonto.edu.service.IAdministradorService;
import com.unsis.odonto.edu.service.ILoginService;
import com.unsis.odonto.edu.service.LoginServiceImpl;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("usuario");
        String password = request.getParameter("contrasena");
        

        Usuarios usuarios = new Usuarios();
        usuarios.setNombreUsuario(username);
        usuarios.setPassUsuario(password);

        ILoginService service = new LoginServiceImpl();
        IAdministradorService adminService= new AdministradorServiceImpl();
        Administradores admin = new Administradores();
        // injectar 

        usuarios = service.login(usuarios);
        
        String paginaDestino = "/pages/login/login.jsp";
        if (usuarios.getNombreRol().compareTo("") != 0) {
           
            HttpSession session = request.getSession();
            session.setMaxInactiveInterval(20);
            System.out.println("id--: " +usuarios.getIdUsuario());
            session.setAttribute("idUsuario", usuarios.getIdUsuario());
             switch (usuarios.getNombreRol()) {
                case "Administrador":              
                    paginaDestino = "/pages/viewAdministrador/homeAdministrador.jsp";
                    admin=adminService.obtenerRegistro(usuarios.getIdUsuario());
                    session.setAttribute("admin",admin);
//                    /**
//                     * enviamos el id del usuario al jsp, hacemos lo mismo
//                     * para alumnos y profesor
//                     */
//                    request.setAttribute("iduser", usuarios.getIdUsuario());

                   break;
                case "Alumno":
                    paginaDestino = "/pages/viewAlumno/homeAlumno.jsp";
//                    request.setAttribute("iduser", usuarios.getIdUsuario());

                    break;
                      case "Profesor":
                    paginaDestino = "/pages/viewProfesor/homeProfesor.jsp";
//                    request.setAttribute("iduser", usuarios.getIdUsuario());

                    break;

                default:
                    paginaDestino="/pages/login/login.jsp";

             }
           //paginaDestino = "/pages/index.jsp";
        } else {
            String message = "usuario o contraseña incorrecta";
            request.setAttribute("message", message);
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher(paginaDestino);
        dispatcher.forward(request, response);

    }
}
