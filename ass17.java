public class ass17{
    public static void main(String[] args) {
 
        int primitiveInt = 10;
        Integer wrapperInt = primitiveInt;
        System.out.println("Primitive to Wrapper: " + wrapperInt);

        Double wrapperDouble = 20.5;
        double primitiveDouble = wrapperDouble; // Unboxing
        System.out.println("Wrapper to Primitive: " + primitiveDouble);
    }
}
