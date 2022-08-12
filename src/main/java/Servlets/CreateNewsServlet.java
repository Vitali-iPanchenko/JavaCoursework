package Servlets;

import Classes.News;
import Classes.User;
import Interfaces.NewsInterface;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import Interfaces.UserInterface;

@WebServlet(name = "CreateNewsServlet", value = "/CreateNewsServlet")
public class CreateNewsServlet extends HttpServlet implements NewsInterface, UserInterface {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("Name");
        String content = request.getParameter("Content");
        String category = request.getParameter("Category");
        String date = request.getParameter("Date");

        News news = new News("" + name, "" + content, "" + category, "" + date);

        AllNews.add(news);

    CategoryNews.put(category, news);
    NameNews.put(name, news);
    ContentNews.put(content, news);
    DateNews.put(date, news);

//    request.getServletContext().setAttribute("news", "" + news);
//    request.getServletContext().setAttribute("name", "" + name);
//    request.getServletContext().setAttribute("content", "" + content);

        out.println("something");

//    request.setAttribute("date", "as" + date);
    request.setAttribute("name", "Tom");
    getServletContext().getRequestDispatcher("/CreateNewsS.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
