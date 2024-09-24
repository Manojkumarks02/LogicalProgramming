package day2;

public class MethodOverloading {

    public  int sum(int a, int b){
        return a+b;
    }

    public int sum(int a , int b, int c){
        return a+b+c;
    }

    public double sum(double a, double b){
        return a+b;
    }
    public static void main(String[] args) {

        MethodOverloading methodOverloading = new MethodOverloading();
        System.out.println(methodOverloading.sum(10,20));
        System.out.println(methodOverloading.sum(1,2,2));
        System.out.println(methodOverloading.sum(22.3,33));
    }
}
