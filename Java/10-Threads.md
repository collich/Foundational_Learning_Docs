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
