package Servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import Interfaces.UserInterface;
import Classes.User;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet implements  UserInterface{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();


        String email=request.getParameter("UserEmail");
        String pass=request.getParameter("UserPass");
        String name=request.getParameter("UserName");

        EmailName.put(Admin.email, Admin.name);
        EmailPass.put(Admin.email, Admin.pass);

        User user = new User("" + name, "" + email, "" + pass, false);

        if (EmailName.containsKey(user.email)) {
            if (EmailPass.containsValue(user.pass) && pass.equals(user.pass))
                out.println("Welcome!");
            else
                out.println("Wrong Password");
        } else {
            out.println("No Such User");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
