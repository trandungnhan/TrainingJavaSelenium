package aggregation;

public class Address {
    public String city;
    public String state;
    public String country;
    public String number;

    public Address(String number, String city, String state, String country){
        this.number = number;
        this.city = city;
        this.state = state;
        this.country = country;
    }
    @Override
    public String toString() {
        return "Address{" +
                "Number='" + number + '\'' +
                ", City='" + city + '\'' +
                ", State='" + state + '\'' +
                ", Country='" + country + '\'' +
                '}';
    }
}
