public class Opgave_6 {
    public static void main(String[] args) {
        int x = 1;
        int y = 4;
        int z = 3;

        if ((y < x && x < z) || (z < x && x < y))
            System.out.println("x er den mellemste værdi");

        if ((x < y && y < z) || (z < y && y < x))
            System.out.println("y er den mellemste værdi");

        if ((y < z && z < x) || (x < z && z < y))
            System.out.println("z er den mellemste værdi");
    }
}
