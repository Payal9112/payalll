import java.io.*;
import javax.servlet.*;
public class s2 extends HttpServlet {
public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
{
response.setContentType("text/html");
String a= request.getParameter("t1");
PrintWriter out= response.getWriter();
out.print("<br>Your Name is: "+a);
}
}
