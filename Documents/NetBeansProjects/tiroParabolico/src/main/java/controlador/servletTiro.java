/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Coordenada;
import modelo.Tiro;
import modelo.Utilidades;

/**
 *
 * @author DAW-B
 */
public class servletTiro extends HttpServlet {
    
   public ArrayList<String> grados;
    @Override
    public void init() throws ServletException {
        grados = Utilidades.mostrarGrados();
    }
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                 
        grados = Utilidades.mostrarGrados();

        request.setAttribute("grados",grados);
        request.getRequestDispatcher("tiro.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Tiro tr = new Tiro(
            Double.parseDouble(request.getParameter("velocidad")),
            Integer.parseInt(request.getParameter("angulo"))
        );
        
        request.setAttribute("tr", tr);
        request.setAttribute("grados", grados);
        
        ArrayList<Coordenada> coordenadas = new ArrayList();
        coordenadas = Utilidades.getCoordenadas(tr.getAlcance(), tr.getVelocidad(), tr.getAngulo());
        
        request.setAttribute("coordenadas", coordenadas);
        request.getRequestDispatcher("tiro.jsp").forward(request, response);
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
