package webapp.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static webapp.utility.Constant.*;

public class DBOpen {

    private static Connection con;

    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL, USER, PASSWD);
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }

        return con;
    }
}
