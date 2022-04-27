package team;

import java.util.ArrayList;
import java.util.List;

public class TeamTest {
    public static void main(String[] args) {

        TeamDAO dao = new TeamDAO();
        // list(dao);
        // read(dao);
         insert(dao);

    }

    private static void insert(TeamDAO dao) {
        TeamDTO dto = new TeamDTO("3", "3", "3", "3", "아프리카");

        dao.create(dto);
    }

    private static void list(TeamDAO dao) {
        List<TeamDTO> list = dao.list();

        //System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            TeamDTO dto = list.get(i);
            p(dto);
            p("---------------");
        }
    }

    private static void read(TeamDAO dao){
        int no =2;
        TeamDTO dto=dao.read(no);

        p(dto);
        p("---------------");
    }

    private static void p(TeamDTO dto) {
        p("번호: " + dto.getPhone());
        p("이름: " + dto.getName());
        p("이메일: " + dto.getEmail());
        p("주소: " + dto.getAddress());
        p("기술: " + dto.getSkills());
    }

    private static void p(String s) {
        System.out.println(s);
    }
}
