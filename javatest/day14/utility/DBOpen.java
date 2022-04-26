package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBOpen {

    private static Connection con;

    public static Connection getCon() {
        try {
            Class.forName(Constant.DRIVER);
            con = DriverManager.getConnection(Constant.URL, Constant.USER, Constant.PASSWD);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return con;
    }
}
