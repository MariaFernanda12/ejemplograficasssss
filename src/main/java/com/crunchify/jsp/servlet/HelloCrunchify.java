package com.crunchify.jsp.servlet;
 
import edu.co.sergio.mundo.dao.RegistroDAO;
import edu.co.sergio.mundo.vo.Registro;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import javax.servlet.RequestDispatcher;
 
/**
 * @author Crunchify.com
 */
 
public class HelloCrunchify extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // reading the user input
        String id = request.getParameter("id");
        String nombre = request.getParameter("nombre");
        
        //Se debe incluir validaciones - Lo recuerda: Gestion de Excepciones.
        RegistroDAO dao = new RegistroDAO();
        
        Registro registro = new Registro();
        registro.setIdColmena(Integer.parseInt(id));
        
         
        
        //Listando la informacion  
        List<Registro> registros =  dao.findAll();
        request.setAttribute("registros", registro);
       
       
        //Redireccionando la informacion
        RequestDispatcher redireccion = request.getRequestDispatcher("index.jsp");
        redireccion.forward(request, response);
        
        
        }
}
