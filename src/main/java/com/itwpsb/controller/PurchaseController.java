package com.itwpsb.controller;

import com.itwpsb.model.Category;
import com.itwpsb.model.Product;
import com.itwpsb.model.Purchase;
import com.itwpsb.model.Unit;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = {"/buy"})
public class PurchaseController {

    @PostMapping(produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public ResponseEntity<List<Purchase>> purchase(HttpServletRequest request) {
        return null;
    }

    @GetMapping(produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public ResponseEntity<List<Purchase>> purchaseGet(HttpServletRequest request) {
        List<Purchase> purchases = new ArrayList<>();
        Purchase purchase = new Purchase();
        purchase.setId(1);
        Product p = new Product();
        p.setId(1);
        p.setName("HCl");
        p.setCategory(Category.CHEMICAL.getCategory());
        p.setDescription("");
        purchase.setProduct(p);
        purchase.setUnit(Unit.LITRES.getUnit());
        purchase.setRate(100);
        purchase.setQuantity(10);
        purchase.setAmount(10 * 100);
        purchases.add(purchase);

        purchase = new Purchase();
        purchase.setId(1);
        p = new Product();
        p.setId(1);
        p.setName("NaCl");
        p.setCategory(Category.CHEMICAL.getCategory());
        p.setDescription("");
        purchase.setProduct(p);
        purchase.setUnit(Unit.KILOGRAM.getUnit());
        purchase.setRate(150);
        purchase.setQuantity(10);
        purchase.setAmount(10 * 150);
        purchases.add(purchase);
        
        purchase = new Purchase();
        purchase.setId(1);
        p = new Product();
        p.setId(1);
        p.setName("Water");
        p.setCategory(Category.CHEMICAL.getCategory());
        p.setDescription("");
        purchase.setProduct(p);
        purchase.setUnit(Unit.KILOGRAM.getUnit());
        purchase.setRate(10);
        purchase.setQuantity(10);
        purchase.setAmount(10 * 10);
        purchases.add(purchase);

        return ResponseEntity.status(HttpStatus.OK).body(purchases);
    }
}
