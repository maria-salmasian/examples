import java.util.Random;

public class ThreadExercise implements Runnable{
    Random random = new Random();
    @Override
    public void run() {
        int time = random.nextInt(100);
        System.out.println("I am a running thread");
        try {
            Thread.sleep(time);
            System.out.println(time*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
