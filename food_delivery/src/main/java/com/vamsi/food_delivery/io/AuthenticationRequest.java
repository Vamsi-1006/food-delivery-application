package com.vamsi.food_delivery.io;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class AuthenticationRequest {
    private String email;
    private String password;
}
