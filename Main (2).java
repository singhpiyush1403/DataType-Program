public class Main {
    public static void main(String[] args) {
       
        int intValue = 25;
        System.out.println("Integer Value: " + intValue);

        
        double doubleValue = 3.14;
        System.out.println("Double Value: " + doubleValue);

       
        float floatValue = 5.75f;
        System.out.println("Float Value: " + floatValue);

        
        char charValue = 'A';
        System.out.println("Character Value: " + charValue);

        
        String stringValue = "Hello, Java!";
        System.out.println("String Value: " + stringValue);

       
        boolean booleanValue = true;
        System.out.println("Boolean Value: " + booleanValue);

       
        long longValue = 100000L;
        System.out.println("Long Value: " + longValue);

        
        short shortValue = 3000;
        System.out.println("Short Value: " + shortValue);


        byte byteValue = 120;
        System.out.println("Byte Value: " + byteValue);


        double castedValue = intValue; 
        System.out.println("Implicit Casted Value (int to double): " + castedValue);

        int explicitCastedValue = (int) doubleValue; 
        System.out.println("Explicit Casted Value (double to int): " + explicitCastedValue);
    }
}
