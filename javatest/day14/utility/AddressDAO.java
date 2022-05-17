package utility;

import utility1.DBClose;
import utility1.DBOpen;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AddressDAO {
    public List<AddressDTO> list() {
        List<AddressDTO> list = new ArrayList<>();

        Connection con = utility1.DBOpen.getCon();
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
            utility1.DBClose.close(resultSet, preparedStatement, con);
        }
        return list;
    }

    public boolean delete(int addressnum){
        boolean flag = false;
        Connection con = utility1.DBOpen.getCon();
        PreparedStatement preparedStatement = null;

        StringBuffer sql = new StringBuffer();
        sql.append("delete from address ");
        sql.append("where addressnum = ?");

        try {
            preparedStatement=con.prepareStatement(sql.toString());
            preparedStatement.setInt(1, addressnum);

            int cnt = preparedStatement.executeUpdate();

            if(cnt > 0) flag = true;

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            utility1.DBClose.close(preparedStatement,con);
        }
        return flag;
    }

    public AddressDTO read(int i) {
        Connection con = utility1.DBOpen.getCon();
        PreparedStatement preparedStatement = null;
        AddressDTO dto = null;
        ResultSet rs = null;

        StringBuffer sql = new StringBuffer();
        sql.append("select *");
        sql.append("from javadb.address ");
        sql.append("where addressnum = ? ");

        try {
            preparedStatement = con.prepareStatement(sql.toString());
            preparedStatement.setInt(1, i);
            rs= preparedStatement.executeQuery();

            while(rs.next()) {
                dto=new AddressDTO();
                dto.setAddressnum(rs.getInt("addressnum"));
                dto.setAddress(rs.getString("address"));
                dto.setName(rs.getString("name"));
                dto.setHandphone(rs.getString("handphone"));
            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            utility1.DBClose.close(preparedStatement, con);
        }

        return dto;
    }

    public boolean update(AddressDTO dto){
        boolean flag = false;

        Connection con = DBOpen.getCon();
        PreparedStatement preparedStatement = null;

        StringBuffer sql = new StringBuffer();

        sql.append("update address");
        sql.append("set handphone = ? , ");
        sql.append("addressnum = ? , ");
        sql.append("where addressnum = ?");

        try {
            preparedStatement=con.prepareStatement(sql.toString());
            preparedStatement.setString(1, dto.getHandphone());
            preparedStatement.setString(2, dto.getAddress());
            preparedStatement.setInt(3, dto.getAddressnum());

            int cnt = preparedStatement.executeUpdate();

            if(cnt > 0) flag = true;

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBClose.close(preparedStatement,con);
        }

    return flag;
    }

}
