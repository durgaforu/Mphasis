package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.product.model.Product;

public class ProductDaoImpl implements ProductDao {

	@Override
	public boolean saveProduct(Product prod) {

		Connection con=null;
		PreparedStatement ps=null;
		boolean flag = true;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:mphasis", "scott", "tiger");
			String qry = "insert into product values(?,?,?,?,?)";
			ps = con.prepareStatement(qry);

			ps.setString(1, prod.getProdId());
			ps.setString(2, prod.getProdName());
			ps.setDouble(4, prod.getPrice());
			ps.setString(3, prod.getStoreName());
			ps.setString(5, prod.getDescription());

			int x = ps.executeUpdate();

			if (x == 0)
				flag = false;
		} catch (Exception e) {

			e.printStackTrace();

		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return flag;

	}

}
