package com.example.tao_trang_wed_dang_nhap;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet( value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        if ("admin".equals(username) && "admin".equals(password)){
            writer.println("<h1>Welcome " + username + "to website</h1>");
        }else {
            writer.println("<h1>Login Error</h1>");
        }
        writer.println("</html>");
    }
}