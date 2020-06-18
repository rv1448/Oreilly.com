package com.lightbend.futures_test;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class RelationDataStoreHashMap implements RelationDataStore {
    private static  Map<UUID, Customer> hashmap;
    private RelationDataStoreHashMap(){
        hashmap = new HashMap<UUID, Customer>();
    }

    public static Map<UUID, Customer> getrepo(){
        if(hashmap == null) {new RelationDataStoreHashMap();}
       return  hashmap;
    }
}
