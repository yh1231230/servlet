package test01;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class JDBC {

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet res = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/db_erp_system?useUnicode=true&characterEncoding=utf-8",
                    "root",
                    "");
            String sql = "select * from sh where hw like ?";
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setString(1, "%机%");
            res = pstmt.executeQuery();
            while (res.next()) {
                int a = res.getInt("id");
                String b = res.getString("hw");
                System.out.println(a + "\t" + b);
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (res != null)
                    res.close();
                if (pstmt != null)
                    pstmt.close();
                if (conn != null)
                    conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }
}

