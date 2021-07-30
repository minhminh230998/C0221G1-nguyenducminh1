package com.example.service.impl;

import com.example.service.IDictionaryService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service
public class DictionaryService implements IDictionaryService {
    @Override
    public String dictionary(String key) {
        Map<String,String> dictionary=new HashMap<>();
        dictionary.put("go","di");
        dictionary.put("dictionary","tu dien");
        dictionary.put("convert","chuyen doi");
        return dictionary.get(key);
    }
}
