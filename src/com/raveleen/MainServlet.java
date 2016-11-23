package com.raveleen;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MainServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String surname = req.getParameter("surname");
        String email = req.getParameter("email");
        String city = req.getParameter("city");
        int country = Integer.parseInt(req.getParameter("country"));
        int gender = Integer.parseInt(req.getParameter("gender"));

        DataBase.add(new PersonalInfo(name, surname, email, city, country, gender));

        req.getRequestDispatcher("statistics.jsp").forward(req, resp);
    }
}
