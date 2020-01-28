package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
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

import com.create.Createdrive;
import com.create.DaoLayer;
import com.create.ObjMap;


@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String loginData = request.getReader().readLine();
		System.out.println("Login data : "+loginData);
		
		ObjectMapper om = new ObjectMapper();
		LoginBean login = om.readValue(loginData,LoginBean.class );
		
		System.out.println(login.un+" "+login.pw);
		
		try {
			
			Connection con = DaoLayer.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from loginData where uname=? and pass=? ");
			
			ps.setString(1, login.getUn());
			ps.setString(2, login.getPw());
			
			System.out.println(login.getUn()+" "+login.getPw());
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()==true)
			{
				ArrayList<LoginBean> userdata = new ArrayList<LoginBean>();
				
				LoginBean obj = new LoginBean();
				
				obj.setUn(rs.getString(1));
				obj.setPw(rs.getString(2));
				
				System.out.println(rs.getString(1)+" "+rs.getString(2));
				
				userdata.add(obj);
				
				
//				String User = om.writeValueAsString(userdata);
				String User = om.writeValueAsString("1");
				PrintWriter pw = response.getWriter();
				pw.write(User);
				System.out.println("Credential matched.");
				System.out.println(User);
				
			}
			else
			{
//				String str =om.writeValueAsString("[Login:{un=" + null + ", pw=" + null+"}]");
				String str =om.writeValueAsString("0");
				PrintWriter pw = response.getWriter();
				pw.write(str);
				System.out.println(" Credential doesn't matched. ");
				System.out.println(str);

			}
				
			}
		

		catch (ClassNotFoundException e) {e.printStackTrace();} catch (SQLException e) {e.printStackTrace();}

		
	}
	}
		
