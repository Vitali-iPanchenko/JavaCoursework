package Servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import Interfaces.NewsInterface;

@WebServlet(name = "SearchResultServlet", value = "/SearchResultServlet")
public class SearchResultServlet extends HttpServlet implements NewsInterface {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String word = request.getParameter("word");
        request.getSession().setAttribute("Search", word);
        request.getRequestDispatcher("jsp/SearchResultS.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println(NameNews.keySet());

        for (String s: NameNews.keySet()) {
            if (NameNews.containsKey(s)){
                out.println(NameNews.keys());
            }

            else {
                for (String s1: CategoryNews.keySet()) {
                    if (CategoryNews.containsKey(s1)) {
                        out.println(CategoryNews.keys());
                    }

                    else {
                        for (String s2: ContentNews.keySet()) {
                            if (ContentNews.containsKey(s2)) {
                                out.println(ContentNews.keys());
                            }

                            else {
                                for (String s3: DateNews.keySet()) {
                                    if (DateNews.containsKey(s3)){
                                        out.println(DateNews.keys());
                                    }
                                    else {
                                        out.println("No results");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
