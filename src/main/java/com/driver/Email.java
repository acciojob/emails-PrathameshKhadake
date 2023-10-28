package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public boolean isContainsUppercase(String newpassword){
        boolean ans = false;
        for(int i = 0; i < newpassword.length(); i++){
            if(newpassword.charAt(i) >= 65 && newpassword.charAt(i) <= 90){
                ans = true;
            }
        }
        return ans;
    }

    public boolean isContainsLowercase(String newpassword){
        boolean ans = false;
        for(int i = 0; i < newpassword.length(); i++){
            if(newpassword.charAt(i) >= 97 && newpassword.charAt(i) <= 122){
                ans = true;
            }
        }
        return ans;
    }

    public boolean isContainsSpecialCharcase(String newpassword){
        boolean ans = false;
        for(int i = 0; i < newpassword.length(); i++){
            if((newpassword.charAt(i) >= 32 && newpassword.charAt(i) <= 47) || (newpassword.charAt(i) >= 58 && newpassword.charAt(i) <= 64) || (newpassword.charAt(i) >= 91 && newpassword.charAt(i) <= 96) || (newpassword.charAt(i) >= 123 && newpassword.charAt(i) <= 126)){
                ans = true;
            }
        }
        return ans;
    }


    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character

        if(oldPassword.equals(password)){
            if(newPassword.length() >= 8){
                if(isContainsUppercase(newPassword)){
                    if(isContainsLowercase(newPassword)){
                        if(isContainsSpecialCharcase(newPassword)){
                            this.password = newPassword;
                        }
                    }
                }
            }
        }

    }
}
