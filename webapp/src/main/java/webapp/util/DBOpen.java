package webapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBOpen {

    private static Connection con;

    public static Connection getConnection() {
        try {
            Class.forName(webapp.util.Constant.DRIVER);
            con = DriverManager.getConnection(webapp.util.Constant.URL, webapp.util.Constant.USER, Constant.PASSWD);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return con;
    }
}
