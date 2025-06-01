package ch06;

public class CallStackTest {
    public static void main(String[] args) {
        firstMethod();
    }

    static void firstMethod() {
        secondmethod();
    }

    static void secondmethod() {
        System.out.println("secondMethod");
    }
}
