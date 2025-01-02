package shared;

public class Top {
    private int x = 10;

    public Top() {
        System.out.println("Top() No arg constructor");
    }

    public Top(int x) {
        this.x = x;
        System.out.println("Top()");
    }

    @Override
    public String toString() {
        return "Top{" +
                "x=" + x +
                '}';
    }
}
