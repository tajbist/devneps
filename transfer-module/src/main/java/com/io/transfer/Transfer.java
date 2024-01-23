package com.io.transfer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/money/v1")
public class Transfer {
    @GetMapping("/transfer")
    public String submit(){
        return "Transfer Successful";
    }

    @GetMapping("/transfer/{id}")
    public String submit(@PathVariable("id") String id){
        return "Transfer Successful" +id;
    }
}
