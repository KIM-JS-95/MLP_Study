package team;

import team.*;
import java.util.List;

public class TeamTest {
    public static void main(String[] args) {

        TeamDAO dao = new TeamDAO();
        //insert(dao); //C
        //update(dao); // U
        //list(dao); // R
        // read(dao); //R

        delete(dao);


    }

    private static void delete(TeamDAO dao) {
        int cnt = 1;
        dao.delete(cnt);
        System.out.println("삭제 되었습니다.");
    }

    private static void update(TeamDAO dao) {
        TeamDTO dto = new TeamDTO("따거", "3", "3", "3", "중국");
        dao.update(dto);
        System.out.println("업데이트 되었습니다.");
    }

    private static void insert(TeamDAO dao) {
        TeamDTO dto = new TeamDTO("박춘배", "번호가 없습니다.", "1-1-1-1", "3", "평양");
        dao.create(dto);
        System.out.println("입력 되었습니다.");
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
