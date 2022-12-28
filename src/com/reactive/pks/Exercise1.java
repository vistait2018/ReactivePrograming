
package com.reactive.pks;

import java.util.Optional;

public class Exercise1 {

    public static void main(String[] args) {

        // Use StreamSources.intNumbersStream() and StreamSources.userStream()

        // Print all numbers in the intNumbersStream stream
        // TODO: Write code here
       // StreamSources.intNumbersStream().forEach(System.out::println);
        // Print numbers from intNumbersStream that are less than 5
        // TODO: Write code here
        System.out.println("=========================================");
        System.out.println("Print numbers from intNumbersStream that are less than 5");
       StreamSources.intNumbersStream()
                .filter(p -> p<5)
                        .forEach(System.out::println);
        System.out.println("=========================================");
        System.out.println("******************************************");
        System.out.println("=========================================");
        // Print the second and third numbers in intNumbersStream that's greater than 5
        // TODO: Write code here
        System.out.println("=========================================");
        System.out.println("Print the first number in intNumbersStream that's greater than 5.");
       StreamSources.intNumbersStream().skip(1)
                .limit(2)
               .forEach(System.out::println);
        System.out.println("=========================================");
        System.out.println("******************************************");
        System.out.println("=========================================");
        //  Print the first number in intNumbersStream that's greater than 5.
        //  If nothing is found, print -1
        // TODO: Write code here

        System.out.println("=========================================");
        System.out.println("Print the first number in intNumbersStream that's greater than 5.");
        Optional<Integer> num = Optional.of(StreamSources.intNumbersStream()
                .filter(n -> n > 5)
                .findFirst()
                .orElse(-1));

        System.out.println(num.get());
        System.out.println("=========================================");
        System.out.println("******************************************");
        System.out.println("=========================================");
        // Print first names of all users in userStream
        // TODO: Write code here
        System.out.println("=========================================");
        System.out.println("Print first names of all users in userStream");

        StreamSources.userStream().forEach(System.out::println);
        System.out.println("=========================================");
        System.out.println("******************************************");
        System.out.println("=========================================");
        // Print first names in userStream for users that have IDs from number stream
        // TODO: Write code here

        System.out.println("=========================================");
        System.out.println("Print first names in userStream for users that have IDs from number stream");
        StreamSources.userStream()
                .filter(user -> StreamSources.intNumbersStream().anyMatch( num -> num == user.getId() ))
                .forEach(System.out::println);
        System.out.println("=========================================");
        System.out.println("******************************************");
        System.out.println("=========================================");
        System.out.println("=========================================");

    }

}
