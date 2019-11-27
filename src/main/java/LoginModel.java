import Database.dbConnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class LoginModel {
    private Connection connection;

    LoginModel() {
        try{
            this.connection = dbConnect.getConnection();

        }catch(SQLException ex){
            ex.printStackTrace();
        }
        if(this.connection == null){
            System.exit(1);
        }
    }

    boolean isDBconnected() {
        return this.connection != null;
    }

    public boolean isLogin(String user, String pass, String opt) throws Exception {
        String sql =  "SELECT * FROM users where username = ? and password = ? and division = ?";
        PreparedStatement pr = this.connection.prepareStatement(sql);
        ResultSet rs;
        try{

            pr.setString(1,user);
            pr.setString(2, pass);
            pr.setString(3,opt);

            rs = pr.executeQuery();
            boolean check1;
            while (rs.next()) {
                String username = rs.getString("username");
                String password = rs.getString("password");
                String division = rs.getString("division");
                System.out.format("%s, %s, %s\n", username, password, division);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return false;
    }
}
