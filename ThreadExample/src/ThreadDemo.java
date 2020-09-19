import java.util.Set;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        int count = 0;
        for (int i = 0; i <5 ; i++) {
            Thread thread = new Thread(new ThreadExercise() );
            thread.setName("I am number " + i);
            System.out.println(thread.getName());
            thread.run();
            count++;

        }
        Thread.sleep(60000);
        System.out.println("Thread count "+ count);

    }
}


