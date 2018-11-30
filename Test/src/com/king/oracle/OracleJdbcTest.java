package com.king.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.king.file.FileTest;
/**
 * jdbc连接数据库步骤：
 * 1、加载驱动程序：Class.forName("oracle.jdbc.driver.OracleDriver")
 * 2、获取数据库连接：Drivermanager.getConnection(url,username,password)//url = "jdbc.oracle:thin:@//localhost:1521/orcl"
 * 3、操作数据库，执行sql语句，conn.getPrepareStatement(sql) conn.createStatement()
 * 4、处理数据库的返回结果(使用ResultSet类) while(rs.next()){rs.getString("name")}
 * 5、关闭结果集rs.close()、关闭statement pstm.close()、关闭连接conn.close()
 * 
 * prepareStatement与statement的区别：preparestatement可以使用占位符，是预编译的，批处理笔statement效率高
 * 关系是：prepareStatement继承自statement，两者都是接口
 * @author OneKing
 *
 */
public class OracleJdbcTest {
    //数据库连接对象
    private static Connection conn = null;
     
    private static String driver = "oracle.jdbc.driver.OracleDriver"; //驱动
     
    private static String url = "jdbc:oracle:thin:@//localhost:1521/orcl"; //连接字符串
     
    private static String username = "scott"; //用户名
     
    private static String password = "scott"; //密码
    
     
     
    // 获得连接对象
    private static synchronized Connection getConn(){
        if(conn == null){
            try {
                Class.forName(driver);
                conn = DriverManager.getConnection(url, username, password);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return conn;
    }
     
    //执行查询语句
    public void query(String sql, boolean isSelect) throws SQLException{
        PreparedStatement pstmt;
         
        try {
            pstmt = getConn().prepareStatement(sql);
            //建立一个结果集，用来保存查询出来的结果
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                String name = rs.getString("ename");
                System.out.println(name);
            }
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
     
    public void query(String sql) throws SQLException{
        PreparedStatement pstmt;
        pstmt = getConn().prepareStatement(sql);
        pstmt.execute();
        pstmt.close();
    }
     
     
    //关闭连接
    public void close(){
        try {
            getConn().close();
             
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
    	PreparedStatement ps;
    	ResultSet rs;
    	List<Employee> empList = new ArrayList<Employee>();
    	try {
			ps = getConn().prepareStatement("select * from emp");
			rs = ps.executeQuery();
			System.out.println("查询emp表内容");
			System.out.println("查询后开始进行循环结果集");
			while(rs.next()){
				Employee emp = new Employee();
				emp.setEmpno(rs.getInt("empno"));
				emp.setEname(rs.getString("ename"));
				emp.setJob(rs.getString("job"));
				emp.setMgr(rs.getInt("mgr"));
				emp.setHiredate(rs.getString("hiredate"));
				emp.setSal(rs.getDouble("sal"));
				emp.setComm(rs.getDouble("comm"));
				emp.setDeptno(rs.getInt("deptno"));
				empList.add(emp);
			}
			System.out.println("结果集循环处理完毕，全部放到了list中");
			System.out.println("总共查询到的记录数为：" + empList.size());
			if(rs != null){
				rs.close();
				System.out.println("关闭结果集");
			}
			if(ps != null){
				ps.close();
				System.out.println("关闭statement");
			}
			getConn().close();
			System.out.println("关闭数据库连接");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	System.out.println("开始将emp表内容输出到D:\\baby\\emp.txt中");
    	StringBuffer line = new StringBuffer();
    	line.append("the count of emp is：").append(empList.size()).append("\n");
    	line.append("empno|ename|job|mgr|hiredate|sal|comm|deptno").append("\n");
    	for(Employee emp : empList){
    		line.append(emp.getEmpno()).append("|");
    		line.append(emp.getEname()).append("|");
    		line.append(emp.getJob()).append("|");
    		line.append(emp.getMgr()).append("|");
    		line.append(emp.getHiredate()).append("|");
    		line.append(emp.getSal()).append("|");
    		line.append(emp.getComm()).append("|");
    		line.append(emp.getDeptno()).append("|").append("\n");
    	}
    	System.out.println("循环将emp内容拼成一个stringBuffer，内容如下：" + "\n" + line.toString());
    	String fileName = "D:\\baby\\emp.txt";
    	FileTest.createFile(fileName);
    	System.out.println("创建文件：D:\\baby\\emp.txt");
    	FileTest.wirteFile(fileName, line.toString());
    	System.out.println("写入文件内容，流程结束");
	}
     
}