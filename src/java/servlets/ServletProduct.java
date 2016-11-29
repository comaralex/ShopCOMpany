/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.util.ArrayList;
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

        String movieName = "Spice and Wolf";
        System.out.println(movieName);
        String movieDesc = "Spice and Wolf's story revolves around Kraft Lawrence,"
                + " a 25-year-old traveling merchant who peddles various goods"
                + " from town to town to make a living in a stylized historical"
                + " setting with European influences. One night when stopped at"
                + " the town of Pasloe, he finds in his wagon a Pagan wolf-deity"
                + " named Holo who is over 600 years old. She takes the form of"
                + " a 15-year-old girl, except for a wolf's tail and ears.";
        String movieAuthor = "Ayakura";
        ArrayList<String> movieGenre = new ArrayList<String>();
        movieGenre.add("Fantazy");
        movieGenre.add("Gods");
        String movieType = "TV Series";
        Integer movieSeries = 12;
        String movieVoice = "Ancord";
        Movie movie = new Movie(movieName, movieDesc, movieAuthor,
                movieGenre, movieType, movieSeries, movieVoice);

        request.setAttribute("prod", movie);
        request.setAttribute("defaultPage", config.getInitParameter("defaultPage"));
        
        LangBundle lang = (LangBundle) session.getAttribute("lang");
        String language = (String) request.getParameter("lang");
        language =  "ru"; // TODO Delete it
        if (language != null) {
            lang = new LangBundle(new Locale(language));
            session.setAttribute("lang", lang);
        }
        
        if (lang == null) {
            lang = new LangBundle(request.getLocale());
            session.setAttribute("lang", lang);
        }
        
        System.out.println("DEBUG " + lang);
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
