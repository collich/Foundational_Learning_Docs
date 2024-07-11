package EService.Classes;

import java.util.concurrent.Callable;

public class CallableRunner implements Callable<String> {

    private String name;

    public CallableRunner(int number){
        this.name = "Task " + number;
    }

    @Override
    public String call() throws Exception {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'call'");
        System.out.printf("%s is Executing\n", this.name);
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append(this.name);
        strBuilder.append(" has finished.");
        Thread.sleep(1000);
        return strBuilder.toString();
    }
    
}
