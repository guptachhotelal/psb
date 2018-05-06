package com.itwpsb.controller;

import com.itwpsb.model.Item;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.itwpsb.service.ItemService;

@RestController
@RequestMapping(value = {"/item"})
public class ItemController {
    
    @Resource
    private ItemService itemRepositoryService;
    
    @GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<Item>> items(HttpServletRequest request) {
        return ResponseEntity.status(HttpStatus.OK).body(itemRepositoryService.findAll());
    }
    
}
