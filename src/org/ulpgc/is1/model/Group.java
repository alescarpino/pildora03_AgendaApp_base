package org.ulpgc.is1.model;

import java.util.ArrayList;

public class Group {
    private String name;
    private ArrayList<Contact> contacts;

    public  Group(String name) {
        this.name = name;
        contacts = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void addContact(Contact c) {
        contacts.add(c);
    }
    public void removeContact(int i ) {
        contacts.remove(i);
    }

    public String contactCount() {
        return "";
    }
}