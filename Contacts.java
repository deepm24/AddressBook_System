package org.example;

public class Contacts {
    private String firstName;
    private String lastnames;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String email;
    public Contacts next;
    //////////////  Set methods  //////////////////

    public void setFirstName(String firstname) {
        this.firstName = firstname;
    }

    public void setLastNames(String lastnames) {
        this.lastnames = lastnames;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /////////////////  get methods  ///////////////////
    public String getFirstName() {
        return firstName;
    }

    public String getLastNames() {
        return lastnames;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }
}

class InsertInformation {
    public Contacts head;

    InsertInformation()
    {
        head = null;
    }

    public void insertData(String firstName, String lastName, String address, String city, String state, String email, String zip, String phoneNumber) {
        Contacts contacts = new Contacts();

        contacts.setFirstName(firstName);
        contacts.setLastNames(lastName);
        contacts.setAddress(address);
        contacts.setCity(city);
        contacts.setState(state);
        contacts.setEmail(email);
        contacts.setZip(zip);
        contacts.setPhoneNumber(phoneNumber);

        if (head == null) {
            head = contacts;
        } else {
            Contacts temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = contacts;

        }
    }

    public void display() {
        Contacts temp = head;
        int counter = 0;
        System.out.println("-------------------Display Contacts----------------------");
        while (temp != null) {
            ++counter;
            System.out.println("--**--- Display " + counter + " Person in Address Book --**---");
            System.out.println(" First name :" + temp.getFirstName());
            System.out.println(" Last name  :" + temp.getLastNames());
            System.out.println(" Address    :" + temp.getAddress());
            System.out.println(" City       :" + temp.getCity());
            System.out.println(" State      :" + temp.getState());
            System.out.println(" Email ID   :" + temp.getEmail());
            System.out.println(" Zip        :" + temp.getZip());
            System.out.println(" Phone no   :" + temp.getPhoneNumber());

            temp = temp.next;
        }
    }
}
