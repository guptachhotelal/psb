package com.itwpsb.repository;

import com.itwpsb.model.Item;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {
    List<Item> findAll();
}
