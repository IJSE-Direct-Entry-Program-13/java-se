package shared;

import java.io.Serializable;

public class Middle extends Top implements Serializable {
    private int y = 20;

//    public Middle() {
//        System.out.println("Middle() No arg constructor");
//    }

    public Middle(int y) {
        super(y);
        this.y = y;
        System.out.println("Middle()");
    }

    @Override
    public String toString() {
        return "Middle{" +
                "y=" + y +
                '}' + super.toString();
    }
}
