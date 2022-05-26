package webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/addr")
public class addrcontroller {

    @GetMapping("/createAddForm")
    public String createForm(){
        return "createAddForm";
    }

    @GetMapping("/addlist")
    public String list(){
        return "addlist";
    }

}
