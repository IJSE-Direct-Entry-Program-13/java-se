package shared;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Customer implements Serializable {
    private String id;
    private transient Name name;
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
        out.defaultWriteObject();
        //out.writeObject(id);
        out.writeObject(name.getFirstName());
        out.writeObject(name.getMiddleName());
        out.writeObject(name.getLastName());
        //out.writeObject(address);
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        //this.id = (String) in.readObject();
        String firstName = (String) in.readObject();
        String middleName = (String) in.readObject();
        String lastName = (String) in.readObject();
        this.name = new Name(firstName, middleName, lastName);
        //this.address = (String) in.readObject();
    }

}
