package com.tykhonchuk;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

    private final String userName = "user";
    private final String userPass = "user_pass";

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("username");
        String pass = request.getParameter("userpass");

        if(isRegistered(name, pass)){
            out.print("Welcome, " + name);
        }
        else{
            out.print("I'm sorry, username or password is not correct :(");
            RequestDispatcher rd=request.getRequestDispatcher("index.html");
            rd.include(request,response);
        }
        out.close();
    }

    private Boolean isRegistered(String name, String pass)
    {
        return userPass.equals(pass) && userName.equals(name);
    }

}  