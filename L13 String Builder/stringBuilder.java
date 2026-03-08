public class stringBuilder {
    public static void main(String[] args) {
        // Creating a StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");

        // Appending text to the StringBuilder
        sb.append(" World");
        System.out.println("After append: " + sb.toString()); // Hello World

        // Inserting text at a specific position
        sb.insert(5, ",");
        System.out.println("After insert: " + sb.toString()); // Hello, World

        // Replacing text within the StringBuilder
        sb.replace(7, 12, "Java");
        System.out.println("After replace: " + sb.toString()); // Hello, Java

        // Deleting text from the StringBuilder
        sb.delete(5, 6);
        System.out.println("After delete: " + sb.toString()); // Hello Java

        // Reversing the content of the StringBuilder
        sb.reverse();
        System.out.println("After reverse: " + sb.toString()); // avaJ olleH

        // Converting StringBuilder to String
        String result = sb.toString();
        System.out.println("Final String: " + result); // avaJ olleH


    }
}