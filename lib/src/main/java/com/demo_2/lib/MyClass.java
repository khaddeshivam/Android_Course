package com.demo_2.lib;

public class MyClass {
    // This is a single-line comment

    /*
    This is a multi-line comment
    It begins with a forward slash and an asterisk.
    We can write multiple lines here
    until we close it with an asterisk and a forward slash.
    */

    // Main method
    public static void main(String[] args) {
        // Java Output
        System.out.println("Hello World !");
        String name = "Shivam Khadde";
        int age = 20;

        System.out.println("My Name is " + name + " and I am " + age + " years old");

        age = 21;
        System.out.println("My Name is " + name + " and I am " + age + " years old");

        // Java Variables
        int a = 10;
        int b = 20;
        float c = (a + b);
        System.out.println("Here \na = " + a + "\nb = " + b + "\nSum of a and b is " + c);

        // Data Types
        // a. Primitive Data Types

        // 1] byte (-128 to 127) (1 byte) (8-bit signed two's complement integer)
        byte x = -128;
        // 2] short (-32,768 to 32,767) (2 bytes) (16-bit signed two's complement integer)
        short y = 7777;
        // 3] int (-2,147,483,648 to 2,147,483,647) (4 bytes) (32-bit signed two's complement integer)
        int z = 84567922;
        // 4] long (-9 quintillion to 9 quintillion) (8 bytes) (64-bit signed two's complement integer)
        long l = 999999999999999999L;
        // 5] float (approx. 7 decimal digits precision) (4 bytes) (32-bit IEEE 754 floating point)
        float f = 972.5f;
        // 6] double (approx. 15 decimal digits precision) (8 bytes) (64-bit IEEE 754 floating point)
        double d = 864.5;
        // 7] char (Single Unicode character) (2 bytes)
        char ch = 'A';
        // 8] boolean (true or false) (1 bit)
        boolean bool = true;

        System.out.println("byte: " + x);
        System.out.println("short: " + y);
        System.out.println("integer: " + z);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + ch);
        System.out.println("boolean: " + bool);

        // b. Non-Primitive Data Types

        // 1] String (String is not a primitive data type; it is a class)
        String s = "GeeksforGeeks";
        String s1 = new String("GeeksforGeeks");

        // 2] Array (Array is a collection of similar data types)
        int[] arr = {1, 2, 3, 4, 5};

        // Printing array elements
        System.out.print("Array elements: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println(); // New line

        // 3] Class (Class is a blueprint for objects)
        Student student1 = new Student(101, "Shivam Khadde", 20);
        Student student2 = new Student(102, "John Doe", 22);

        // Display Student Details
        student1.displayStudentInfo();
        student2.displayStudentInfo();

        // 4] Interface (Interface is a reference type in Java)
        // Creating objects of Dog and Cat classes that implement the Animal interface
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Calling interface methods
        myDog.makeSound();
        myDog.eat();

        myCat.makeSound();
        myCat.eat();

        // 5] Null (Used to indicate a reference variable does not point to any object)
        String myString = null;
        System.out.println("Null reference string: " + myString);
    }
}

// 3] Proper Class Implementation
class Student {
    private int rollNo;
    private String name;
    private int age;

    // Constructor
    public Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    // Getters
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Display Method
    public void displayStudentInfo() {
        System.out.println("Student Details:");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("----------------------");
    }
}

// 4] Defining an Interface
interface Animal {
    void makeSound(); // Abstract method
    void eat();       // Abstract method
}

// Implementing the Interface in a Class
class Dog implements Animal {
    public void makeSound() {
        System.out.println("Dog barks: Woof Woof!");
    }

    public void eat() {
        System.out.println("Dog eats dog food.");
    }
}

// Another Class implementing the same Interface
class Cat implements Animal {
    public void makeSound() {
        System.out.println("Cat meows: Meow Meow!");
    }

    public void eat() {
        System.out.println("Cat eats fish.");
    }
}
