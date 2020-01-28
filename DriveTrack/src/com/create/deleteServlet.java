package com.create;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/deleteServlet")
public class deleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	

 
	static int cid;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String str = request.getReader().readLine();
		cid = Integer.parseInt(str);
		System.out.println(cid);
		try {
			deleteInDB();
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
}
	
	protected void deleteInDB() throws ClassNotFoundException, SQLException
	{
		Connection con = DaoLayer.getConnection();
		

		PreparedStatement ps = con.prepareStatement("delete from cddata where cid=?");

		System.out.println("In deletedata post");
		ps.setObject(1, cid);

		int status = ps.executeUpdate();
		System.out.println(status);
		
	}
		
	
}
			


