package currentdatedemo.demo.servlet;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletException;
import java.io.*;
import java.util.Date;

public class CurrentDateDemo implements Servlet{
  public void init(ServletConfig config){
  
  }
  public void service(ServletRequest r,ServletResponse rp) throws ServletException, IOException{
       Date currentDate=new Date();
	   PrintWriter out=rp.getWriter();
	   out.println(currentDate);
  }
  public void destroy(){
  }
  public ServletConfig getServletConfig(){
       return null;
  }
  public String getServletInfo(){
       return null;
  }
}