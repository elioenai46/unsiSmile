
package com.unsis.odonto.edu.controller;

import com.google.gson.Gson;
import com.unsis.odonto.edu.service.ObtenerGrupoServiceImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SemestreGrupoServletController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String valor1 = request.getParameter("val");
        List<String> html = obtenerHTMLCombobox2(valor1);
        html.add(0, "--Selecciona-una-opción--");

        // Convertir el ArrayList a formato JSON
        Gson gson = new Gson();
        String json = gson.toJson(html);

        // Enviar la respuesta como texto plano con formato JSON
        response.setContentType("text/plain");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(json);
    }
    
    
    private List<String> obtenerHTMLCombobox2(String valor1) {
        // Aquí obtienes los nuevos valores para el combobox2 utilizando una base de datos o cualquier otra fuente de datos
        // Luego, construyes el HTML con los nuevos valores y lo devuelves como un String
        ObtenerGrupoServiceImpl sg = new ObtenerGrupoServiceImpl();
        List<String> grupos = sg.obtenerRegistros(valor1);

        return grupos;
    }
}
