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

## `NEW`

This state is when the thread have been `Initialise/Created`:

```Java
Task task1 = new Task();
// or
Thread thread = new Thread(task2);
```

## `RUNNABLE`

This state is when the `Thread` is ready but not being executed.

Example:

`Thread1` and `Thread2`. When the CPU switches from `task1(Thread1)` to `task2(Thread2)`, `task2` is in the running state and `task1` is in a `RUNNABLE` state.

## `RUNNING`

This is the state when the `Thread` is currently performing it's tasks.

## `BLOCKED/WAITING`

This state is when waiting for an internal service, like a database, to respond in order to continue a task.
Another case could be that `task1` depends on `task2` for some data to finish execution. So `task1` is in a state of `BLOCKED/WAITING`.

## `TERMINATED/DEAD`

This state is when the `Thread` have finished execution.
