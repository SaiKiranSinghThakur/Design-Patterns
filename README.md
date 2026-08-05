# Design Patterns

---

## Creational Design Patterns

### Factory Method
The Factory Method design pattern is a creational pattern that provides an interface or abstract class for creating objects, but lets subclasses decide which class to instantiate, allowing the code to be more flexible and easier to maintain.

### Singleton

Excellent. **Singleton** is the **#1 most asked Design Pattern** in Java interviews (especially banking, fintech, and product companies). For a **4+ years Java Developer**, you should be able to explain the concept, write the code, discuss thread safety, and answer follow-up questions.

We'll cover:

* ✅ Concept
* ✅ Why Singleton was introduced
* ✅ Interview Answers
* ✅ Implementation
* ✅ Thread-safe Singleton
* ✅ Lazy vs Eager Initialization
* ✅ Bill Pugh Singleton
* ✅ Breaking Singleton
* ✅ Spring Boot relation
* ✅ Interview Questions
* ✅ Coding Problems

---

# Singleton Design Pattern ⭐⭐⭐⭐⭐

## 1. What is Singleton?

### Interview Answer

> The Singleton Design Pattern is a creational design pattern that ensures a class has only one instance throughout the application and provides a global access point to that instance.

---

# 2. Why was Singleton introduced?

Suppose every class creates its own database connection.

```java
DatabaseConnection d1 = new DatabaseConnection();

DatabaseConnection d2 = new DatabaseConnection();

DatabaseConnection d3 = new DatabaseConnection();
```

Problems

* Multiple objects
* More memory usage
* Expensive resource creation
* Data inconsistency

Instead

```
Entire Application

↓

One Database Connection

↓

Shared by everyone
```

This is where Singleton is useful.

---

# 3. Real-Time Examples

Singleton is commonly used for:

* Database Connection Manager
* Logger
* Configuration Manager
* Cache Manager
* Thread Pool
* Spring Beans (Singleton Scope)

---

# 4. Characteristics

* Only one object
* Private constructor
* Static instance
* Static method to access the object

---

# 5. Basic Singleton (Lazy Initialization)

```java
class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {

        if (instance == null) {

            instance = new Singleton();

        }

        return instance;
    }
}

public class Main {

    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();

        Singleton s2 = Singleton.getInstance();

        System.out.println(s1 == s2);

    }
}
```

Output

```
true
```

---

## Why Private Constructor?

Interview Question

### Answer

A private constructor prevents other classes from creating objects using the `new` keyword.

Without private constructor

```java
Singleton s = new Singleton();
```

Anyone could create multiple objects.

---

# 6. Why Static Instance?

Because there should be only one copy shared by the entire application.

---

# 7. Why Static getInstance()?

Because we need to access the Singleton object without first creating an object of the class.

---

# 8. Lazy Initialization ⭐⭐⭐⭐

Object is created only when first needed.

```java
private static Singleton instance;

public static Singleton getInstance(){

    if(instance==null){

        instance=new Singleton();

    }

    return instance;

}
```

Advantages

* Saves memory
* Object created only if required

Disadvantage

* Not thread-safe

---

# 9. Eager Initialization ⭐⭐⭐⭐

Object created immediately.

```java
class Singleton{

    private static final Singleton instance =
            new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){

        return instance;

    }

}
```

Advantages

* Thread-safe
* Very simple

Disadvantages

* Object created even if never used

---

# 10. Thread Safety Problem ⭐⭐⭐⭐⭐

Suppose two threads execute simultaneously.

```
Thread 1

instance == null

↓

Create Object

Thread 2

instance == null

↓

Create Another Object
```

Now two objects exist.

Singleton is broken.

---

# 11. Thread-Safe Singleton

```java
public static synchronized Singleton getInstance(){

    if(instance==null){

        instance=new Singleton();

    }

    return instance;

}
```

Advantage

Only one thread enters the method.

Disadvantage

Synchronization reduces performance because every call acquires a lock.

---

# 12. Double-Checked Locking ⭐⭐⭐⭐⭐

```java
class Singleton {

    private static volatile Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {

        if (instance == null) {

            synchronized (Singleton.class) {

                if (instance == null) {

                    instance = new Singleton();

                }
            }
        }

        return instance;
    }
}
```

Advantages

* Thread-safe
* Better performance than synchronizing the whole method

---

# 13. Bill Pugh Singleton ⭐⭐⭐⭐⭐

Most recommended in interviews.

```java
class Singleton {

    private Singleton() {
    }

    private static class Holder {

        private static final Singleton INSTANCE =
                new Singleton();

    }

    public static Singleton getInstance() {

        return Holder.INSTANCE;

    }

}
```

Advantages

* Thread-safe
* Lazy initialization
* No synchronization overhead

---

# 14. Can Singleton Be Broken?

Yes.

Using

* Reflection
* Serialization
* Cloning

---

# Prevent Reflection

Inside constructor

