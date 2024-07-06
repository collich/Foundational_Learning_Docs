# Java Platform

---

![How Java Works (Overview)](images/Java_Overview.png)

## Platform Independent

How do we write once and run in every Operating System?

> **Bytecode**: Intermediate Representation
Then afterwards, the **Bytecode** would be process by **JVM** to convert it into executable instruction for it's Operating System.

What happens during *Execution* and *Compilation* Time?

> During Execution, the **JVM** is used. During Compilation, Java Code is being compiled to **Bytecode**

## JDK vs JRE vs JVM

Distinguish the difference between JDK, JRE and JVM.

### Java Developer Kit - JDK

It's a `development tool kit` for developers. It includes JRE, compilors and debuggers for Java. It's the package to be installed to run, debug and build applications in Java.

### Java Runtime Environment - JRE

It's a `runtime environment` that runs the JVM, Java Libraries and other components.

### Java Virtual Machine - JVM

Java Virtual Machine or JVM a compilor for Java to convert `Bytecode` to platform (Windows, Linux or Mac) specific instructions.
