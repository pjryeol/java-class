package ch06;

import java.sql.SQLOutput;

public class CallStatckTest2 {
    public static void main(String[] args) {
        System.out.println("main(String[] args)이 시작되었음");
        firstMethod();
        System.out.println("main(String[] args)이 종료됨");
    }

    private static void firstMethod() {
        System.out.println("firstMethod()가 시작되었음");
        secondMethod();
        System.out.println("firstMethod()가 종료됨");
    }

    private static void secondMethod() {
        System.out.println("secondMethod()가 시작되었음");
        System.out.println("secondMethod()가 종료됨");
    }
}
