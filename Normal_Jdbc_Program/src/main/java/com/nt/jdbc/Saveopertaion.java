package com.nt.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Saveopertaion {

	public static void main(String[] args) {
		//intialise
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		String sql="SELECT * FROM STUU";
		
		//1.jdbc properties
		String driverclass="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String username="system";
		String password="papu";
		
		try {
			Class.forName(driverclass);
			con=DriverManager.getConnection(url,username,password);
			ps=con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				int id=rs.getInt("STID");
				String name=rs.getString("SNAME");
				String Address=rs.getString("SADDRESS");
				System.out.println(id+"..."+name+"...."+Address);
			}
			
			} catch (SQLException e) {
				e.printStackTrace();
			}
				
		 catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(ps!=null) {
				try {
					ps.close();
				}
				catch (Exception e) {
				}
			}
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	

}
