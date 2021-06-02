/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Modelo.Alumno;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Utilidades;

/**
 *
 * @author DAW-B
 */
public class servletMensajes extends HttpServlet {
    ArrayList<String> listaGrupos = new ArrayList<String> ();
    String rutaArchivos;

    public void init (ServletConfig config) throws ServletException{
        listaGrupos.add("2daw_a");
        listaGrupos.add("2daw_b");
        rutaArchivos = config.getServletContext().getRealPath("").concat(File.separator).concat("ficheros");

        
    }
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String grupoSeleccionado = request.getParameter("grupo");
        String nombreFichero = grupoSeleccionado + ".txt";
        String nombreCompletoFicheros = rutaArchivos.concat(File.separator).concat(nombreFichero);
        ArrayList<modelo.Alumno> listaAlumnos = Utilidades.getAlumnos(nombreCompletoFicheros);
        request.setAttribute("listaGrupos", listaGrupos);
        request.setAttribute("grupoSeleccionado", grupoSeleccionado);
        request.getRequestDispatcher("alumnos.jsp").forward(request, response);
        
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
