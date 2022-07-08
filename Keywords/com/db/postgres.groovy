package com.db


import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.SQLException
import java.sql.Statement
import java.sql.*
import org.postgresql.Driver
import org.postgresql.jdbc.PgResultSet
import internal.GlobalVariable
import org.postgresql.jdbc.PgStatement
import org.postgresql.jdbc.PgConnection
import com.kms.katalon.core.annotation.Keyword

public class postgres {

	private static PgConnection connection = null

	@Keyword
	////////connect to database ///////
	def connectDB(String url, String dbname, String username , String password) {

		//load driver class for specific database type
		String conn = "jdbc:postgresql://"+ url +"/" + dbname
		if(connection != null && !connection.isClosed()) {
			connection.close()
		}
		connection=DriverManager.getConnection(conn,username,password)
		return connection

	}
	@Keyword
	////////Executeing Query//////
	def executeQuery(String queryString)
	{
		Statement stm= connection.createStatement()
		ResultSet resultSet= stm.executeQuery (queryString)
		ResultSetMetaData metadata= resultSet.getMetaData()
		int columnCount =metadata.getColumnCount()
		LinkedList<List<String>> rowList = new LinkedList<List<String>>()
		while(resultSet.next())
		{
			List<String> row = new LinkedList<>()
			for (int i=1;i<columnCount;i++)
			{
				Object value= resultSet.getObject(i)
				row.add(value)
			}
			rowList.add(row)
		}
		for(List<String> row: rowList)
		{
			for(String data:row)
			{
				System.out.print(data + " ")
			}
			return rowList
		}

	}
	@Keyword
	////////////closing the connection///////////
	def closeDatabaseConnection()
	{
		if(connection !=null && !connection.isClosed())
		{
			connection.close()
		}
		connection = null
	}


}

