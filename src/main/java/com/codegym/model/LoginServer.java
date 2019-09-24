package com.codegym.model;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServer extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String message ="";
        if("admin".equals(username) && "admin".equals(password)) {
            message=("<h1>Welcome "+username+" to website</h1>");
        } else{
            message=("<h1>Login Error</h1>");
        }
        resp.getOutputStream().println(message);
    }
}
