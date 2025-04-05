package com.thinking.machines.hr.servlets;
import com.thinking.machines.hr.dl.*;
import com.google.gson.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class ServletFive extends HttpServlet
{
    public void doGet(HttpServletRequest request,HttpServletResponse response)
    {

    }
    public void doPost(HttpServletRequest request,HttpServletResponse response)
    {
        try
        {
        System.out.println("POST without data request received...");
        PrintWriter pw=response.getWriter();
        response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");
        pw.println("{\"message\":\"POST SUCCESS\"}");
        }catch(Exception exception)
        {
            try
            {
                response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            }catch(Exception e)
            {
            }
        }
    }
}