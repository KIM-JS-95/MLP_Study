package test;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookTest {

    public static void main(String[] args) {

        BookDAO dao = new BookDAO();

        //list(dao);
        //create(dao);
        //read(dao);
        //update(dao);

        delete(dao);

    }


    private static void update(BookDAO dao) {
        BookDTO dto = new BookDTO(1,"JDBC Pro", "김철수", "Jaen.kr",300000, "");

        if(dao.update(dto)){
            System.out.println("수정되었습니다.");
        }else {
            System.out.println("수정에 실패하셨습니다.");
        }
    }

    private static void read(BookDAO dao) {
        BookDTO dto = dao.read(1);
        p(dto);
        p("---------------");
    }

    private static void list(BookDAO dao) {
        List<BookDTO> list = dao.list();
        for (int i = 0; i < list.size(); i++) {
            BookDTO dto = list.get(i);
            p(dto);
            p("---------------");
        }
    }

    private static void create(BookDAO dao) {
        BookDTO dto = new BookDTO(0,"JDBC Pro", "김철수", "Jaen.kr",23000, "");
        if(dao.create(dto)){
            System.out.println("저장되었습니다.");
        }else {
            System.out.println("저장에 실패하셨습니다.");
        }

    }

    private static void delete(BookDAO dao) {
        int isbn = 1;
        if(dao.delete(isbn)){
            System.out.println("삭제되었습니다.");
        }else {
            System.out.println("삭제에 실패하셨습니다.");
        }
    }

    private static void p(BookDTO dto) {
        p("isbn: " + dto.getIsbn());
        p("title: " + dto.getTitle());
        p("author: " + dto.getAuthor());
        p("publisher: " + dto.getPublisher());
        p("price: " + dto.getPrice());
        p("desc: " + dto.getDesc());
        p("publish_date: " + dto.getPublish_date());
    }

    private static void p(String s) {
        System.out.println(s);
    }
}
