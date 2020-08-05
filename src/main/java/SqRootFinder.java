import static java.lang.Math.*;

public class SqRootFinder {
    private int a;
    private int b;
    private int c;
    private int root1;
    private int root2;

    public SqRootFinder(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String solve() {
        double D = pow(b,2) - (4 * a * c); //disk
        if (D < 0) return "Вещественных корней нет";
        root1 = (int) (-b + sqrt(D)) / (2 * a);
        root2 = (int) (-b - sqrt(D)) / (2 * a);
        return String.valueOf(root1) + "," + String.valueOf(root2);
    }
}
