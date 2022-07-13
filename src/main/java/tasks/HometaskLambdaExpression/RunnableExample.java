package tasks.HometaskLambdaExpression;

import java.util.Random;

public class RunnableExample {
    public static void main(String[] args){
        Thread t1 = new Thread(new RunnableExample().new RunnableImplementation());
        t1.start();
    }

    private class RunnableImplementation implements Runnable{
        public void run() {
            System.out.println(Thread.currentThread().getName()
                    + ", executing run() method!");
            Random rn = new Random();
            for(int i =0; i < 100; i++)
            {
                int answer = rn.nextInt(10) + 1;
                System.out.println(answer);
            }
        }
    }
}
