package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

import com.create.DaoLayer;

@WebServlet("/register")
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;

  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String regData = request.getReader().readLine();
		System.out.println("Register data : "+regData);
		
		ObjectMapper om = new ObjectMapper();
		LoginBean reg = om.readValue(regData,LoginBean.class );
		
		System.out.println(reg.un+" "+reg.pw);
		
		try {
			
			Connection con = DaoLayer.getConnection();
			PreparedStatement ps = con.prepareStatement("insert into loginData(uname,pass) values(?,?);");
			
			ps.setString(1, reg.getUn());
			ps.setString(2, reg.getPw());
			
			System.out.println(reg.getUn()+" "+reg.getPw());
			
			int Status = ps.executeUpdate();
			
			if(Status==1)
			{	
//				String User = om.writeValueAsString(userdata);
				String stat = om.writeValueAsString("1");
				PrintWriter pw = response.getWriter();
				pw.write(stat);
				System.out.println("Registered Successfully");
				System.out.println(stat);
				
			}
			else
			{
//				String str =om.writeValueAsString("[Login:{un=" + null + ", pw=" + null+"}]");
				String str =om.writeValueAsString("0");
				PrintWriter pw = response.getWriter();
				pw.write(str);
				System.out.println(" Error in registration. ");
				System.out.println(str);

			}
				
			}
		

		catch (ClassNotFoundException e) {e.printStackTrace();} catch (SQLException e) {e.printStackTrace();}

		
	}
	}
		
