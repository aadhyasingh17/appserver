package com.quinnox.bankwebservoce;
import java.sql.*;
import java.util.*;

public class studentrepository 
{
	public List<student> getAllStudentDetails() throws Exception
	{
		
		 Connection con = studentdatabaseconnectivity.getConnection();
		 String query = "SELECT * FROM student";
		 Statement st =  con.createStatement();
		 ResultSet rs =  st.executeQuery(query);
		 
		 List<student> detail = new ArrayList<student>();
		 
		 while(rs.next())
		 {
			 student hb = new student();
			 
			 hb.setID(rs.getInt("ID"));
			 hb.setName(rs.getString("Name"));
			 hb.setAge(rs.getInt("Age"));
			 hb.setCollege(rs.getString("College"));
			 
			 detail.add(hb);

			 
		 }
			
		return detail;	
	}
	
	public void insertAccountDetail(student hb) throws Exception

	{
		Connection con = studentdatabaseconnectivity.getConnection();
		String query = "INSERT INTO student VALUES(?, ?, ?, ?)";
		PreparedStatement ps =  con.prepareStatement(query);
		
		ps.setInt(1, hb.getID());
		ps.setString(2, hb.getName());
		ps.setInt(3, hb.getAge());

		ps.setString(4, hb.getCollege());
		
		ps.executeUpdate();

	}

	public List<student> getStudentdetailID(int id) throws Exception
	{
		Connection con = studentdatabaseconnectivity.getConnection();
		String query =  "Select * From student WHERE ID ="+id;
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		List<student> detail = new ArrayList<student>();

		
		while(rs.next())
		 {
			 student hb = new student();
			 
			 hb.setID(rs.getInt("ID"));
			 hb.setName(rs.getString("Name"));
			 hb.setAge(rs.getInt("Age"));
			 hb.setCollege(rs.getString("College"));
			 
			 detail.add(hb);
		 }
			
		return detail;	
	}
	
	public void updateID(int id, student hb) throws Exception
	{
		Connection con = studentdatabaseconnectivity.getConnection();		
		String queryUpdate = "update student set ID=?, Name = ?, Age=?, College=? where ID="+id;
		PreparedStatement ps =  con.prepareStatement(queryUpdate);
		
		ps.setInt(1, hb.getID());
		ps.setString(2, hb.getName());
		ps.setInt(3, hb.getAge());
		ps.setString(4, hb.getCollege());
		
		ps.executeUpdate();

	}
	
	public String deleteID(int id) throws Exception
	{
		Connection con = studentdatabaseconnectivity.getConnection();		
		String queryUpdate = "delete from student where ID = " +id;
		PreparedStatement ps =  con.prepareStatement(queryUpdate);
		ps.executeUpdate();

		return "Student Deleted";
	}


	

	

	

}
