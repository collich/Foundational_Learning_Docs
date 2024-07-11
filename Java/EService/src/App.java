package EService.src;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import EService.Classes.CallableRunner;

public class App {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ArrayList<Future<String>> newList = new ArrayList<>(); 

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 1; i <= 4; i++){
            Future<String> futureString = executorService.submit(new CallableRunner(i));
            newList.add(futureString);
        }

        for (int i = 0; i < 4; i++){
            String newString = newList.get(i).get();
            System.out.println(newString);
        }

        executorService.shutdown();
        
    }
}
