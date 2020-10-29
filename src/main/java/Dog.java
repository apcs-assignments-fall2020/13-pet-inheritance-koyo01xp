public class Dog extends Pet {
    // Instance variable(s)
    private String breed;

    // Constructors
    public Dog(String a, int b, String c) {
        super(a,b);
        this.breed = c;
    }

    public Dog() {
        super("Bob",3);
        this.breed = "poodle";
    }    
    // makeNoise() method
    public void makeNoise() {
        System.out.println("Woof-Woof");
    }

    // toString method
    public String toString() {
        String str = "Name: " + this.getName() + ", Age: " + this.getAge() + ", Breed: " + this.breed;
        return str;
    }

    // Getter
    public String getBreed() {
        return this.breed;
    }

    // Setter
    public void setBreed(String breed) {
        this.breed = breed; 
    }
}