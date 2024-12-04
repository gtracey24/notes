package com.notes.notes.models.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.antlr.v4.runtime.misc.NotNull;

public class LoginFormDTO {

    @NotNull
    @NotBlank
    @Size(min = 5, max = 15, message = "Username must be between 5-15 characters")
    private String username;

    @NotNull
    @NotBlank
    @Size(min = 5, max = 15, message = "Password must be between 5-15 characters")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
