package ddt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class CRUD_Db {
	
	public static void main(String[] args) throws Exception{
		
		Driver d= new Driver();
		
		//to register connection
		DriverManager.registerDriver(d);
		//to establish connection
		Connection con = DriverManager.getConnection("jdbc:mysql://49.249.29.4:3307/ninza_hrm", "root@%", "root");
		
		Statement st = con.createStatement();
		
		//execute create database,table : RT is boolean
		st.execute("create table ADBC4(name VARCHAR(20));");
		st.execute("insert into ADBC4 values('asd');");
		boolean status=st.execute("select * from ADBC4;");
		if (status==true)
			System.out.println("table created");
		else
			System.out.println("table not created");
		
		//2. excuteQuery
		//2.1 reading data from db
		//ResultSet will store data in tabular format
		//executequery read data from database: RT resultset<I> indexing will start from 1
		ResultSet set= st.executeQuery("select * from project;");
		while(set.next()) {
		System.out.println("PID:"+set.getString(1)+"PName:"+set.getString(2)+"created_by:"+set.getString(3)+"project_name:"+set.getString(4)+"status:"+set.getString(5)+"team_size"+set.getString(6));
		}
		//executeupdate manipulation activities on present data : RT boolean successful 1,Rejected -ve value
		
		int result = st.executeUpdate(
			    "INSERT INTO ADBC4('NH_Proj_0902','Joseph','02/09/2026','TekPyramid','created','37')"
			);
		
		System.out.println("Result"+result);
		
		
		
		
		con.close();
	}

}
