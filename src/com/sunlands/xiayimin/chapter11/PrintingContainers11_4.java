package com.sunlands.xiayimin.chapter11;
import java.util.*;


/**
 * Created by sunlandsxym on 2017/7/2.
 */
public class PrintingContainers11_4 {
    static Collection fill(Collection<String> collection){
        collection.add("rat");
        collection.add("cat");
        collection.add("dog");
        collection.add("dog");
        return collection;
    }
    static Map fill(Map<String,String> map){
        map.put("rat","Fuzzy");
        map.put("cat","Rags");
        map.put("dog","Bosco");
        map.put("dog","Spot");
        return map;
    }
    public static void main(String[] args){
        System.out.print(fill(new ArrayList<String>()));
        System.out.println();
        System.out.print(fill(new LinkedList<String>()));
        System.out.println();


        System.out.print(fill(new HashSet<String>()));
        System.out.println();
        System.out.print(fill(new TreeSet<String>()));
        System.out.println();
        System.out.print(fill(new LinkedHashSet<String>()));
        System.out.println();

        System.out.print(fill(new HashMap<String, String>()));
        System.out.println();
        System.out.print(fill(new TreeMap<String, String>()));
        System.out.println();
        System.out.print(fill(new LinkedHashMap<String, String>()));
        System.out.println();

    }
}
