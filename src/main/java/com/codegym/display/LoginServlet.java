package com.codegym.display;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String message = "<form method=\"post\" action=\"/success\">\n" +
                "    <div style=\"border: 1px solid black; width: 230px; height: 180px\" >\n" +
                "        <h2>LOGIN</h2>\n" +
                "        <input type=\"text\" name=\"username\" placeholder=\"username\"><br>\n" +
                "        <input type=\"text\" name=\"password\" placeholder=\"password\"><br>\n" +
                "        <button type=\"submit\">Sign in</button>\n" +
                "    </div>\n" +
                "</form>";
        resp.getOutputStream().println(message);
        resp.setContentType("text/html");
    }
}