package ch07;

public class CaptionTv extends Tv {
    boolean caption;
    void displayCaption(String test) {
        if(caption) {
            System.out.println(test);
        }
    }
}
