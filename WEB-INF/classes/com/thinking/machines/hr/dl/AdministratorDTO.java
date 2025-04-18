package com.thinking.machines.hr.dl;
public class AdministratorDTO implements java.io.Serializable,Comparable<AdministratorDTO>
{
private String username;
private String password;
public AdministratorDTO()
{
this.username="";
this.password="";
}
public void setUsername(String username)
{
this.username=username;
}
public void setPassword(String password)
{
this.password=password;
}
public String getUsername()
{
return username;
}
public String getPassword()
{
return password;
}
public boolean equals(Object object)
{
if(! (object instanceof AdministratorDTO)) return false;
AdministratorDTO other=(AdministratorDTO)object;
return this.username.equals(other.username);
}
public int compareTo(AdministratorDTO other)
{
return this.username.compareToIgnoreCase(other.username);
}
public int hashCode()
{
return this.username.hashCode();
}

}