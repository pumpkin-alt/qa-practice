package org.example;

import java.util.*;

public class CollectionsPractice {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Login");
        list.add("Logout");
        list.add("Cart");
        list.add("Payment");

        System.out.println(list.size());

        System.out.println(list.contains("Cart"));

        for (String name : list){
            System.out.println("Тест: " + name);
        }

        list.remove(0);
        System.out.println(list.size());


        List<String> login = new ArrayList<>();
        login.add("admin");
        login.add("user1");
        login.add("qa");
        login.add("admin");

        Set<String> uniqueLogins = new HashSet<>();

        for(String name : login){
            uniqueLogins.add(name);
        }
        System.out.println(login.size());
        System.out.println(uniqueLogins.size());


        Map<String, String> apiEndPoints = new HashMap<>();
        apiEndPoints.put("login", "/api/v1/login");
        apiEndPoints.put("logout", "/api/v1/logout");
        apiEndPoints.put("users", "/api/v1/users");

        System.out.println(apiEndPoints.get("login"));
        System.out.println(apiEndPoints.containsKey("cart"));
        System.out.println(apiEndPoints.size());

    }
}
