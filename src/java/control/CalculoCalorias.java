
package control;

import datos.Actividad;
import datos.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Carlos Loaeza
 */
@WebServlet(name = "CalculoCalorias", urlPatterns = {"/CalculoCalorias"})
public class CalculoCalorias extends HttpServlet {
    private Actividad actividad = new Actividad();
    private Usuario usuario = new Usuario();
    private double tmb;
    private double kilocalorias;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try (PrintWriter out = response.getWriter()) {
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        RequestDispatcher calculo = request.getRequestDispatcher("calculokilocalorias.jsp");
            String s = request.getParameter("sexo");
            char sexo = s.charAt(0);
            int edad = Integer.parseInt(request.getParameter("edad"));
            int estatura = Integer.parseInt(request.getParameter("estatura"));
            double peso = Double.parseDouble(request.getParameter("peso"));
            int acti = Integer.parseInt(request.getParameter("actividad"));
            
            //request.setAttribute("acti",acti);
            actividad.calculaTmb(peso, estatura, edad, sexo);
            tmb = actividad.getTmb();
            actividad.calculaKcalorias(tmb, sexo, acti);
            kilocalorias = actividad.getKcalorias();
            request.setAttribute("actividad",actividad);
            calculo.forward(request, response);
        //processRequest(request, response);
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
