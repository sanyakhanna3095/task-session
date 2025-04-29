package com.cg.webpagesform.servlet;

import com.cg.webpagesform.model.User;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/getUserData")

public class GetUserData extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        //to tell frontend that response will be in JSON format
        res.setContentType("application/json");

        //we set it to false, so that no new session is created in case of no existence. It will simply give null
        HttpSession session = req.getSession(false);
        User userData = (User) session.getAttribute("userData");

        if (userData != null) {
            String json = new com.google.gson.Gson().toJson(userData);
            res.getWriter().write(json);
        }
        else {
            res.setStatus(HttpServletResponse.SC_NO_CONTENT);
        }
    }
}
