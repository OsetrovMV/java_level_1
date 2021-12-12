public class HomeWorkOne {
    public static void main (String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    
    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign() {
        int a = 10;
        int b = 5;
        System.out.println((a + b >= 0)? "Sum is positive" : "Sum is negative");
        }

    static void printColor() {
        int value = -5;
        if (value <= 0) {
            System.out.println("Red");
        } else if (0 < value && value <= 100) {
            System.out.println("Yellow");
        } else if (value > 100) {
            System.out.println("Green");
        }
    }

    static void compareNumbers() {
        int a = 5;
        int b = 7;
        System.out.println((a >= b)? "a >= b" : "a < b");
    }
}