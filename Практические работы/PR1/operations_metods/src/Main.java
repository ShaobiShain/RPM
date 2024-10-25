public class Main {
    public static void main(String[] args) {

        byte byteVar = 10;
        short shortVar = 20;
        int intVar = 30;
        long longVar = 40L;
        float floatVar = 50.5f;
        double doubleVar = 60.6;

        sumOfByteAndShort(byteVar , shortVar);
        sumOfLongAndInt(longVar , intVar);
        sumOfDoubleAndInt(doubleVar , intVar);
        sumOfDoubleAndFloat(doubleVar , floatVar);
        sumOfIntAndFloat(intVar , floatVar);
        sumOfLongAndFloat(longVar , floatVar);


        }


        public static void sumOfByteAndShort(byte byteVar, short shortVar) {
            System.out.println(byteVar + shortVar);

    }

        public static void sumOfLongAndInt(long longVar, int intVar) {
            System.out.println(longVar + intVar);

        }

        public static void sumOfDoubleAndInt(double doubleVar, int intVar) {
            System.out.println(doubleVar + intVar);

        }

        public static void sumOfDoubleAndFloat(double doubleVar, float floatVar) {
            System.out.println(doubleVar + floatVar);

        }

        public static void sumOfIntAndFloat(int intVar, float floatVar) {
            System.out.println(intVar + floatVar);

        }

        public static void sumOfLongAndFloat(long longVar, float floatVar) {
            System.out.println(longVar + floatVar);

        }
}
