package com.create;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/createServlet")
public class createServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Inside doPost method.");
		String requestdata = request.getReader().readLine();
		System.out.println("Angular Data = "+requestdata);
		Createdrive c = (Createdrive) ObjMap.getObjectFromJSON(requestdata, Createdrive.class);
		
		Map<String, String> map = null;
		try
		{
			map = DaoLayer.saveData(c);
		}
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
				

	}

}
