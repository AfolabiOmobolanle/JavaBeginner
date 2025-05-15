public class StringNumberUtils {

    // Convert number to string and string to number
    public void numberStringConversion() {
        int number = 123;
        String numberAsString = Integer.toString(number);
        System.out.println("Number to String: " + numberAsString);

        String stringInput = "456";
        int stringToNumber = Integer.parseInt(stringInput);
        System.out.println("String to Number: " + stringToNumber);
    }

    // Reverse a given string
    public void reverseString(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
    }

    // Main method
    public static void main(String[] args) {
        StringNumberUtils utils = new StringNumberUtils();

        // Demonstrate conversion
        utils.numberStringConversion();

        // Demonstrate string reversal
        utils.reverseString("hello world");
    }
}
