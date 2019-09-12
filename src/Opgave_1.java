public class Opgave_1 {
    public static void main(String[] args) {
        int x = 5;
        int y = 8;
        int z = 3;

        System.out.println(x<=5 && z != y);
        System.out.println(x==5 || x == y && z == 3);
        System.out.println(x/y > z/x);
        System.out.println(!(x != y - z) == false);
        System.out.println(2*x != x || x == 0); // tautalogi == always true
        System.out.println(!true || !false); // tautalogi
    }
}
