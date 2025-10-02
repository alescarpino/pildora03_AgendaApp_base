package org.ulpgc.is1.model;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Person> personList;
    private ArrayList<Group> groupList;
    private ArrayList<Company> companyList;

    public Agenda (){
        personList = new ArrayList<>();
        groupList = new ArrayList<>();
        companyList = new ArrayList<>();
    }
    public void addPerson(String n, String l, String tel, String em,String st,int ca, int num,String city) {
        Person p = new Person(n,l,em,tel);
        Address a = new Address(st,ca,num,city);
        p.address = a;
        personList.add(p);
    }
    public void addCompany(String n, String des, String tel, String em,String st,int ca, int num,String city) {
        Company c = new Company(n,des,tel,em);
        Address a  = new Address(st,ca,num,city);
        c.address = a;
        companyList.add(c);
    }
    public void addGroup(String n) {
        Group g = new Group(n);
    }
    public void addCompany(Company c) {
        companyList.add(c);
    }
    public ArrayList<Contact> getContactList(){
        return
    }
    public ArrayList<Group> getGroupList(){
        return groupList;
    }

    public String contactCount() {
        int i = personList.size() + companyList.size() + groupList.size();
        return String.valueOf(i);

        }
    }
}