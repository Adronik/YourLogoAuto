package utils;

public class User {

    private String firstName;
    private String lastName;
    private String password;
    private String address;
    private String city;
    private String state;
    private String postcode;
    private String mobileNum;


    public User(String firstName, String lastName, String password, String address, String city, String state, String postcode, String mobileNum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.address = address;
        this.city = city;
        this.state = state;
        this.postcode = postcode;
        this.mobileNum = mobileNum;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
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

    public String getPostcode() {
        return postcode;
    }

    public String getMobileNum() {
        return mobileNum;
    }

}
