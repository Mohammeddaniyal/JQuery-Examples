package com.thinking.machines.hr.servlets;
import com.thinking.machines.hr.dl.*;
import com.google.gson.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class ServletTwo extends HttpServlet
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
int code=Integer.parseInt(request.getParameter("code"));
Gson gson=new Gson();
PrintWriter pw=response.getWriter();
response.setContentType("application/json");
response.setCharacterEncoding("utf-8");
try
{
DesignationDTO designation=new DesignationDAO().getByCode(code);
pw.print(gson.toJson(designation));
}catch(DAOException daoException)
{
pw.print(gson.toJson("INVALID"));
}
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