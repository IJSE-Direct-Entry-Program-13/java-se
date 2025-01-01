package shared;

import java.io.Serializable;

public class Customer implements Serializable {
    private String id;
    private String name;
    private String contact;

    private static final long serialVersionUID = 9181624206737951019L;

    public void doExecute(){}

    public Customer(String id, String name, String contact) {
        System.out.println("Customer()");
        this.id = id;
        this.name = name;
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}
