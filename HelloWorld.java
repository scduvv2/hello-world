import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorld extends HttpServlet {

    public void doGet(HttpServletRequest req,HttpServletResponse res)
            throws ServletException,IOException {
        res.setContentType("text/html");
        PrintWriter pw=res.getWriter();
        pw.println("<html><body>");
        pw.println("Hello World");
        pw.println("</body></html>");
        pw.close();
    }
}
