class Person {
    String name;
    int age;

    Person(String n, int a) {
        this.name = n;
        this.age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class keyword1  {
    public static void main(String[] args) {
        Person p1 = new Person("Saimon", 22);
        p1.display();
    }
}