```java
if(instance!=null){

    throw new RuntimeException();

}
```

---

# Prevent Serialization

```java
protected Object readResolve(){

    return instance;

}
```

---

# Singleton in Spring Boot ⭐⭐⭐⭐⭐

Interview Question

How is Singleton used in Spring?

### Answer

By default, Spring beans are created with **singleton scope**, meaning only one instance of each bean is created in the Spring container and shared throughout the application.

Example

```java
@Service
public class EmployeeService {

}
```

Spring creates only one `EmployeeService` object by default.

---

# Advantages

* Saves memory
* Global access
* Better resource management
* Prevents duplicate objects

---

# Disadvantages

* Difficult to unit test
* Global state
* Can introduce tight coupling if overused

---

# Interview Questions

## What is Singleton?

**Answer**

Singleton is a creational design pattern that ensures only one instance of a class exists and provides a global access point to it.

---

## Why use Singleton?

**Answer**

To share a single instance of expensive or shared resources such as database connections, loggers, caches, or configuration managers.

---

## How do you implement Singleton?

1. Private constructor
2. Static instance
3. Static `getInstance()` method

---

## Why private constructor?

To prevent object creation using `new`.

---

## Why static method?

To allow access to the single instance without creating an object.

---

## Difference between Lazy and Eager Initialization?

| Lazy                         | Eager                    |
| ---------------------------- | ------------------------ |
| Created on first use         | Created when class loads |
| Saves memory                 | Simpler and thread-safe  |
| Needs thread safety handling | No lazy loading          |

---

## Why isn't Lazy Singleton thread-safe?

Because two threads can create separate instances simultaneously if they both see `instance == null`.

---

## How do you make Singleton thread-safe?

* `synchronized`
* Double-Checked Locking
* Bill Pugh Singleton
* Enum Singleton

---

## What is Double-Checked Locking?

It checks whether the instance is null before and after acquiring the lock, reducing unnecessary synchronization.

---

## What is the best Singleton implementation?

For most Java interviews:

> **Bill Pugh Singleton** is considered one of the best implementations because it provides lazy initialization, is thread-safe, and avoids synchronization overhead.

---

## Can Singleton be broken?

Yes.

* Reflection
* Serialization
* Cloning

---

## Where have you used Singleton?

A strong answer:

> "I have used Singleton for shared resources such as configuration managers and loggers. In Spring Boot, I also worked with singleton-scoped beans, which are the default scope for services and repositories."

---

# Coding Problems

### 1. Implement Lazy Singleton

Write a class that creates the object only when `getInstance()` is first called.

---

### 2. Implement Eager Singleton

Create the object when the class is loaded.

---

### 3. Implement Thread-Safe Singleton

Use the `synchronized` keyword.

---

### 4. Implement Double-Checked Locking

Create a thread-safe Singleton with minimal synchronization overhead.

---

### 5. Implement Bill Pugh Singleton

Use a static inner helper class to achieve lazy initialization and thread safety.

---

## ⭐ Focus for 4+ Years Interviews

Make sure you can confidently answer:

1. What is Singleton?
2. Why was Singleton introduced?
3. How do you implement Singleton?
4. Why is the constructor private?
5. Why is `getInstance()` static?
6. Lazy vs Eager Initialization
7. Why is Lazy Singleton not thread-safe?
8. How do you make Singleton thread-safe?
9. Double-Checked Locking
10. Bill Pugh Singleton
11. Singleton in Spring Boot
12. Advantages and disadvantages
13. Real-world use cases

These are the questions most commonly asked in Java backend interviews for candidates with **4+ years of experience**.


### Builder
The Builder Pattern is a creational design pattern that separates the construction of a complex object from its representation, allowing you to build different representations step by step using the same building process.

### Prototype
The Prototype Pattern is a creational design pattern that allows you to create new objects by copying an existing object (called a prototype), rather than instantiating new ones from scratch — useful when object creation is expensive or complex.

---

## Structural Design Patterns

### Adapter
The Adapter Pattern is a structural design pattern that allows incompatible interfaces to work together by converting the interface of one class into another expected by the client.

### Decorator
The Decorator Pattern is a structural design pattern that lets you add new behaviors or responsibilities to objects dynamically without altering their original class.

### Facade
The Facade Pattern is a structural design pattern that provides a simple, unified interface to a complex system of classes, making it easier for clients to interact with the system without needing to understand its details.

---

## Behavioural Design Patterns

### Observer
The Observer Pattern is a behavioral design pattern where an object (called the subject) maintains a list of dependents (observers) and automatically notifies them of any state changes, promoting loose coupling between the subject and its observers.

### State
The State Pattern is a behavioral design pattern that allows an object to change its behavior dynamically when its internal state changes, making the object appear to change its class.

### Strategy
The Strategy Pattern is a behavioral design pattern that enables selecting an algorithm’s behavior at runtime by defining a family of interchangeable algorithms and making them interchangeable within a context.
