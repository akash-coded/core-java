package src.exception_handling;

/**
 * Checked Exception
 */
class MyException extends Exception {
    MyException() {

    }

    MyException(String msg) {
        super(msg);
    }
}

/**
 * Unchecked Exception
 */
class MyUncheckedException extends RuntimeException {
    MyUncheckedException() {

    }

    MyUncheckedException(String msg) {
        super(msg);
    }
}

class UserDefinedException {
    void demonstrateChecked() throws MyException {
        throw new MyException("This is a checked user-defined exception");
    }

    void demonstrateUnchecked() {
        throw new MyUncheckedException("This is an unchecked user-defined exception");
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) throws MyException {
        UserDefinedException test = new UserDefinedException();
        // try {
        // test.demonstrateChecked();
        // } catch (MyException e) {
        // e.printStackTrace();
        // System.out.println("Printing from catch block of main() " + e);
        // }
        test.demonstrateChecked(); // Uncaught checked user-defined exception
        System.out.println();
        test.demonstrateUnchecked(); // Uncaught unchecked user-defined exception
        try {
            test.demonstrateUnchecked();
        } catch (MyUncheckedException e) {
            e.printStackTrace();
            System.out.println("Printing from catch block of main() " + e);
        }
        System.out.println("End of main()");
    }
}
