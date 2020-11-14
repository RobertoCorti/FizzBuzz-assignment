package dssc.assignment.fizzbuzz;
/*
Write a Java program that prints the numbers from 1 to 100 to the "standard" output stream and follows these rules.

    For multiples of 3 it prints Fizz instead of the number.
    For multiples of 5 it prints Buzz instead of the number.
    For numbers which are multiples of both 3 and 5 it prints FizzBuzz.

*/
import java.util.stream.IntStream;

public class FizzBuzzFunctional {
    public static void main(String[] args) {
        IntStream stream = IntStream.rangeClosed(1, 100);

        stream.forEach(i-> {
            String s = "";
            s += (i % 3 == 0) ? "Fizz" : "";
            s += (i % 5 == 0) ? "Buzz" : "";
            System.out.println(s.isEmpty()? i : s);}
            );
    }
}
