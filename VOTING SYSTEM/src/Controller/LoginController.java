package Controller;

import Database.DatabaseConnection;
import Model.LoginModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginController {

    public boolean authenticate(LoginModel loginModel) {
        Connection conn = DatabaseConnection.getConnection();
        String sql = "SELECT * FROM voteraccsinfotb WHERE email = ? AND password = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, loginModel.getEmail());
            stmt.setString(2, loginModel.getPassword());
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {               
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
