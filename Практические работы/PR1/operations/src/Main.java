public class Main {
    public static void main(String[] args) {
        // Числовые переменные
        byte byteVar = 10;
        short shortVar = 20;
        int intVar = 30;
        long longVar = 40L;
        float floatVar = 50.5f;
        double doubleVar = 60.6;

        // Математические операции
        int intResult1 = byteVar + shortVar;
        long longResult1 = intVar + longVar;
        float floatResult1 = floatVar + intVar;
        double doubleResult1 = doubleVar + longVar;

        int intResult2 = byteVar * shortVar;
        long longResult2 = intVar * longVar;
        float floatResult2 = floatVar * intVar;
        double doubleResult2 = doubleVar * longVar;

        int intResult3 = intVar / byteVar;
        long longResult3 = longVar / shortVar;
        float floatResult3 = floatVar / intVar;
        double doubleResult3 = doubleVar / longVar;

        int intResult4 = intVar - byteVar;
        long longResult4 = longVar - shortVar;
        float floatResult4 = floatVar - intVar;
        double doubleResult4 = doubleVar - longVar;

        // Вывод результатов на экран
        System.out.println("intResult1: " + intResult1);
        System.out.println("longResult1: " + longResult1);
        System.out.println("floatResult1: " + floatResult1);
        System.out.println("doubleResult1: " + doubleResult1);

        System.out.println("intResult2: " + intResult2);
        System.out.println("longResult2: " + longResult2);
        System.out.println("floatResult2: " + floatResult2);
        System.out.println("doubleResult2: " + doubleResult2);

        System.out.println("intResult3: " + intResult3);
        System.out.println("longResult3: " + longResult3);
        System.out.println("floatResult3: " + floatResult3);
        System.out.println("doubleResult3: " + doubleResult3);

        System.out.println("intResult4: " + intResult4);
        System.out.println("longResult4: " + longResult4);
        System.out.println("floatResult4: " + floatResult4);
        System.out.println("doubleResult4: " + doubleResult4);
    }
}
