/**
 * Created by brittmo on 12/16/16.
 */

import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {
    private List<Ad> ads;

    @Override
    public List<Ad> all() {
        ads = new ArrayList<>();

        try {
            DriverManager.registerDriver(new Driver());
            Connection connection = DriverManager.getConnection(Config.getUrl(), Config.getUser(), Config.getPassword());
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM ads;");
            while(rs.next()){
                Ad ad = new Ad(rs.getLong("user_id"), rs.getString("title"), rs.getString("description"));
                ads.add(ad);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ads;
    }

        @Override
    public Long insert(Ad ad) {
        String string = "INSERT INTO ads(user_id, title, description) VALUES(" + ad.getUserId() + ",'" + ad.getTitle() + "' , '" + ad.getDescription() + "' );";

        try {
            DriverManager.registerDriver(new Driver());
            Connection connection = DriverManager.getConnection(Config.getUrl(), Config.getUser(), Config.getPassword());
            Statement stmt = connection.createStatement();
            stmt.execute(string);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
