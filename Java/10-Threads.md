# Threads

---

`Threads` allows a program to operate more efficiently by doing multiple things at the same time.

There are two ways to create a thread.

- By `extends Thread`
- By `implements Runnable`

## Implementation of extends Thread

```Java
public class Task extends Thread {
    public void run(){ // Signature
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}
```

`main` method:

```Java
void main(){
    Task task1 = new Task();
    task1.start();
}
```

## Implementation of implements Runnable

```Java
public class Task2 implements Runnable {

    @Override
    public void run(){ // Signature
        for (int i = 101; i < 200; i++) {
            System.out.println(i);
        } 
    }
}
```

`main` method:

```Java
void main(){
    Task2 task2 = new Task2();
    Thread thread = new Thread(task2);
    thread.start();
}
```

## States of Threads

Threads have 5 states:

- `NEW`
- `RUNNABLE`
- `RUNNING`
- `BLOCKED/WAITING`
- `TERMINATED/DEAD`

### `NEW`

This state is when the thread have been `Initialise/Created`:

```Java
Task task1 = new Task();
// or
Thread thread = new Thread(task2);
```

### `RUNNABLE`

This state is when the `Thread` is ready but not being executed.

Example:

`Thread1` and `Thread2`. When the CPU switches from `task1(Thread1)` to `task2(Thread2)`, `task2` is in the running state and `task1` is in a `RUNNABLE` state.

### `RUNNING`

This is the state when the `Thread` is currently performing it's tasks.

### `BLOCKED/WAITING`

This state is when waiting for an internal service, like a database, to respond in order to continue a task.
Another case could be that `task1` depends on `task2` for some data to finish execution. So `task1` is in a state of `BLOCKED/WAITING`.

### `TERMINATED/DEAD`

This state is when the `Thread` have finished execution.

## Priority of Threads

We can change the `Thread` priority by using a method `setPriority`.
For the method, we can only specify within a specific range from `MIN_PRIORITY = 1` to `MAX_PRIORITY = 10`. By default, the priority is `NORM_PRIORITY = 5`.

This method is only a `request`. It may or may not be honored.

```Java
Task task1 = new Task();
task1.setPriority(1);

Task2 task2 = new Task2();
Thread thread = new Thread(task2);
thread.setPriority(10);

task1.start();
thread.start();
```

## Join

We can let have a `Thread` in a `Terminate/Dead` before completing a non thread related task.

```Java
task1.join() 

// Task 3
for (int i = 200; i < 300>; i++){
    System.out.println(i);
}
```

> In this scenario, we have a piece of code that allows `task1` to be completed before "Task 3" executes.

## Utility methods

There are a few miscellaneous `static` methods for `Thread`.

- `sleep()`
- `yield()`

### Sleep

As the name suggest, it let's the `Thread` to sleep.

```Java
Thread.sleep();
```

### yield

Another `static` method that allows the `Thread` to give up CPU to the `Scheduler`.

```Java
Thread.yield();
```

### Synchronized

It is a keyword to have the program run a method by a single `Thread` while other `Thread` waits for the single `Thread` to finish execution.

## Executor Service

It's a service that enables us to control the `Execution of Threads` as a group.

- `ExecutorService` is a `Class`

```Java
// Ensures a Single Thread is running at a time
ExecutorService executorService = Executors.newSingleThreadExecutor();
executorService.execute(new Task());
executorService.execute(new Thread(task2));
```

> The block of code above shows that `task1` would start and finish execution then `task2` will start.

### Take Note (Recommended)

To shut down the `Executor Service` at the last line:

```Java
executorService.shutdown();
```

> This step is to ensure the program stops running after shutting the service off.

### Customising the number of Threads using Executor Service

One way to do muli-threading in `Thread` is to:

```Java
executorService.newFixedThreadPool(<number_of_threads>);
executorService.newFixedThreadPool(2); // This is to specify 2 threads
```

> In the example, we state that at any point in time we only expect to have 2 threads running.

### Stringing all together

- `Task` Class:

```Java
public class Task extends Thread {
    private int number;

    public Task(int number){
        this.number = number;
    }

    public void run(){
        System.out.printf("Task %d has Started\n", this.number);

        for (int i = this.number; i < this.number * 100 + 99; i++){
            System.out.println(i);
        }

        System.out.printf("Task %d has Stopped\n", this.number);
    }
}
```

- `App.java` main:

```Java
public class App {
    public static void main(String[] args){
        ExecutorService executorService = Executors.newFixedThreadPool(2); // At any time, 2 Threads are active at any point in time

        executorService.execute(new Task(1));
        executorService.execute(new Task(2));
        executorService.execute(new Task(3));
        executorService.execute(new Task(4));
        executorService.execute(new Task(5));
        executorService.execute(new Task(6));

        executorService.shutdown();
    }
}
```

### Retrieving Values from Thread

We can return use `Callable<T>` **Interface** to implement a return value for `Threads`.

- `CallableTask`:

```Java
public class CallableTask implements Callable<String>{
    private String name;

    public CallableTask(int number) {
        this.name = "Task " + number;
    }

    @Override
    public String call() throws Exception {
        System.out.printf("%s is Executing\n", this.name);
        StringBuilder strBuilder = new StringBuilder;
        strBuilder.append(this.name);
        strBuilder.append(" has finished.");
        Thread.sleep(1000);
        return strBuilder.toString();
    }
}
```

- `App.java`:

```Java
public class App {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ArrayList<Future<String>> newList = new ArrayList<>(); 

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 1; i <= 4; i++){
            // Future over here is a promise.
            // Meaning we will have a result at a later time.
            Future<String> futureString = executorService.submit(new CallableTask(i));
            newList.add(futureString);
        }

        for (int i = 0; i < 4; i++){
            String newString = newList.get(i).get();
            System.out.println(newString);
        }
        
        executorService.shutdown();
    }
}
```

### Multiple Tasks

We can use a method that is present to invoke all multiple tasks

```Java
public class App {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ArrayList<Future<String>> newList = new ArrayList<>(); 

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 1; i <= 4; i++){
            newList.add(new CallableTask(i));
        }

        ArrayList<Future<String>> results = executorService.invokeAll(newList);

        for (Future<String> result : results){
            System.out.println(result.get());
        }
        
        executorService.shutdown();
    }
}
```
