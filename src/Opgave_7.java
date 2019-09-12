public class Opgave_7 {
    public static void main(String[] args) {
        int x = 10;
        int y = 11;

        if ((x - y > 10) || (y - x > 10))
            System.out.println("Forskellen mellem x og y er mere end 10");
        else
            System.out.println("Forskellen mellem x og y er mindre end 10");
    }
}
