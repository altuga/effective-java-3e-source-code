package effectivejava.chapter2.item8.question;

// Ill-behaved client of resource with cleaner safety-net (Page 33)
public class Teenager {
    public static void main(String[] args) {
        new Room(99);
        System.out.println("Peace out");

    }
}
