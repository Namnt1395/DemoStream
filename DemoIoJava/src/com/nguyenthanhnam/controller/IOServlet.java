package com.nguyenthanhnam.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nguyenthanhnam.model.MSinhVien;

/**
 * Servlet implementation class IOServlet
 */
@WebServlet("/IOServlet")
public class IOServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public IOServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		MSinhVien mSinhVien = new MSinhVien();
		String ten=request.getParameter("ten");
		String ngaySinh=request.getParameter("ngaysinh");
		String toan=request.getParameter("toan");
		String van=request.getParameter("van");
		String ly=request.getParameter("ly");
		mSinhVien.writeFile(ten, ngaySinh, toan,ly,van);
		response.sendRedirect("WEB-INF/index.jsp");
	}

}
