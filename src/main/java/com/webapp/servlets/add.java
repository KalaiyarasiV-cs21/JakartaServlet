package com.webapp.servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class add extends HttpServlet
{
    public void doPost(HttpServletRequest req,HttpServletResponse resp)throws IOException 
    {
        int i=Integer.parseInt(req.getParameter("num1"));
        int j=Integer.parseInt(req.getParameter("num2"));

        int k=i+j;
        resp.getOutputStream().println("the result is "+ k);
    }
} 


