public class SuggestDAO{
    public int getCount(String keyword){
        int count =0;
        Connection con = DBOpen.getCon();
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;

        StringBuffer sql = new StringBuffer();
        sql.append("select COUNT(sqlquery) from sugget");
        sql.append(" where sqlquery like '"+%keyword+"%' ");

        try {
            preparedStatement = con.prepareStatement(sql.toString());
            rs = preparedStatement.executeQuery();

            while (rs.next()) {
                // dto = new SuggestDTO();
                // dto.setMemono(rs.getInt("memono"));
                count =rs.getInt("cnt"); // 수량 산출
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            DBClose.close(rs, preparedStatement, con);
        }

        return count;
    }

    public List<SuggestDTO> getsqlquery(keyword){
        List<SuggestDTO> list = new ArrayList<>();

        Connection con = DBOpen.getCon();
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;

        StringBuffer sql = new StringBuffer();
        sql.append("select * from sugget");
        sql.append(" where sqlquery like '"+%keyword+"%' ");


        try {

            preparedStatement = con.prepareStatement(sql.toString());
            rs = preparedStatement.executeQuery();

            while (rs.next()) {
                SuggestDTO dto = new SuggestDTO();
                dto.setsqlquery = rs.getsqlquery();

                list.add(dto);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            DBClose.close(rs, preparedStatement, con);
        }

        return list
    }


}