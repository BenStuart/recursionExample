package com.company;

    /*
    n starts at 0, once recMethodCall is triggered it continues to call itself until the if condition is true,
    i.e n == 3, once n == 3 n is returned, the recursive method calls stop now because in java once something is returned
    the method is "jumped out of" and the value is returned to the parent.

    Step 1) recMethodCall is called, is n == 3? no, so the else statement is triggered which calls itself (in the method
    declaration you can see we are adding 1 to n, now n == 1;)
    step 2) recMethodCall is called, is n == 3? no, so the else statment is triggered which calls itself
    adds 1 to n, n now equals 2.
    step 3) recMethodCalls is called is n == 3?, no, so the else statement is triggered which calls itself add 1 to n, n now equals 3;
    step 4) recMethodCalls is called is n == 3? yes. so now we need to return from the methods we have just dug into

    n is returned to its parent method that called it
    n is returned to its parent method that called it
    n is returned to its parent method that called it
    n is returned to its parent method that called it

    A more visual diagram:
    recMethodCall(0)
        recMethodCall(1)
            recMethodCall(2)
                recMethodCall(3)
                recMethodCall(3)
            recMethodCall(2)
       recMethodCall(1)
    recMethodCall(0)

    As you can see however many times you recursively go inside the same method, you need to return the same amount of times, like winding up a spring
    it needs to be unwound equally. You can determine when it starts to "unwind" by triggering some condition i.e if(n==3)

     */

public class Main {
    public int recMethodCall(int n){
        System.out.println(n);
        if (n == 3)
            return n;
        else
            return(recMethodCall(n + 1));
    }

    public static void main(String[] args) {
        //Create an instance of the Main Class
        Main test = new Main();
        //Call the recMethodCall method of Main
        test.recMethodCall(0);
    }
}
