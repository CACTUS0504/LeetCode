package FizzBuzz;

import java.nio.charset.StandardCharsets;

class FizzBuzz{
    public byte[] fizzBuzz(int value) {
        byte[] arr = null;
        if (value % 3 == 0) arr = "Fizz".getBytes(StandardCharsets.UTF_8);
        if (value % 5 == 0) arr = "Buzz".getBytes(StandardCharsets.UTF_8);
        if (value % 3 == 0 && value % 5 == 0) arr = "FizzBuzz".getBytes(StandardCharsets.UTF_8);
        if (arr == null) throw new RuntimeException("not implemented yet");
        else return arr;
    }
}


public class Solution {
    public static void main(String[] args) {

    }
}
