package com.thinking.machines.hr.servlets;
import com.thinking.machines.hr.dl.*;
import com.google.gson.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class ServletOne extends HttpServlet
{
public void doPost(HttpServletRequest request,HttpServletResponse response)
{
try
{
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
}catch(Exception exception)
{
}
}
public void doGet(HttpServletRequest request,HttpServletResponse response)
{
try
{
Gson gson=new Gson();
List<DesignationDTO> designations=new DesignationDAO().getAll();
PrintWriter pw=response.getWriter();
response.setContentType("application/gson");
response.setCharacterEncoding("utf-8");
pw.print(gson.toJson(designations));
}catch(Exception exception)
{
System.out.println(exception.getMessage());
try
{
response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
}catch(Exception e)
{
}
}
}
}