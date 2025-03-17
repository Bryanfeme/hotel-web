package Servlets;

import Logica.Controladora;
import java.io.IOException;
import java.text.ParseException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "SvAltaHuesped", urlPatterns = {"/SvAltaHuesped"})
public class SvAltaHuesped extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
      try {  
        // traigo los datos del jsp
        String dni = request.getParameter("dni");
	String nombre = request.getParameter("nombres");
	String apellido = request.getParameter("apellidos");
        String fechaNac = request.getParameter("fechaNac");
	String direccion = request.getParameter("direccion");
        String profesion = request.getParameter("profesion");
        
        //conecto la logica
        Controladora control = new Controladora();
        control.altaHuesped(dni, nombre, apellido, fechaNac, direccion, profesion);
        
        //armo la respuesta
        request.getSession().setAttribute("listaHuespedes", control.obtenerHuespedes());
        response.sendRedirect("listaHuespedes.jsp");
      } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
