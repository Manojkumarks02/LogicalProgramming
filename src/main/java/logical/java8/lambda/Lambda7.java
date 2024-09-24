package logical.java8.lambda;

import java.util.ArrayList;
import java.util.stream.Stream;

//filtering the Collection data
class Product{
    int id;
    String name;
    int salary;

    public Product(int id, String name , int salary){
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}
public class Lambda7 {
    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(1,"manoj", 30000));
        products.add(new Product(1,"john", 20000));
        products.add(new Product(1,"smith", 10000));
        products.add(new Product(1,"adams", 23000));

        Stream<Product> productStream = products.stream().filter(p -> p.salary > 25000);

        productStream.forEach(p -> System.out.println(p.name + ": " + p.salary));


    }
}
