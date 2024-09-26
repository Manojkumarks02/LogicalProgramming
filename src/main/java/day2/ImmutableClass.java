package day2;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableClass {

    private final String name;
    private final int age;
    private final List<String> hobbies;

    public ImmutableClass(String name, int age, List<String> hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = new ArrayList<>(hobbies);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getHobbies() {
        return new ArrayList<>(hobbies);
    }
}