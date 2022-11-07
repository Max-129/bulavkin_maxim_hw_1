import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone(20, 30, new Memory(128), "fourteen");
        Iphone14 iphone14 = new Iphone14(20, 30, new Memory(512), "fourteen", 20, Color.WHITE);
        Iphone14 iphone14_1 = new Iphone14(26, 40, new Memory(128), "fourteen", 15, Color.BLACK);
        iphone.method();
        iphone.method("first");
        iphone14.method();
        iphone14_1.method();
        System.out.println(iphone.getInfo());
        System.out.println(iphone14.getInfo());
        System.out.println(iphone14_1.getInfo());
    }
}