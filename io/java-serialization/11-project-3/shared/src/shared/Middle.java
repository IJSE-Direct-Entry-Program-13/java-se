package shared;

public class Middle extends Top{
    private int y = 20;

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
