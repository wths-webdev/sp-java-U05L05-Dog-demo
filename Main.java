public class Main {
    public static void main(String[] args) {
        // doggie and pupper have the same info
        Dog doggie = new Dog("Scrappy", 2, false);
        Dog pupper = new Dog("Scrappy", 2, false);
        Dog becky = pupper;

        // prints false, since they do not point to the same location in memory
        System.out.print("doggie == pupper: ");
        System.out.println(doggie == pupper);

        // prints true, since they do point to the same location in memory
        System.out.print("becky == pupper: ");
        System.out.println(becky == pupper);

        // by default prints false, but we want this to print true because they have the same info
        System.out.print("becky.equals(doggie): ");
        System.out.println(becky.equals(doggie));
    }
}
