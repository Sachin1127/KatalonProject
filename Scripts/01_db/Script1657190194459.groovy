import java.sql.ResultSetMetaData as ResultSetMetaData
import org.postgresql.jdbc.PgResultSet as PgResultSet
import internal.GlobalVariable as GlobalVariable


String dburl = url

String dbname = 'ERP_TESTING'

String username = username

String password = password

//connect to database
CustomKeywords.'com.db.postgres.connectDB'(dburl, dbname, username, password)

//Execute Query
String selectData = 'Select * from hrms."tbl_leave_balance"'

List<List> rowList = CustomKeywords.'com.db.postgres.executeQuery'(selectData)

//Display Result
println(('------The table data is -' + rowList.get(0).get(1)) + '-------------------------')
println(('------The table data is -' + rowList.get(1).get(1)) + '-------------------------')


//Disconnect
CustomKeywords.'com.db.postgres.closeDatabaseConnection'()

