package com.lightbend.futures_test;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class RelationStoreHashMap implements RelationStore {
    private static  Map<UUID, Customer> hashmap;
    private RelationStoreHashMap(){
        hashmap = new HashMap<UUID, Customer>();
    }

    public static Map<UUID, Customer> getrepo(){
        if(hashmap == null) {new RelationStoreHashMap();}
       return  hashmap;
    }
}
