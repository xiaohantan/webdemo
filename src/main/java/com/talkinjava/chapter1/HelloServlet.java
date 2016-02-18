package com.talkinjava.chapter1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by ivantan on 16/2/18.
 */
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        req.setAttribute("currentTime", time);
        req.getRequestDispatcher("/jsp/hello.jsp").forward(req, resp);
    }
}