package com.insurance.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.insurance.dao.model.Rider;
import com.insurance.dao.model.RiderDAOImpl;

/**
 * Servlet implementation class RiderServletController
 */
@WebServlet("/RiderServletController")
public class RiderServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RiderServletController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		List<Rider> riderDetails = new ArrayList<Rider>();
		riderDetails = new RiderDAOImpl().getAllRider();
		out.println(riderDetails);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ridername = request.getParameter("riderName");
		double premiunIntrest = Double.parseDouble(request.getParameter("premiumIntrest"));
		PrintWriter out=response.getWriter();
		Rider rider=new Rider(ridername, premiunIntrest);
		if(new RiderDAOImpl().addRider(rider))
			out.println("Rider Added Succefully");
		else
			out.println("Failed To add");
		doGet(request, response);
	}

}
