/**
 * Created by lars on 5/23/2017.
 */
public class Test {

    public static void main(String[] args) {
        new Test().mymethod();
    }

    public void mymethod() {
        mymethod2(22);
    }

    public void mymethod2(int a) {
        System.out.println(a);
    }
}
