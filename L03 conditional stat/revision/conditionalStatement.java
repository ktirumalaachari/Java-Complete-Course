public class conditionalStatement {
    public static void main(String[] args) {
        
        System.out.println("=== ALL TYPES OF CONDITIONAL STATEMENTS IN JAVA ===\n");
        
        // ==========================================
        // 1. IF STATEMENT
        // ==========================================
        System.out.println("1. IF STATEMENT:");
        int age = 20;
        if (age >= 18) {
            System.out.println("You are eligible to vote!");
        }
        System.out.println();
        
        // ==========================================
        // 2. IF-ELSE STATEMENT
        // ==========================================
        System.out.println("2. IF-ELSE STATEMENT:");
        int marks = 75;
        if (marks >= 50) {
            System.out.println("You passed the exam with " + marks + " marks!");
        } else {
            System.out.println("You failed the exam. Better luck next time!");
        }
        System.out.println();
        
        // ==========================================
        // 3. IF-ELSE-IF LADDER
        // ==========================================
        System.out.println("3. IF-ELSE-IF LADDER:");
        int score = 85;
        if (score >= 90) {
            System.out.println("Grade: A+ (Excellent!)");
        } else if (score >= 80) {
            System.out.println("Grade: A (Very Good!)");
        } else if (score >= 70) {
            System.out.println("Grade: B (Good!)");
        } else if (score >= 60) {
            System.out.println("Grade: C (Average)");
        } else if (score >= 50) {
            System.out.println("Grade: D (Pass)");
        } else {
            System.out.println("Grade: F (Fail)");
        }
        System.out.println();
        
        // ==========================================
        // 4. NESTED IF STATEMENT
        // ==========================================
        System.out.println("4. NESTED IF STATEMENT:");
        int userAge = 25;
        boolean hasLicense = true;
        
        if (userAge >= 18) {
            if (hasLicense) {
                System.out.println("You can drive a car!");
            } else {
                System.out.println("You need a driving license first.");
            }
        } else {
            System.out.println("You are too young to drive.");
        }
        System.out.println();
        
        // ==========================================
        // 5. TERNARY OPERATOR (Conditional Operator)
        // ==========================================
        System.out.println("5. TERNARY OPERATOR:");
        int number = 15;
        String result = (number % 2 == 0) ? "Even Number" : "Odd Number";
        System.out.println(number + " is " + result);
        
        int a = 10, b = 20;
        int max = (a > b) ? a : b;
        System.out.println("Maximum of " + a + " and " + b + " is: " + max);
        System.out.println();
        
        // ==========================================
        // 6. SWITCH STATEMENT (without break)
        // ==========================================
        System.out.println("6. SWITCH WITHOUT BREAK (Fall-through):");
        int dayWithoutBreak = 3;
        System.out.print("Day " + dayWithoutBreak + " and onwards: ");
        switch (dayWithoutBreak) {
            case 1:
                System.out.print("Monday ");
            case 2:
                System.out.print("Tuesday ");
            case 3:
                System.out.print("Wednesday ");
            case 4:
                System.out.print("Thursday ");
            case 5:
                System.out.print("Friday ");
            case 6:
                System.out.print("Saturday ");
            case 7:
                System.out.print("Sunday ");
            default:
                System.out.println("(Fall-through example)");
        }
        System.out.println();
        
        // ==========================================
        // 7. SWITCH STATEMENT (with break)
        // ==========================================
        System.out.println("7. SWITCH WITH BREAK:");
        int day = 5;
        String dayName;
        
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }
        System.out.println("Day " + day + " is: " + dayName);
        System.out.println();
        
        // ==========================================
        // 8. SWITCH STATEMENT - Month Days Example
        // ==========================================
        System.out.println("8. SWITCH - MONTH DAYS EXAMPLE:");
        int month = 2;
        int year = 2024;
        int daysInMonth;
        
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                daysInMonth = 31;
                break;
            case 4: case 6: case 9: case 11:
                daysInMonth = 30;
                break;
            case 2:
                // Check for leap year
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                break;
            default:
                daysInMonth = -1;
                System.out.println("Invalid month!");
                break;
        }
        
        if (daysInMonth > 0) {
            System.out.println("Month " + month + " in year " + year + " has " + daysInMonth + " days");
        }
        System.out.println();
        
        // ==========================================
        // 9. SWITCH STATEMENT - Calculator Example
        // ==========================================
        System.out.println("9. SWITCH - CALCULATOR EXAMPLE:");
        int num1 = 20, num2 = 5;
        char operator = '/';
        double calcResult = 0;
        boolean validOperation = true;
        
        switch (operator) {
            case '+':
                calcResult = num1 + num2;
                break;
            case '-':
                calcResult = num1 - num2;
                break;
            case '*':
                calcResult = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    calcResult = (double) num1 / num2;
                } else {
                    System.out.println("Error: Division by zero!");
                    validOperation = false;
                }
                break;
            case '%':
                calcResult = num1 % num2;
                break;
            default:
                System.out.println("Invalid operator!");
                validOperation = false;
                break;
        }
        
        if (validOperation) {
            System.out.println(num1 + " " + operator + " " + num2 + " = " + calcResult);
        }
        System.out.println();
        
        // ==========================================
        // 10. SWITCH STATEMENT - Vowel/Consonant Example
        // ==========================================
        System.out.println("10. SWITCH - VOWEL/CONSONANT CHECKER:");
        char letter = 'E';
        
        switch (Character.toLowerCase(letter)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(letter + " is a Vowel");
                break;
            default:
                if (Character.isLetter(letter)) {
                    System.out.println(letter + " is a Consonant");
                } else {
                    System.out.println(letter + " is not a letter");
                }
                break;
        }
        System.out.println();
        
        // ==========================================
        // 11. NESTED SWITCH STATEMENT
        // ==========================================
        System.out.println("11. NESTED SWITCH STATEMENT:");
        String department = "IT";
        int yearOfStudy = 2;
        
        switch (department) {
            case "IT":
                System.out.println("Department: Information Technology");
                switch (yearOfStudy) {
                    case 1:
                        System.out.println("Subjects: Programming Fundamentals, Math, Physics");
                        break;
                    case 2:
                        System.out.println("Subjects: Data Structures, Algorithms, Database");
                        break;
                    case 3:
                        System.out.println("Subjects: Web Development, Networks, OS");
                        break;
                    case 4:
                        System.out.println("Subjects: AI, Machine Learning, Project");
                        break;
                    default:
                        System.out.println("Invalid year");
                        break;
                }
                break;
            case "CS":
                System.out.println("Department: Computer Science");
                switch (yearOfStudy) {
                    case 1:
                        System.out.println("Subjects: C Programming, Discrete Math");
                        break;
                    case 2:
                        System.out.println("Subjects: Java, Python, Theory of Computation");
                        break;
                    default:
                        System.out.println("Invalid year");
                        break;
                }
                break;
            default:
                System.out.println("Department not found");
                break;
        }
        System.out.println();
        
        // ==========================================
        // 12. SWITCH EXPRESSION (Java 14+)
        // ==========================================
        System.out.println("12. MODERN SWITCH EXPRESSION (Java 14+):");
        int dayNum = 3;
        
        // Traditional switch with break (shown above)
        // Modern switch expression (no break needed)
        String dayType = switch (dayNum) {
            case 1, 2, 3, 4, 5 -> "Weekday";
            case 6, 7 -> "Weekend";
            default -> "Invalid day";
        };
        System.out.println("Day " + dayNum + " is a: " + dayType);
        System.out.println();
        
        // ==========================================
        // 13. BREAK IN LOOPS WITH CONDITIONALS
        // ==========================================
        System.out.println("13. BREAK STATEMENT IN LOOPS:");
        
        // Break in for loop
        System.out.println("Finding first even number greater than 10:");
        for (int i = 1; i <= 20; i++) {
            if (i > 10 && i % 2 == 0) {
                System.out.println("Found: " + i);
                break; // Exit loop when condition is met
            }
        }
        System.out.println();
        
        // Break in while loop
        System.out.println("Sum until total exceeds 50:");
        int sum = 0;
        int counter = 1;
        while (true) {
            sum += counter;
            if (sum > 50) {
                System.out.println("Sum exceeded 50 at number: " + counter);
                System.out.println("Total sum: " + sum);
                break; // Exit infinite loop
            }
            counter++;
        }
        System.out.println();
        
        // ==========================================
        // 14. LABELED BREAK STATEMENT
        // ==========================================
        System.out.println("14. LABELED BREAK (Breaking nested loops):");
        
        outerLoop:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("i = " + i + ", j = " + j);
                if (i == 2 && j == 2) {
                    System.out.println("Breaking out of both loops!");
                    break outerLoop; // Break out of outer loop
                }
            }
        }
        System.out.println("After nested loops\n");
        
        // ==========================================
        // 15. COMPLEX CONDITIONAL EXAMPLE
        // ==========================================
        System.out.println("15. COMPLEX CONDITIONAL - LOGIN SYSTEM:");
        String username = "admin";
        String password = "pass123";
        boolean isActive = true;
        int loginAttempts = 2;
        
        if (!isActive) {
            System.out.println("Account is deactivated!");
        } else if (loginAttempts >= 3) {
            System.out.println("Account locked due to multiple failed attempts!");
        } else {
            if (username.equals("admin") && password.equals("pass123")) {
                System.out.println("Login Successful! Welcome " + username);
                switch (username) {
                    case "admin":
                        System.out.println("Access Level: Administrator");
                        break;
                    case "user":
                        System.out.println("Access Level: Regular User");
                        break;
                    default:
                        System.out.println("Access Level: Guest");
                        break;
                }
            } else {
                System.out.println("Invalid credentials!");
            }
        }
        
        System.out.println("\n=== END OF CONDITIONAL STATEMENTS DEMO ===");
    }
}
