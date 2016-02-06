/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.inheritancev1;

/**
 *
 * @author joshua.gross
 */
public class Person {
    
    private String firstName;
    private String middleName;
    private String lastName;
    private String ssn;

    //private Date dateOfBirth;

    public Person(String firstName, String middleName, String lastName, String ssn) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSsn() {
        return ssn;
    }
    
    
    
    
}
