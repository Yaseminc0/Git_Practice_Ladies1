package zehra;

public class Task1 {
    public static void main(String[] args) {
        String isBob="qhb4b";
        System.out.println(isBobHere(isBob));

    }
    public static boolean isBobHere(String str) {

        boolean bob=false;
        for(int i=0;i<str.length()-2;i++) {
            if (str.substring(i, i + 1).equals("b") && str.substring(i + 2, i + 3).equals("b")) {
                bob = true;
            }
        }


        return bob;
    }
}
