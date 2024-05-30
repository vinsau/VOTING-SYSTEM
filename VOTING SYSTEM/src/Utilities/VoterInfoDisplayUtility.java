package Utilities;

import Database.DatabaseConnection;
import Model.VoterModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VoterInfoDisplayUtility {

    public static VoterModel getVoterInfo(String email) {
        Connection conn = DatabaseConnection.getConnection();
        String sql = "SELECT * FROM voteraccsinfotb WHERE email = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, email);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new VoterModel(
                    rs.getString("email"),
                    rs.getString("fullName"),
                    rs.getString("gender"),
                    rs.getString("citizenship"),
                    rs.getString("civilStatus"),
                    rs.getDate("dob").toLocalDate(),
                    rs.getString("address"),
                    rs.getString("security_question"),
                    rs.getString("security_answer")
                    
                );
            } else {
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
