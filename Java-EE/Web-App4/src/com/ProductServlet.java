package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ProductDao;
import com.dao.ProductDaoImpl;
import com.product.model.Product;
import com.product.service.ProductService;
import com.product.service.ProductServiceImpl;

public class ProductServlet extends HttpServlet {
	
	public ProductServlet() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		
		String pid= request.getParameter("prodId");
		String pname=request.getParameter("prodName");
		double price=Double.parseDouble(request.getParameter("price"));
		String desc=request.getParameter("description");
		String store=request.getParameter("storeName");
		//String membership=request.getParameter("membership");
		//String tax[]=request.getParameterValues("tax");
		
		Product prod=new Product();
		prod.setProdId(pid);
		prod.setProdName(pname);
		prod.setPrice(price);
		prod.setStoreName(store);
		prod.setDescription(desc);
		
		
		
		
		
		ProductService prodService=new ProductServiceImpl();
		
		
		boolean status= prodService.saveProduct(prod);
		
		if(status) {
			out.println("<h2>Product Id "+pid+" saved to DB");
		}else {
			out.println("<h2>Product Id "+pid+" Not saved to DB");
		}
	
		
		
		
		out.println("<h2><a href='Form.html'>Add Another  Record</a>");
		

	}
	
	
}
