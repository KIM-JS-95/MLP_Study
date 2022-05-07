package test;

import java.util.Date;
import java.util.List;

public class memosTest {
    public static void main(String[] args) {

        MemoDAO dao = new MemoDAO();
        insert(dao); //C
        update(dao); // U
        list(dao); // R
        read(dao); //R

        delete(dao);


    }

    private static void delete(MemoDAO dao) {
        int cnt = 1;
        dao.delete(cnt);
        System.out.println("삭제 되었습니다.");
    }

    private static void update(MemoDAO dao) {
        MemoDTO dto = new MemoDTO(0, "박춘배", "번호가 없습니다.", "1-1-1-1", "3", 10);
        dao.update(dto);
        System.out.println("업데이트 되었습니다.");
    }

    private static void insert(MemoDAO dao) {
        MemoDTO dto = new MemoDTO(0, "박춘배", "번호가", "12", "3", 100);
        dao.create(dto);
        System.out.println("입력 되었습니다.");
    }

    private static void list(MemoDAO dao) {
        List<MemoDTO> list = dao.list();

        //System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            MemoDTO dto = list.get(i);
            p(dto);
            p("---------------");
        }
    }

    private static void read(MemoDAO dao) {
        int no = 6;
        MemoDTO dto = dao.read(no);

        p(dto);
        p("---------------");
    }

    private static void p(MemoDTO dto) {
        p("번호: " + dto.getWname());
        p("이름: " + dto.getTitle());
        p("이메일: " + dto.getContent());
        p("주소: " + dto.getPaawd());
        p("기술: " + dto.getViewcnt());
    }

    private static void p(String s) {
        System.out.println(s);
    }
}
