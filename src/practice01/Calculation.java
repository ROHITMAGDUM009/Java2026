package practice01;

class Calculation {

    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method to add two double values
    double add(double a, double b) {
        return a + b;
    }

    // Main method
    public static void main(String[] args) {
        Calculation calc = new Calculation();

        int intResult = calc.add(10, 20);
        double doubleResult = calc.add(10.5, 20.5);

        System.out.println("Addition of two integers: " + intResult);
        System.out.println("Addition of two doubles: " + doubleResult);
    }
}

