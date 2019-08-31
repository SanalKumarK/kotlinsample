package test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Sanal on 7/29/2019.
 */
public class CompletableFutureTestJoin {
    public static void main(String[] args) {
        try {
            System.out.println("Started thread " + Thread.currentThread().getName() );
            long starttime = System.currentTimeMillis();
            List<CompletableFuture<String>> testFutures = new ArrayList<>();
            for(int i=0; i<10; i++) {
                testFutures.add(getAsyncDelayedFuture(10*1000));
            }
            System.out.println("Waiting for all of");
            CompletableFuture.allOf(testFutures.toArray(new CompletableFuture[testFutures.size()])).join();
            System.out.println("Finished all threads" + (System.currentTimeMillis()-starttime));
            executor.shutdown();
            testFutures = new ArrayList<>();
            for(int i=0; i<10; i++) {
                testFutures.add(getAsyncDelayedFuture(10*1000));
            }
            System.out.println("Waiting for all of");
            CompletableFuture.allOf(testFutures.toArray(new CompletableFuture[testFutures.size()])).join();
            System.out.println("Finished all threads" + (System.currentTimeMillis()-starttime));
            executor.shutdown();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static CompletableFuture<String> getAsyncDelayedFuture(long millis) {
        CompletableFuture<String> testFuture = new CompletableFuture<>().supplyAsync(() -> {
            try {
                System.out.println("getAsyncDelayedFuture thread " + Thread.currentThread().getName());
                Thread.sleep(millis);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "OM MAHA GANESHAYA NAMAHA \n";
        },getExecutor());
        return testFuture;
    }
    static ExecutorService executor = null;
    public static ExecutorService getExecutor() {
        if(executor == null || executor.isShutdown()) {
            executor = Executors.newFixedThreadPool(10);
        }
        return executor;
    }
}