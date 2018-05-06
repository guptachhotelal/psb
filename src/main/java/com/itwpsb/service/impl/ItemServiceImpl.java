package com.itwpsb.service.impl;

import com.itwpsb.model.Item;
import com.itwpsb.repository.ItemRepository;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Repository;
import com.itwpsb.service.ItemService;

@Repository
public class ItemServiceImpl implements ItemService {

    @Resource
    private ItemRepository itemRepository;

    @Override
    public List<Item> findAll() {
        return itemRepository.findAll();
    }

}
