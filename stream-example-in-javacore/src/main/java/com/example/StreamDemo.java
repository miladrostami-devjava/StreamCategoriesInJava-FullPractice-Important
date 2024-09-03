package com.example;


import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {

        User user1 = new User("ali",16,"ali17@gmail.com");
        User user2 = new User("milad",33,"miladrostami24@gmail.com");
        User user3 = new User("hasan",22,"hasan@gmail.com");
        User user4 = new User("reza",18,"reza@gmail.com");
        User user5 = new User("elmira",18,"elmira@gmail.com");
        User user6 = new User("shabnam",54,"shabnam@gmail.com");
        User user7 = new User("pedram",17,"pedram@gmail.com");
        User user8 = new User("sara",19,"sara@gmail.com");
        User user9 = new User("alireza",65,"alireza@gmail.com");
        User user10 = new User("hidar",45,"hidar@gmail.com");
List<User> users = List.of(user1,user2,user3,user4,user5,user6,user7,user8,user9,user10);

        //  Filtering users by age (over 18 years old)
        List<User> adultUsers = users.stream()
                .filter(user -> user.getAge()>18)
                .collect(Collectors.toList());
        System.out.println("User older than 18 is :");
        adultUsers.forEach(System.out::println);

        // Get a list of email addresses of users who are over 18 years old
List<String> adultEmails = users.stream()
        .filter(user -> user.getAge() > 18)
        .map(User::getEmail)
        .collect(Collectors.toList());
        System.out.println("\n Emails of users older 18 year is :");
        adultEmails.forEach(System.out::println);

//  Find the user with the most age
        User maxUserAge = users.stream()
                .max(Comparator.comparingInt(User::getAge))
                .orElse(null);
        System.out.println("oldest user:");
        System.out.println(maxUserAge);

        //  Checking the presence of users under 18 years old
        boolean isHasUnderAgeUser = users.stream()
                .anyMatch(user -> user.getAge() <18);
        System.out.println("\n is there any user under 18 age?");
        System.out.println(isHasUnderAgeUser);

        // Calculate the average age of users
        OptionalDouble averageAgeUser = users.stream()
                .mapToInt(User::getAge)
                .average();
        System.out.println("the average user age is :");
averageAgeUser.ifPresent(System.out::println);


    }
}