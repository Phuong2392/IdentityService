package com.devteria.identityservice.dto.request;

import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserCreationRequest  {
    String id;
    @Size(min = 3, message = "USERNAME_INVALID" )
    String username;
    @Size(min = 3, message = "INVALID_PASSWORD" )
    String password;
    String firstName;
    String lastName;
    LocalDate dob;
}
