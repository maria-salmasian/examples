public class ThreadExercise implements Runnable{
    @Override
    public void run() {
        System.out.println("I am a running thread");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
