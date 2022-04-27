package test;

import utility.AddressDAO;
import utility.AddressDTO;

import java.util.Iterator;
import java.util.List;

public class AddressTest {
    public static void main(String[] args) {
        AddressDAO dao = new AddressDAO();

        //create(dao);
        //list(dao);
         read(dao);
        // update(dao);
    }

    private static void update(AddressDAO dao) {
        AddressDTO dto = dao.read(4);
        dto.setAddress("000-0000-0000");
        dto.setAddressnum(000000000);

        if (dao.update(dto)) {
            System.out.println("성공");
        }
    }

    private static void read(AddressDAO dao) {
        int addressnum = 1;
        AddressDTO dto = dao.read(addressnum);
    }


    private static void list(AddressDAO dao) {
        List<AddressDTO> list = dao.list();
        System.out.println(list.size());

        Iterator<AddressDTO> iterator = list.iterator();

        while (iterator.hasNext()) {
            AddressDTO dto = iterator.next();
        }
    }

    private static void create(AddressDAO dao) {

    }
}


