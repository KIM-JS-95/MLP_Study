package test;

import utility.AddressDAO;
import utility.AddressDTO;

import java.util.List;

public class AddressTest {
    public static void main(String[] args) {
        AddressDAO dao = new AddressDAO();

        create(dao);
        list(dao);
    }

    private static void list(AddressDAO dao) {
        List<AddressDTO> list = dao.list();
        System.out.println(list.size());

        for(AddressDTO val : list){
            System.out.println(val);
        }
    }

    private static void create(AddressDAO dao) {

    }
}


