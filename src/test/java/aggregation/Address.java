package aggregation;

import java.util.Objects;

public class Address {
    public String city;
    public String state;
    public String country;
    public String number;

    public Address(){

    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;
        Address address = (Address) o;
        return Objects.equals(city, address.city)
                && Objects.equals(state, address.state)
                && Objects.equals(country, address.country)
                && Objects.equals(number, address.number);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
