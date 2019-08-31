package test;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;

/**
 * Created by Sanal on 7/29/2019.
 */
public class CompletableFutureTest {
    public static void main(String[] args) {
        try {
            System.out.println("Started thread " + Thread.currentThread().getName() );

            CompletableFuture<String> testFuture1 = new CompletableFutureTest().getAsyncDelayedFuture(2*1000);
            CompletableFuture<String> testFuture2 = new CompletableFutureTest().getAsyncDelayedFuture(3*1000);
            CompletableFuture<String> testFuture3 = new CompletableFutureTest().getAsyncDelayedFuture(8*1000);


            /*CompletableFuture<Void> result = CompletableFuture.allOf(testFuture1, testFuture2, testFuture3);
            result.get();*/
            long startTime = System.currentTimeMillis();
            CompletableFuture<String> result = testFuture1.thenCombine(testFuture2, (s1, s2) -> {
                System.out.println("Combination 1 " + (System.currentTimeMillis() - startTime));
                return s1+s2;
            }).thenCombine(testFuture3, (s1, s2)-> {
                System.out.println("Combination 2 " + (System.currentTimeMillis() - startTime));
                return s1+s2;
            });
            System.out.println("testFuture1 is finished! " + testFuture1.isDone());
            System.out.println("testFuture2 is finished! " + testFuture2.isDone());
            System.out.println("testFuture3 is finished! " + testFuture3.isDone());
            System.out.println(result.get());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    CompletableFuture<String> getAsyncDelayedFuture(long millis) {
        CompletableFuture<String> testFuture = new CompletableFuture<>().supplyAsync(() -> {
            try {
                System.out.println("getAsyncDelayedFuture thread " + Thread.currentThread().getName());
                Thread.sleep(millis);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "OM MAHA GANESHAYA NAMAHA \n";
        });
        /*Executors.newCachedThreadPool().submit(() -> {
            try {
                System.out.println("getAsyncDelayedFuture thread " + Thread.currentThread().getName());
                Thread.sleep(millis);
                testFuture.complete("OM MAHA GANESHAYA NAMAHA \n");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });*/
        return testFuture;
    }
}