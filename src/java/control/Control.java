package control;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import datos.Usuario;
import datos.Usuarios;

/**
 *
 * @author Carlos Loaeza
 */
@WebServlet(name = "Control", urlPatterns = {"/Control"})
public class Control extends HttpServlet {

    private Usuario dato = new Usuario();
    private Usuarios usuarios = new Usuarios();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter pw = response.getWriter();
        try (
                PrintWriter out = response.getWriter()) {
            //vinculo a la pagina a donde se dirigira la respuesta
            RequestDispatcher acceder = request.getRequestDispatcher("");
            String nombre = request.getParameter("usuario");
            String pass = request.getParameter("password");

            if (usuarios.autenticar(nombre, pass)) {
                dato.setNombre(nombre);
                acceder = request.getRequestDispatcher("acceso_2.jsp");
                request.setAttribute("dato", dato);
                //redireccionamiento a la pagina
                acceder.forward(request, response);
            } else {
                pw.println("<p align=\"center\">Usuario y/o Contraseña incorrectos</p>");
                acceder = request.getRequestDispatcher("index.jsp");
                acceder.include(request, response);
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
