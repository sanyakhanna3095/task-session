package com.cg.webpagesform.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public @Data class User {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String city;
    private String country;
}
