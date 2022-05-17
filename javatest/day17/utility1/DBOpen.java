package utility1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBOpen {

    private static Connection con;

    public static Connection getCon() {
        try {
            Class.forName(utility1.Constant.DRIVER);
            con = DriverManager.getConnection(utility1.Constant.URL, utility1.Constant.USER, Constant.PASSWD);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return con;
    }
}
