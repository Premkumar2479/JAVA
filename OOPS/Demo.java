class Demo {
    int a = 10;
    String b = "Nick";

    void show() {   // method names should start with lowercase
        System.out.println(a + " " + b);
    }
}

public class Text {
    public static void main(String[] args) {
        Demo r = new Demo();
        r.show();
    }
}
