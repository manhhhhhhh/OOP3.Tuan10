package com.example.chuyen_doi_tien_te;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/convert")
public class CurrencyConversion extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        float usd = Float.parseFloat(req.getParameter("usd"));
        float vnd = 23000 * usd;

        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<h1>" + vnd +"</h1>");
        writer.println("</html>");
    }
}