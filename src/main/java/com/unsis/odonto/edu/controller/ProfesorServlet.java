
package com.unsis.odonto.edu.controller;

import com.unsis.odonto.edu.entity.Catedraticos;
import com.unsis.odonto.edu.service.CatedraticoServiceImpl;
import com.unsis.odonto.edu.service.ICatedraticoService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ProfesorServlet extends HttpServlet {

   
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet ProfesorServlet</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet ProfesorServlet at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
//    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String cadena = request.getParameter("accion");

        switch (cadena) {
            case "listar":
                listar(request, response);
                break;
        }
        
    }
    private void listar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/viewAdministrador/gestionarProfesor.jsp");
        
        ICatedraticoService service = new CatedraticoServiceImpl();
        List<Catedraticos> listaCatedratico = service.obtenerRegistros();
        request.setAttribute("listaCatedratico", listaCatedratico);
        
        dispatcher.forward(request, response);
    }

//    @Override
//    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        
//    }
//
//    @Override
//    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        
//    }


}
