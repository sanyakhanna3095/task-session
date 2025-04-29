package com.cg.webpagesform.controller;


import com.cg.webpagesform.model.User;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet({"/page1", "/page2", "/page3"})
public class Page1 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session=request.getSession();
        User userData = (User) session.getAttribute("userData");
        if (userData == null) {
            userData = new User();
        }

        switch (request.getServletPath()){
            case "/page1":
                userData.setFirstName(request.getParameter("firstName"));
                userData.setLastName(request.getParameter("lastName"));
                session.setAttribute("userData", userData);
                response.sendRedirect("/page2.html");
                break;

            case "/page2":
                userData.setEmail(request.getParameter("email"));
                userData.setPhone(request.getParameter("phone"));
                session.setAttribute("userData", userData);
                response.sendRedirect("/page3.html");
                break;

            case "/page3":
                userData.setCity(request.getParameter("city"));
                userData.setCountry(request.getParameter("country"));
                session.setAttribute("userData", userData);
                response.sendRedirect("/page4.html");
                break;
        }
    }
}
