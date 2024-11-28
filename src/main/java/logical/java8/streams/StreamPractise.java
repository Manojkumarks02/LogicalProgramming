package logical.java8.streams;


import java.util.Arrays;
import java.util.List;

public class StreamPractise {

    private int age;
    private String name;
    private double salary;

    public StreamPractise(String name, int age, double salary){
        this.salary = salary;
        this.age = age;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setId(int age){
        this.age=age;
    }

    public double getSalary(){
        return salary;
    }
    public void setSalary(){
        this.salary=salary;
    }


    public static void main(String[] args) {

        List<StreamPractise> list = Arrays.asList(new StreamPractise("manoj", 21, 500000),
                new StreamPractise("ram", 22, 5000),
                new StreamPractise("soyoj", 20, 30000));

        double v = list.stream().filter(x -> x.getAge() > 20).mapToDouble(x -> x.getSalary()).average().orElse(0.0);
        System.out.println(v);

    }
}
