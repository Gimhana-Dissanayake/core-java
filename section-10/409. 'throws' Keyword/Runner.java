import java.io.IOException;

// In java applications, we are able to handle the exception in two ways.

// 1. By Using 'throws' keyword.
// 2. By Using 'try-catch-finally'

// throws keyword

// ---> The main intention of throws keyword is to bypass the generated
// exception from present method to caller method inorder to handle.

// void m1() throws Exception1, Exception2,...Exception-n{ ---instructions---}

// NOTE: mainly we are able to use 'throws' keyword for checked exception.

// NOTE: unreported exception means Checked Exception

import java.io.*;

class A {
    void add() throws Exception {
        concat(); // IOException
    }

    void concat() throws IOException {
        throw new IOException("My IOException");
    }
}

public class Runner {
    public static void main(String[] args) throws Throwable {
        A a = new A();
        a.add();
    }
}

// watch the lecture