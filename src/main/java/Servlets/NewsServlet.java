package Servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import Classes.News;
import Interfaces.NewsInterface;


@WebServlet(name = "NewsServlet", value = "/NewsServlet")
public class NewsServlet extends HttpServlet implements NewsInterface {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        //PrintWriter out = response.getWriter();

        News news1 = new News("Dynamo Kyiv wins...", "President ...", "Sport", "08.05.21");
        News news2 = new News("Rivne`s zoo is closed...", "aslallasl", "Animals", "08.05.21");
        News news3 = new News("Election 2020", "aslalsldfals ", "Politics", "08.05.21");
        News news4 = new News("Scientists shock us again.. ", "sasflkm", "Science", "13.05.2021");
        News news5 = new News("KPI is opened again...", "asfk", "Education", "13.05.2021");

        String sam = "sss";

        //Adding to newslist
        AllNews.add(news1); AllNews.add(news2); AllNews.add(news3); AllNews.add(news4); AllNews.add(news5);

//        request.setAttribute("AllNews", AllNews);
        response.sendRedirect("NewsS.jsp?name=pes");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//    response.setContentType("text/html");
    //PrintWriter out = response.getWriter();

//    News news1 = new News("Dynamo Kyiv wins...", "President ...", "Sport", "08.05.21");
//    News news2 = new News("Rivne`s zoo is closed...", "aslallasl", "Animals", "08.05.21");
//    News news3 = new News("Election 2020", "aslalsldfals ", "Politics", "08.05.21");
//    News news4 = new News("Scientists shock us again.. ", "sasflkm", "Science", "13.05.2021");
//    News news5 = new News("KPI is opened again...", "asfk", "Education", "13.05.2021");

    //Adding to newslist
    //AllNews.add(news1); AllNews.add(news2); AllNews.add(news3); AllNews.add(news4); AllNews.add(news5);

    //Adding to namenews hashtable

//    NameNews.put(news1.name, news1);
//    NameNews.put(news2.name, news2);
//    NameNews.put(news3.name, news3);
//    NameNews.put(news4.name, news4);
//    NameNews.put(news5.name, news5);

    //Adding to contentnews

//    ContentNews.put(news1.content, news1);
//    ContentNews.put(news2.content, news2);
//    ContentNews.put(news3.content, news3);
//    ContentNews.put(news4.content, news4);
//    ContentNews.put(news5.content, news5);

    //categorynews

//    CategoryNews.put(news1.category, news1);
//    CategoryNews.put(news2.category, news2);
//    CategoryNews.put(news3.category, news3);
//    CategoryNews.put(news4.category, news4);
//    CategoryNews.put(news5.category, news5);

    //datenews

//    DateNews.put(news1.date, news1);
//    DateNews.put(news2.date, news2);
//    DateNews.put(news3.date, news3);
//    DateNews.put(news4.date, news4);
//    DateNews.put(news5.date, news5);

//    request.setAttribute("AllNews", AllNews);
//    request.getRequestDispatcher("NewsS.jsp").forward(request, response);
    }
}

