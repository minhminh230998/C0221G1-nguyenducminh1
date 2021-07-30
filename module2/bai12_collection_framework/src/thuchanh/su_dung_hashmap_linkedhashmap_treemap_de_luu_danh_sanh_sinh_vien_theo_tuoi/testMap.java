package thuchanh.su_dung_hashmap_linkedhashmap_treemap_de_luu_danh_sanh_sinh_vien_theo_tuoi;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class testMap {
    public static void main(String[] args) {
        Map<String, Integer> hashmap=new HashMap<>();
        hashmap.put("Minh",22);
        hashmap.put("Dúc",20);
        hashmap.put("Tấn",19);
        hashmap.put("Thúy",25);
        hashmap.put("Tâm",27);
        System.out.println(hashmap+"\n");
        Map<String, Integer> treeMap = new TreeMap<>(hashmap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);
        Map<String,Integer>linkedMap=new LinkedHashMap<>(16, 0.75f, true);
        linkedMap.put("Smith", 30);
        linkedMap.put("Anderson", 31);
        linkedMap.put("Lewis", 29);
        linkedMap.put("Cook", 29);
        System.out.println("\nThe age for " + "Lewis is " + linkedMap.get("Lewis"));
    }
}
