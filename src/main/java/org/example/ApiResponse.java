package org.example;

import lombok.*;

@AllArgsConstructor
//@Data
public class ApiResponse {
    int statusCode;
    String body;
    boolean isSuccess;

    public static void main(String[] args) {

        ApiResponse response1 = new ApiResponse(200, "yea", true);
        ApiResponse response2 = new ApiResponse(200, "yea", true);

        response1.toString();
        System.out.println(response1);

    }

}
@Data
@Builder
 class TestUser {
    String name;
    String email;
    int age;
    String role;

    public static void main(String[] args) {
TestUser user = TestUser.builder()
        .name("Ivan")
        .email("ivan@mail.ru")
        .role("admin")
        .build();

    }
}


