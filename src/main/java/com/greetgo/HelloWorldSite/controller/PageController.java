package com.greetgo.HelloWorldSite.controller;

import com.greetgo.HelloWorldSite.mapper.PageMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@MapperScan("com.greetgo.HelloWorldSite.mapper")
public class PageController {
    @Autowired
    private PageMapper pageMapper;

    @GetMapping("/message")
    public ResponseEntity<Object> send(){
        return ResponseEntity.ok(this.pageMapper.getMessage());
    }

}
