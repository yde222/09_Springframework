package com.ohgiraffers.chap08jsplecturesource;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/test")
public class HelloServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

    RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/test.jsp");
    dispatcher.forward(request, response);
  }
}