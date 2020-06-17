package com.lightbend.futures_test;

import java.io.Serializable;
import java.util.*;

public class Customer implements Serializable {

    private final UUID id;
    private final String firstName;
    private final String lastName;
    private final String address;
    private final String phoneNumber;


    public Customer(UUID id, String firstName, String lastName, String address, String phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id.equals(customer.id) &&
                firstName.equals(customer.firstName) &&
                lastName.equals(customer.lastName) &&
                address.equals(customer.address) &&
                phoneNumber.equals(customer.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, address, phoneNumber);
    }

    public UUID getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Customer cust1 = new Customer(UUID.randomUUID(),"rahul","vangala","buckwheat","409");
        Customer cust2 = new Customer(UUID.randomUUID(),"rl","va","buckwheat","409");
       RepositoryServiceImpl repoimpl =  new RepositoryServiceImpl();
       RepositoryServiceImpl repoimpl2 =  new RepositoryServiceImpl();
        List<Optional<UUID>> list = new ArrayList<>();

       list.add(repoimpl.add(cust1));
        list.add(repoimpl2.add(cust2));
        repoimpl.getAll();

        System.out.println(repoimpl.get(list.get(0).get()));

    }
}
