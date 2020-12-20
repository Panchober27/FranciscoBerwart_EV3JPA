/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.controlador;

import cl.inacap.bean.BeanMantenedorLocal;
import cl.inacap.entity.Mantenedor;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author franc
 */
@WebServlet(name = "MantenedorControlador", urlPatterns = {"/agregar.do", "/listar.do", "/buscar.do"})
public class MantenedorControlador extends HttpServlet {

    @EJB
    private BeanMantenedorLocal beanMantenedor;

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MantenedorControlador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet MantenedorControlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
        if(request.getServletPath().equals("/listar.do")){
            
            //Acciones de listar.do
            
        } else if(request.getServletPath().equals("/agregar.do")){// Acciones de /agregar.do
            
            //Se reciben los parametros desde la petición.
            String nombre = request.getParameter("txtNombre");
            String apePat = request.getParameter("txtApePat");
            String apeMat = request.getParameter("txtApeMat");
            int sueldo = Integer.parseInt(request.getParameter("txtSueldo"));
            
            //Se encapsulan los datos en un objeto de la entidad.
            Mantenedor mantenedor = new Mantenedor(nombre, apePat, apeMat, sueldo);
            
            //Se procede a persistir el objeto, utilizando el BeanMantenedor(que tiene acceso al entityManager)
            beanMantenedor.agregar(mantenedor);
            //Se deja un registro en el log del servidor.
            this.log(" - Registro insertado en la tabla Mantenedor");
            //Se deriba la petición hacia el agregar.jsp
            request.setAttribute("msg", "Registro insertado correctamente!");
            request.getRequestDispatcher("agregar.jsp").forward(request, response);
            
            
            
        }
        
        
        
        
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
