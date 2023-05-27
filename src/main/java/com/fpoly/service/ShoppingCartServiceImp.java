package com.fpoly.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import com.fpoly.model.DB;
import com.fpoly.model.Item;

@SessionScope
@Service
public class ShoppingCartServiceImp implements ShoppingCartService {

    Map<Integer, Item> map = new HashMap<>();

    @Override
    public Item add(Integer id) {
        Item item = DB.items.get(id);
        map.put(id, item);
        return item;
    }

    @Override
    public void remove(Integer id) {
        map.remove(id);
    }

    @Override
    public Item update(Integer id, int qty) {
        map.get(id).setQty(qty);
        return map.get(id);
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public Collection<Item> getItems() {
        return map.values();
    }

    @Override
    public int getCount() {
        return map.size();
    }

    @Override
    public double getAmount() {
        double amount = 0;
        for (Item item : map.values()) {
            amount += item.getPrice() * item.getQty();
        }
        return amount;
    }
    
}
