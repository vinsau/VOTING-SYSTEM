package Controller;

import Database.DatabaseConnection;
import Model.LoginModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginController {

    public boolean authenticate(LoginModel loginModel) {
        String query = "SELECT * FROM voteraccsinfotb WHERE email = ? AND password = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, loginModel.getEmail());
            stmt.setString(2, loginModel.getPassword());

            ResultSet rs = stmt.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
