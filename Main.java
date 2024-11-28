package hj;
public class Main {
    public static void main(String[] args) {
        String fruit = "Apple";
        String size = "Large";

        // Outer switch for fruit
        switch (fruit) {
            case "Apple":
                // Nested switch for size
                switch (size) {
                    case "Small":
                        System.out.println("Small Apple.");
                        break;
                    case "Large":
                        System.out.println("Large Apple.");
                        break;
                    default:
                        System.out.println("Unknown size.");
                }
                break;
            case "Banana":
                System.out.println("It's a Banana.");
                break;
            default:
                System.out.println("Unknown fruit.");
        }
    }
}
