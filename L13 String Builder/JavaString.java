public class JavaString {
    public static void main(String[] args) {
        // Creating a String object
        String str = "Hello";

        // Concatenating strings
        str = str + " World";
        System.out.println("After concatenation: " + str); // Hello World

        // Replacing text within the String
        str = str.replace("World", "Java");
        System.out.println("After replace: " + str); // Hello Java

        // Substring extraction
        String subStr = str.substring(0, 5);
        System.out.println("Substring: " + subStr); // Hello

        // Converting to uppercase
        String upperStr = str.toUpperCase();
        System.out.println("Uppercase: " + upperStr); // HELLO JAVA

        // Converting to lowercase
        String lowerStr = str.toLowerCase();
        System.out.println("Lowercase: " + lowerStr); // hello java

        // Trimming whitespace
        String strWithSpaces = "   Hello Java   ";
        String trimmedStr = strWithSpaces.trim();
        System.out.println("Trimmed String: '" + trimmedStr + "'"); // 'Hello Java'
    }
}