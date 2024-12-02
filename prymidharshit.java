package hj;
public class prymidharshit {
    public static void main(String[] args) {
        String name = "Harshit";
        int a = name.length();

        for (int i = 0; i < a; i++) {
          
//            for (int j = a - i; j > 1; j--) {
//                System.out.print(" ");
//       }
          
            for (int j = 0; j <= i; j++) {
                System.out.print(name.charAt(j));
            }
            System.out.println();
        }
    }
}
