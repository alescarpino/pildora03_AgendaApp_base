package org.ulpgc.is1.model;

public class Company extends Contact {
    private String name;
    private String description;
    public Address address;

    public Company(String name, String description,String telephone, String email) {
        super(telephone, email);
        this.name = name;
        this.description = description;
    }
    public String getName() {
        return this.name;
    }
}
