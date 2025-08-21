package com.neoteric.ecommerce;

public class LoginService {
    private static final String existingUsername = "user123";
    private static final String existingPassword = "pass123";
    public boolean authenticate(Login login) throws InvalidLoginException {
        if (existingUsername.equals(login.getUsername()) &&
                existingPassword.equals(login.getPassword())) {
            return true;
        } else {
            throw new InvalidLoginException("Invalid username or password");
        }
    }

}

