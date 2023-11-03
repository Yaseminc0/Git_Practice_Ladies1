package Sumeyra;

public class Task1 {

    public static boolean xyBalance(String str) {
        return (str.lastIndexOf('x') < str.lastIndexOf('y'))
                || (str.indexOf('x')==str.indexOf('y')) ;
    }

}


