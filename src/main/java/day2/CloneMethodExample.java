package day2;

class Person implements Cloneable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public Person clone() {
        try {
            return (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clone not support exception", e);
        }
    }

    public void display() {
        System.out.println(name + " " + age);
    }
}

public class CloneMethodExample {

    public static void main(String[] args) {
        Person person1 = new Person("Manoj", 1);
        Person person2 = person1.clone();
        person1.display();
        person2.display();
    }
}
