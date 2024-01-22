package com.io.account.domain;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Data
public class Account {
    private String Id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
}
