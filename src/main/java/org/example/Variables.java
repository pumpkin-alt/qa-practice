package org.example;

public class Variables {
    public static void main(String[] args){
        String targetUrl = "https://my-test-site.com";
        int expectedStatusCode = 200;
        boolean isUserLoggedIn = false;
        double testDurationSeconds = 4.5;

        System.out.println(targetUrl);
        System.out.println(expectedStatusCode);
        System.out.println(isUserLoggedIn);
        System.out.println(testDurationSeconds);
    }
}
