package shared;

import java.io.Serializable;

public class Bottom extends Middle {
    private int z = 30;

    public Bottom(int z) {
        super(z);
        this.z = z;
        System.out.println("Bottom()");
    }

    @Override
    public String toString() {
        return "Bottom{" +
                "z=" + z +
                '}' + super.toString();
    }
}
