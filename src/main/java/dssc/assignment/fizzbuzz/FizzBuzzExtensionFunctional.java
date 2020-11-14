package dssc.assignment.fizzbuzz;
/*
We want our Java program to print numbers from 1 to 105 and apply these rules.

    For multiples of 7 it prints Bang instead of the number.
    For numbers which are multiples of both 3 and 7 it prints FizzBang.
    For numbers which are multiples of both 5 and 7 it prints BuzzBang.
    For numbers which are multiples of 3, 5 and 7 it prints FizzBuzzBang.

*/
import java.util.stream.IntStream;

public class FizzBuzzExtensionFunctional {
    public static void main(String[] args) {
        IntStream stream = IntStream.rangeClosed(1, 105);

        stream.forEach(i-> {
            String s = "";
            s = (i % 7 == 0) ? "Bang" : "";
            s = (i % 5 == 0 && i % 7 == 0 ) ? "Buzz"+s : "";
            s = (i % 3 == 0 && i % 7 == 0 ) ? "Fizz"+s : "";
            System.out.println(s.isEmpty()? i : s);}
        );
    }
}
