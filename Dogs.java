class Animal {
    private String name;
    private int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void eat() {
        System.out.println(name + " is eating.");
    }
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
class Dogs extends Animal {
    private String breed;
    public Dogs(String name, int age, String breed) {
        super(name, age); 
        this.breed = breed;
    }
    public void bark() {
        System.out.println(getName() + " the " + breed + " is barking.");
    }
    public static void main(String[] args) {
        Dogs myDog = new Dogs("Max", 3, "Golden Retriever");
        myDog.eat();
        myDog.sleep();
        myDog.bark();
    }
}
