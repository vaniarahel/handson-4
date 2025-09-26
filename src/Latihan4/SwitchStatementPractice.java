package Latihan4;

/**
 * Hands-On Practice: Switch Statement
 *
 * LEARNING OBJECTIVES:
 * 1. Understand switch statement syntax
 * 2. Practice using switch with different data types
 * 3. Learn when to use switch vs if-else if
 *
 * INSTRUCTIONS:
 * 1. Complete all TODO exercises below
 * 2. Run the program to test your solutions
 * 3. Try different values to test all cases
 */

public class SwitchStatementPractice {
    public static void main(String[] args) {
        System.out.println("=== SWITCH STATEMENT EXERCISES ===\\n");

        // TODO 1: Day of Week
        // Write a switch statement for day numbers (1-7):
        // 1: "Monday", 2: "Tuesday", 3: "Wednesday", 4: "Thursday"
        // 5: "Friday", 6: "Saturday", 7: "Sunday"
        // default: "Invalid day"
        int dayNumber = 3;
        // Your code here:
       String namaHari;
       switch (dayNumber){
           case 1:
               namaHari = "Monday";
               break;
           case 2:
               namaHari = "Tuesday";
               break;
           case 3:
               namaHari = "Wednesday";
               break;
           case 4:
               namaHari = "Thursday";
               break;
           case 5:
               namaHari = "Friday";
               break;
           case 6:
               namaHari = "Saturday";
               break;
           case 7:
               namaHari = "Sunday";
               break;
           default:
               namaHari = "Invalid day";
       }
        System.out.println(namaHari);

        // TODO 2: Grade to GPA
        // Write a switch statement for letter grades:
        // 'A': "4.0 GPA", 'B': "3.0 GPA", 'C': "2.0 GPA"
        // 'D': "1.0 GPA", 'F': "0.0 GPA"
        // default: "Invalid grade"
        char letterGrade = 'B';
        // Your code here:
        String gpa;

        switch (letterGrade){
            case 'A':
                gpa = "4.0 GPA";
                break;
            case 'B':
                gpa = "3.0 GPA";
                break;
            case 'C':
                gpa = "2.0 GPA";
                break;
            case 'D':
                gpa = "1.0 GPA";
                break;
            case 'F':
                gpa = "0.0 GPA";
                break;
            default:
                gpa = " Invalid grade";
        }
        System.out.println(gpa);

        // TODO 3: Month Days
        // Write a switch statement for months (1-12) showing number of days:
        // 1,3,5,7,8,10,12: "31 days"
        // 4,6,9,11: "30 days"
        // 2: "28 or 29 days"
        // default: "Invalid month"
        int month = 4;
        // Your code here:
        String days;
        switch (month){
            case 1,3,5,7,8,10,12:
                days = "31 days";
                break;
            case 4,6,9,11:
                days = "30 days";
                break;
            case 2:
                days = "28 or 29 days";
                break;
            default:
                days = "Invalid month";
        }
        System.out.println(days);


        // TODO 4: Traffic Light Action
        // Write a switch statement for traffic light colors:
        // "red": "Stop and wait"
        // "yellow": "Prepare to stop"
        // "green": "Go safely"
        // default: "Invalid signal"
        String trafficLight = "yellow";
        // Your code here:
        String sign;
        switch (trafficLight){
            case "red":
                sign = "Stop and wait";
                break;
            case "yellow":
                sign = "Prepare to stop";
                break;
            case "green":
                sign = "Go safely";
                break;
            default:
                sign = "Invalid signal";
        }
        System.out.println(sign);

        // TODO 5: Calculator Operations
        // Write a switch statement for basic math operations:
        // '+': "Addition operation"
        // '-': "Subtraction operation"
        // '*': "Multiplication operation"
        // '/': "Division operation"
        // default: "Unknown operation"
        char operation = '*';
        // Your code here:
        String meaning;
        switch (operation){
            case '+':
                meaning = "Addition operation";
                break;
            case '-':
                meaning = "Subtraction operation";
                break;
            case '*':
                meaning = "Multiplication operation";
                break;
            case '/':
                meaning = "Division operation";
                break;
            default:
                meaning = "Unknown operation";
        }
        System.out.println(meaning);

        // TODO 6: Season by Month
        // Write a switch statement grouping months into seasons:
        // 12,1,2: "Winter"
        // 3,4,5: "Spring"
        // 6,7,8: "Summer"
        // 9,10,11: "Fall"
        // default: "Invalid month"
        int seasonMonth = 7;
        // Your code here:
        String season;
        switch (seasonMonth){
            case 12, 1, 2:
                season = "Winter";
                break;
            case 3,4,5:
                season = "Spring";
                break;
            case 6,7,8:
                season = "Summer";
                break;
            case 9,10,11:
                season = "Fall";
                break;
            default:
                season = "Invalid month";
        }

        // TODO 7: Exam Grade Range
        // Write a switch statement for score ranges (use score/10):
        // 10,9: "Excellent"
        // 8: "Very good"
        // 7: "Good"
        // 6: "Satisfactory"
        // default: "Needs improvement"
        int examScore = 85; // Hint: use examScore/10 in switch
        // Your code here:
        String statement;
        switch (examScore){
            case 10, 9:
                statement = "Excellent";
                break;
            case 8:
                statement = "Very good";
                break;
            case 7:
                statement = "Good";
                break;
            case 6:
                statement = "Satisfactory";
                break;
            default:
                statement = "Needs improvement";
        }
        System.out.println(statement);

        // TODO 8: Browser Type
        // Write a switch statement for browser names:
        // "chrome": "Google Chrome browser"
        // "firefox": "Mozilla Firefox browser"
        // "safari": "Apple Safari browser"
        // "edge": "Microsoft Edge browser"
        // default: "Unknown browser"
        String browser = "chrome";
        // Your code here:
        String kepanjangan;
        switch (browser){
            case "chrome":
                kepanjangan = "Google Chrome browser";
                break;
            case "firefox":
                kepanjangan = "Mozilla Firefox browser";
                break;
            case "safari":
                kepanjangan = "Apple Safari browser";
                break;
            case "edge":
                kepanjangan = "Microsoft Edge browser";
                break;
            default:
                kepanjangan = "Unknown browser";
        }
        System.out.println(kepanjangan);

        // TODO 9: Priority Level
        // Write a switch statement for priority numbers:
        // 1: "Critical priority"
        // 2: "High priority"
        // 3: "Medium priority"
        // 4: "Low priority"
        // default: "Invalid priority"
        int priority = 2;
        // Your code here:
        String level;
        switch (priority){
            case 1:
                level = "Critical Priority";
                break;
            case 2:
                level = "High priority";
                break;
            case 3:
                level = "Medium priority";
                break;
            case 4:
                level = "Low priority";
                break;
            default:
                level = "Invalid priority";
        }

        // TODO 10: File Extension
        // Write a switch statement for file extensions:
        // "jpg", "png", "gif": "Image file"
        // "mp4", "avi", "mkv": "Video file"
        // "txt", "doc", "pdf": "Document file"
        // default: "Unknown file type"
        String fileExtension = "png";
        // Your code here:
        String usage;
        switch (fileExtension){
            case "jpg", "png", "gif":
                usage = "Image file";
                break;
            case "mp4", "avi", "mkv":
                usage = "Video file";
                break;
            case "txt", "doc", "pdf":
                usage = "Document file";
                break;
            default:
                usage = "Unknown file type";
        }
        System.out.println(usage);
    }
}

/**
 * SYNTAX REMINDER:
 * ===============
 * switch (variable) {
 *     case value1:
 *         // code for value1
 *         break;
 *     case value2:
 *         // code for value2
 *         break;
 *     default:
 *         // code for default case
 * }
 *
 * KEY POINTS:
 * - Use break; to prevent fall-through
 * - default case is optional but recommended
 * - Switch works with: int, char, String, enum
 * - Multiple cases can share the same code block
 * - Cases must be constant values (not variables)
 */

