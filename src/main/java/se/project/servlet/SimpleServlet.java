package se.project.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/simple-servlet")
public class SimpleServlet extends HttpServlet {
    protected void doGet (HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.println("Hello this is the first web page");

    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException,IOException
    {

    }
}
