package com.karthi.SchoolApplication.Model;


import lombok.Data;

@Data
public class Contact {


    private String name;
    private String MobileNum;
    private String email;
    private String subject;
    private String message;

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", MobileNum='" + MobileNum + '\'' +
                ", email='" + email + '\'' +
                ", subject='" + subject + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
