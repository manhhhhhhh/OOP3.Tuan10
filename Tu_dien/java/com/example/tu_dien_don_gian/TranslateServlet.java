package com.example.tu_dien_don_gian;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(value = "/translate")
public class TranslateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("computer","máy tính");
        dictionary.put("computer mouse","chuột máy tính");
        dictionary.put("keyboard","máy tính");
        dictionary.put("phone","điện thoại");
        dictionary.put("earphone","tai nghe");
        String search = req.getParameter("txtSearch");
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        String rs = dictionary.get(search);
        if (rs != null){
            writer.println("Word : " + search);
            writer.println("Result : " + rs);
        }else {
            writer.println("Not found");
        }
        writer.println("<html>");
    }
}

