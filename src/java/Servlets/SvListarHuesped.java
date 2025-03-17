package Servlets;

import Logica.Controladora;
import Logica.Huesped;
import java.io.IOException;
import java.util.List;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet(name = "SvListarHuesped", urlPatterns = {"/SvListarHuesped"})
public class SvListarHuesped extends HttpServlet {

  
      
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Controladora control = new Controladora();
        List<Huesped> listaHuespedes = control.obtenerHuespedes();
        HttpSession misession = request.getSession();
        misession.setAttribute("listaHuespedes", listaHuespedes);
        response.sendRedirect("listaHuespedes.jsp");
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
