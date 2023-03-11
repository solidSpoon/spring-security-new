
package xyz.solidspoon.springsecuritynew.auth;

import lombok.*;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class RegisterRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String password;

}
