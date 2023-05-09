package org.launchcode.spaday.models;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {
        @NotNull(message= "You must select a username")
        @Size(min = 5, max = 15)
        private String username;

        @Email(message = "Please provide a valid Email address.")
        private String email;
        @NotNull(message ="You must select a password at least six digits long.")
        @Size(min = 6)
        private String password;
        @NotNull(message= "Passwords do not match.")
        private String verifyPassword;

        public User() {

        }

        public User(String username, String email, String password) {
            this();
            this.username = username;
            this.email = email;
            this.password = password;
        }

        public String getUsername() {
            return username;
        }

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
        checkPassword();
    }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
            checkPassword();
        }

        private void checkPassword(){
            if (password != null && verifyPassword != null){
                if (!password.equals(verifyPassword)){
                    verifyPassword = null;
                }
            }

        }
    }
