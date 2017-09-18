package com.product.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.product.model.User;

public class UserDaoImpl implements UserDao {

	/* (non-Javadoc)
	 * @see com.product.dao.UserDao#valiidateUser(com.product.model.User)
	 */
	@Override
	public boolean valiidateUser(User user) {

		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		boolean flag=false;
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:mphasis","scott","tiger");
			String qry="select * from login where (user_id=? AND pwd=?)";
			ps=con.prepareStatement(qry);
			ps.setString(1, user.getUserName());
			ps.setString(2, user.getPassword());
			
			rs=ps.executeQuery();
			if(rs.next()) {
				flag=true;
			}
			
			
		} catch (Exception e) {
			System.out.println("-- Failed due to "+e);
			e.printStackTrace();
		}
		
		return flag;
		
	}

}
