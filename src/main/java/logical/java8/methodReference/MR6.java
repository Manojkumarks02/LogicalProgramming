package logical.java8.methodReference;

public class MR6 {
    // //Using Method Reference in Thread
    public static void runTask() {
        System.out.println("Task is running");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(MR6::runTask);
        thread.start();
    }
}
