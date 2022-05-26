package webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/bbs")
public class bbscontroller {

    @GetMapping("/createForm")
    public String createForm(){
        return "createForm";
    }

    @GetMapping("/createProc")
    public String createProc(){
        return "createProc";
    }

    @GetMapping("/list")
    public String list(){
        return "list";
    }

    @GetMapping("/replyForm")
    public String replyForm(){
        return "replyForm";
    }

    @GetMapping("/updateForm")
    public String updateForm(@RequestParam("bbsno") Integer id){
        return "updateForm";
    }

    @GetMapping("/deleteProc")
    public String delete(@RequestParam("bbsno") Integer id){
        System.out.println();
        return "deleteProc";
    }

    @GetMapping("/read")
    public String read(@RequestParam("bbsno") Integer id){
        return "read";
    }


}
