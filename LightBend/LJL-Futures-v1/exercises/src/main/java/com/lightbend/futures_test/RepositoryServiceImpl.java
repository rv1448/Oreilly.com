package com.lightbend.futures_test;

import java.util.*;

public class RepositoryServiceImpl implements RepositoryService {
    private static final Map<UUID, Customer> repo = RelationDataStoreHashMap.getrepo();


    @Override
    public Optional<UUID> add(Customer customer) {
        repo.put(customer.getId(),customer);
        return Optional.of(customer.getId());
    }

    @Override
    public Optional<Customer> get(UUID id) {
        return  Optional.of(repo.getOrDefault(id,null));
    }
    @Override
    public void getAll(){
        System.out.println(repo.toString());
    }

}
