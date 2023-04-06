package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

import dbconnection.Dbconnection;
import dto.ProductDto;

public class ProductDao {
	static Connection conn = Dbconnection.getConnection();
	static PreparedStatement ps;
	static String GET_ALL_PRODUCT_DATA = "select * from products";
	static ResultSet rs;

	public static List<ProductDto> getallproducts() {
		List<ProductDto> prodlist = new ArrayList<ProductDto>();

		try {
			ps = conn.prepareStatement(GET_ALL_PRODUCT_DATA);
			rs = ps.executeQuery();

			while (rs.next()) {
				prodlist.add(
						new ProductDto(rs.getInt("product_id"), rs.getString("product_name"), rs.getString("price"),
								 rs.getString("product_details"), rs.getString("product_addres")));

			}
System.out.println(prodlist);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prodlist;

	}
	
	
	
	
	
}
