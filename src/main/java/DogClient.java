public class DogClient {
    public static void main(String[] args) {
        Pet a = new Pet();
        System.out.println(a);

        Pet b = new Dog("Bob",3,"poodle");
        System.out.println(b);
    }
}