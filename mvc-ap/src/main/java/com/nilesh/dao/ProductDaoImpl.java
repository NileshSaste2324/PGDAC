package com.nilesh.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.nilesh.conn.MyConnection;
import com.nilesh.entity.Product;

public class ProductDaoImpl implements ProductDao {
	private MyConnection myConn;

	public ProductDaoImpl() {
		myConn = new MyConnection();
	}
	@Override
	public void save(Product product) {
		
		try {
			Connection con = myConn.getConn();
			
			PreparedStatement s= con.prepareStatement("insert into product(name,price,category,mdate) values(?,?,?,?)");
			s.setString(1, product.getName());
			s.setFloat(2, product.getPrice());
			s.setString(3, product.getCategory());
			s.setString(4, product.getMdate());
			int i= s.executeUpdate();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}
	

}
