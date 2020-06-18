package com.lightbend.futures_test;

import java.io.*;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class App {

    static void  write(UUID id, Object obj)  {


        File file1 = new File("./resources/",id.toString());
            try(
                FileOutputStream fs = new FileOutputStream(file1);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fs);
                )
            {
            objectOutputStream.writeObject(obj);
            }
            catch (IOException e ) {

            }
            finally {

            }
    }
    public static void main(String[] args) throws IOException {

        List<Customer> custArray = Arrays.asList(
                new Customer(UUID.randomUUID(),  "ra1","val","home","409")
                ,new Customer(UUID.randomUUID(), "ra2","val","home","412")
                ,new Customer(UUID.randomUUID(), "ra3","val","home","123")
                ,new Customer(UUID.randomUUID(), "ra4","val","home","409")
                ,new Customer(UUID.randomUUID(), "ra5","val","home","409")
                ,new Customer(UUID.randomUUID(), "ra6","val","home","409")
                ,new Customer(UUID.randomUUID(), "ra7","val","home","409")
                ,new Customer(UUID.randomUUID(), "ra8","val","home","409")
                ,new Customer(UUID.randomUUID(), "ra9","val","home","409")
                ,new Customer(UUID.randomUUID(), "ra10","val","home","409")
                ,new Customer(UUID.randomUUID(), "ra6","val","home","409")
                ,new Customer(UUID.randomUUID(), "ra7","val","home","409")
                ,new Customer(UUID.randomUUID(), "ra8","val","home","409")
                ,new Customer(UUID.randomUUID(), "ra9","val","home","409")
                ,new Customer(UUID.randomUUID(), "ra10","val","home","409")

        );

        custArray.stream().forEach(x -> {
           App.write(x.getId(),x);
        });

        File file_test = new File("./resources/");
        Arrays.stream(file_test.listFiles()).forEach(x -> System.out.println(x));



    }
}
