public class Opgave_4 {
        public static void main(String[] args) {
            int first = 88;
            int second = 69;
            int third = 117;

            if (first > second){
                if (first > third) // det var sgu da en dum løsning
                    System.out.println("Variablet \"first\" har den største værdi.");
            }

            if (second > first){
                if (second > third)
                    System.out.println("Variablet \"second\" har den største værdi.");
            }
            if (third > first){
                if (third > second)
                    System.out.println("Variablet \"third\" har den største værdi.");
            }

        }

}
