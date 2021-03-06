/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import database.DataBaseDebug;
import java.io.IOException;
import java.util.Locale;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import locale.LangBundle;
import shop.Movie;

/**
 *
 * @author COMar-PC
 */
public class ServletProduct extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        ServletConfig config = this.getServletConfig();
        HttpSession session = request.getSession();

        DataBaseDebug dbDebug = DataBaseDebug.getInstance();
        Movie movie = DataBaseDebug.getArrayOfMovies().get(0);
        
        request.setAttribute("prod", movie);
        request.setAttribute("defaultTab", config.getInitParameter("defaultTab"));
        
        LangBundle lang = (LangBundle) session.getAttribute("lang");
        String language = (String) request.getParameter("lang");
        if (language != null) {
            lang = new LangBundle(new Locale(language));
            session.setAttribute("lang", lang);
        }
        
        if (lang == null) {
            lang = new LangBundle(request.getLocale());
            session.setAttribute("lang", lang);
        }
        
        System.out.println("DEBUG " + lang.toString());
        System.out.println("DEBUG " + session.getAttribute("lang"));
        this.getServletContext()
                .getRequestDispatcher("/detail/product.jsp")
                .forward(request, response);
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
        processRequest(request, response);
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
        processRequest(request, response);
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
