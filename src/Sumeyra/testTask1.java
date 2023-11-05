package Sumeyra;

public class testTask1 {
    public static void main(String[] args) {


    /*
    We'll say that a String is xy-balanced if for all the 'x' chars in the string,
     there exists a 'y' char somewhere later in the string. So "xxy" is balanced,
     but "xyx" is not. One 'y' can balance multiple 'x's.
     Return true if the given string is xy-balanced.

xyBalance("aaxbby") → true
xyBalance("aaxbb") → false
xyBalance("yaaxbb") → false
     */

        System.out.println("Test case 1: ");
        System.out.println(Task1.xyBalance("aaxbby"));
        System.out.println("Test case 2: ");
        System.out.println(Task1.xyBalance("aaxbb"));
        System.out.println("Test case 3: ");
        System.out.println(Task1.xyBalance("yaaxbb"));

    }
}
