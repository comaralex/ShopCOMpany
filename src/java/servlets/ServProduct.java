/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author COMar-PC
 */
public class ServProduct extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        ServletConfig config = this.getServletConfig();
        HttpSession session = request.getSession();
        
        //TODO Add Data Base
        
        
//        StringBuilder sb = new StringBuilder();
//        sb.append("<html><body>");
//        sb.append("Мой первый сервлет!!!");
//        sb.append("</body></html>");
//        response.setContentType("text/html; charset=UTF-8");
//        PrintWriter out = response.getWriter();
//        out.println(sb.toString());
//        out.close();
//        
//        String value = getInitParameter("parameterName1");
        this.getServletContext()
                .getRequestDispatcher("/detail/product.jsp")
                .forward(request, response);
    }
}
