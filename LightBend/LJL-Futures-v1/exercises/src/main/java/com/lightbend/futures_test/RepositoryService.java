package com.lightbend.futures_test;


import java.util.Optional;
import java.util.UUID;

public interface RepositoryService {
    Optional<UUID> add(Customer customer);
    Optional<Customer> get(UUID id);
    void getAll();
}
