package src.classes_and_objects.practice_problems;

class PhoneNumber {
    String countryCode;
    String phNo;

    PhoneNumber(final String countryCode, final String phNo) {
        this.countryCode = countryCode;
        this.phNo = phNo;
    }

    @Override
    public String toString() {
        return countryCode + "-" + phNo;
    }
}

class Address {
    String street;
    String city;
    String state;
    int pincode;

    public Address(final String street, final String city, final String state, final int pincode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(final String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(final String state) {
        this.state = state;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(final int pincode) {
        this.pincode = pincode;
    }
}

class CustomerAddress {
    Address address; // field dependency
    PhoneNumber phoneNumber; // field dependency

    CustomerAddress(final Address address, final PhoneNumber phone) { // constructor dependency
        this.address = address;
        this.phoneNumber = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(final Address address) { // setter dependency
        this.address = address;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(final PhoneNumber phoneNumber) { // setter dependency
        this.phoneNumber = phoneNumber;
    }
}