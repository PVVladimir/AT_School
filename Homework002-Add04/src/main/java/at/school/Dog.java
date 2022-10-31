package at.school;

public class Dog implements Runnable {
    @Override
    public void run() {
        System.out.println("Я бегаю");
    }
}
