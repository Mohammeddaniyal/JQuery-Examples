package com.thinking.machines.hr.servlets;
import com.thinking.machines.hr.dl.*;
import com.google.gson.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class ServletThree extends HttpServlet
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
BufferedReader br=request.getReader();
StringBuffer sb=new StringBuffer();
String d;
while(true)
{
d=br.readLine();
if(d==null)break;
sb.append(d);
}
String rawData=sb.toString();
Gson gson=new Gson();
Customer customer=gson.fromJson(rawData,Customer.class);
PrintWriter pw=response.getWriter();
response.setContentType("application/json");
response.setCharacterEncoding("utf-8");
pw.print(gson.toJson(customer));
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