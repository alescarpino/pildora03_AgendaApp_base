package org.ulpgc.is1.model;

public class Person extends Contact {
    private String firstName;
    private String lastName;
    public Address address;

    public Person(String firstName, String lastName,String telephone, String email) {
        super(telephone, email);
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getName(){
        return firstName + " " + lastName;
    }

}
