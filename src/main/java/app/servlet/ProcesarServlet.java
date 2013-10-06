package app.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProcesarServlet
 */
public class ProcesarServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcesarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     * response)
     */
    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        procesarPeticion(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     * response)
     */
    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        procesarPeticion(request, response);
    }

    protected void procesarPeticion(HttpServletRequest request,
            HttpServletResponse response) throws ServletException,
            java.io.IOException {

        PrintWriter out = response.getWriter();
        String strTitle = "Salida Simple de un Servlet";

        // Establecer el tipo de contenido
        response.setContentType("text/html");

        out.println("<html><head><title>");
        out.println(strTitle);
        out.println("</title></head><body>");
        out.println("<h1>" + strTitle + "</h1>");
        out.println("<p> Esta es la respuesta del ProcesarServlet !");
        out.println("</body></html>");
        out.close();

    }
}
