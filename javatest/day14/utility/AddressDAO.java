package utility;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AddressDAO {
    public List<AddressDTO> list() {
        List<AddressDTO> list = new ArrayList<>();

        Connection con = DBOpen.getCon();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        StringBuilder sql = new StringBuilder();
        sql.append("Select addressnum, name, handphone, address ");
        sql.append("from address ");
        sql.append("order by name desc");

        try {
            preparedStatement = con.prepareStatement(sql.toString());
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                AddressDTO dto = new AddressDTO();
                dto.setAddressnum(resultSet.getInt("addressnum"));
                dto.setName(resultSet.getString("name"));
                dto.setAddress(resultSet.getString("handphone"));
                dto.setAddress(resultSet.getString("address"));

                list.add(dto);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            DBClose.close(resultSet, preparedStatement, con);
        }
        return list;
    }
}
