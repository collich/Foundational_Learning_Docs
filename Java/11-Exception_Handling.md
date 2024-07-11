# Exception Handling

---

Two Keys to Exception Handling:

- Friendly Message to end user
- Enough information to Debug the problem

## Basics of Exception

This section demonstrates the basic of exceptions.

### Stack Trace and NullPointerException

- **Stack Trace**:
  - A stack trace is a list of stack frames. These frames represent a moment during an application’s execution.
- `NullPointerException`:
  - It's when the user is trying to access a part of something that doesn't exist.

```Java
public static void main(String[] args){
    String str = null;
    str.length();
}
```

> This causes `NullPointerException`.

### Handling Exceptions
