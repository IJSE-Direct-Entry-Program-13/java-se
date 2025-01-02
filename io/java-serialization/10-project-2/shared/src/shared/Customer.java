package shared;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Customer implements Serializable {
    private String id;
    private Name name;
    private String address;

    public Customer(String id, Name name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name=" + name +
                ", address='" + address + '\'' +
                '}';
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.writeObject(id);
        out.writeObject(name.getFirstName());
        out.writeObject(name.getMiddleName());
        out.writeObject(name.getLastName());
        out.writeObject(address);
    }

}
