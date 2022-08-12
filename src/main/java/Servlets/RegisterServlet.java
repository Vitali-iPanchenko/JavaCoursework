package Servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import Interfaces.UserInterface;
import Classes.User;

@WebServlet(name = "RegisterServlet", value = "/RegisterServlet")
public class RegisterServlet extends HttpServlet implements UserInterface{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

//        EmailName.put(Admin.email, Admin.name);
//        EmailPass.put(Admin.email, Admin.pass);

        String name = request.getParameter("UserName");
        String email = request.getParameter("UserEmail");
        String pass = request.getParameter("UserPass");
        String passRep = request.getParameter("UserPassRep");


        User user = new User("" + name, "" + email,
                "" + pass, false);

        out.println("<html>");
        out.println("<body class='bg'>");
        out.println("<link rel='stylesheet' type='text/css' href ='style.css'/>");
//        out.println("<div class='split left'></div>");
//        out.println("<div style='text-align: center;'>");

        if (EmailName.containsKey(user.email) || EmailPass.containsValue(user.name)) {
            out.println("This user already exists");

        } else if (user.pass.length() < 8) {
            out.println("<h1>" + "Password must contain 8+ symbols" + "</h1>");

        } else if (!user.pass.equals(passRep)) {
            out.println("Passwords must match");

        } else if (user.name.length() == 0) {
            out.println("Name Must Be At Least 1 Character Long");

        } else if (user.email.length() < 5) {
            out.println("No Such Email");

        } else {
            out.println("Registered successfully");
            EmailName.put(user.email, user.name);
            EmailPass.put(user.email, user.pass);
        }
//        out.println("</div>");
//        out.println("<div class='split right'></div>");
        out.println("</body>");
        out.println("</html>");

        cookie(request, response);
    }

    public void cookie(HttpServletRequest request, HttpServletResponse response){
        Cookie cookiePass = new Cookie("Email", request.getParameter("UserEmail"));
        Cookie cookieName = new Cookie("Name", request.getParameter("UserName"));

        cookiePass.setMaxAge(24 * 60 * 60);
        cookieName.setMaxAge(24 * 60 * 60);

        response.addCookie(cookiePass);
        response.addCookie(cookieName);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
