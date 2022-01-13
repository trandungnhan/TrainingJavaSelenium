package inheriance;

import aggregation.Address;

import java.util.Objects;

public class Employee1 {
    public int id;
    public String name;
    public Address address;

    public Employee1(){}

    public Employee1(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee1)) return false;
        Employee1 employee1 = (Employee1) o;
        return id == employee1.id
                && Objects.equals(name, employee1.name)
                && Objects.equals(address, employee1.address);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

