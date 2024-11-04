package com.arguig.hotelio.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * @author arguig
 */
@Data
public class LoginRequest {
    @NotBlank
    private String email;
    @NotBlank
    private String password;
}
