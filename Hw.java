import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class  Hw extends HttpServlet
{
 public void doGet(HttpServletRequest req,HttpServletResponse res)  
throws ServletException,IOException  
{  
res.setContentType("text/html"); 
PrintWriter pw=res.getWriter();
pw.println("<html><body>");  
pw.println("Hello World");  
pw.println("</body></html>");  
pw.close();
}} 
