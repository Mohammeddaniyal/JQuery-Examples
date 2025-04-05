package com.thinking.machines.hr.servlets;
import com.thinking.machines.hr.dl.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class ServletFour extends HttpServlet
{
public void doGet(HttpServletRequest request,HttpServletResponse response)
{
try
{
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
}catch(Exception exception)
{
}
}

public void doPost(HttpServletRequest request,HttpServletResponse response)
{
try
{
String firstName=request.getParameter("firstName");
String lastName=request.getParameter("lastName");
int age=Integer.parseInt(request.getParameter("age"));
PrintWriter pw=response.getWriter();
response.setContentType("text/plain");
pw.print(firstName+","+lastName+","+age);
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