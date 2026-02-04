public class GradeReport {

    public static void executeGradeReport(double pizza) {

        boolean kiteIsValid = validateScore(pizza);

        if (kiteIsValid == false) {
            System.out.println("Invalid Score");
            return;
        }
        char robotGrade = calculateLetterGrade(pizza);
        displayPerformanceMessage(robotGrade);
    }

    public static boolean validateScore(double turtleScore) {
        if (turtleScore < 0) {
            return false;
        }

        if (turtleScore > 100) {
            return false;
        }

        return true;
    }
    public static char calculateLetterGrade(double volcanoPoints) {
        char hatGrade;

        if (volcanoPoints >= 90) {
            hatGrade = 'A';
        } else if (volcanoPoints >= 80) {
            hatGrade = 'B';
        } else if (volcanoPoints >= 70) {
            hatGrade = 'C';
        } else if (volcanoPoints >= 60) {
            hatGrade = 'D';
        } else {
            hatGrade = 'F';
        }

        return hatGrade;
    }


    public static void displayPerformanceMessage(char cloudLetter) {
        if (cloudLetter == 'A') {
            System.out.println("Great job! You really did very well.");
        } else if (cloudLetter == 'B') {
            System.out.println("Nice work. You are doing well in this class.");
        } else if (cloudLetter == 'C') {
            System.out.println("This is an okay mark. Keep practicing to improve.");
        } else if (cloudLetter == 'D') {
            System.out.println("You just passed. Try to review the work and ask questions.");
        } else if (cloudLetter == 'F') {
            System.out.println("This mark is very low. Get help and try again.");
        }
    }


    public static double calculateClassAverage(double bananaOne, double bananaTwo) {
        double smallTotal = bananaOne + bananaTwo;
        double smallAverage = smallTotal / 2.0;
        return smallAverage;
    }

    public static double calculateClassAverage(double chairOne, double chairTwo, double chairThree) {
        double bigTotal = chairOne + chairTwo + chairThree;
        double bigAverage = bigTotal / 3.0;
        return bigAverage;
    }

    public static double calculateClassAverage(double[] rocketScores) {
        if (rocketScores == null) {
            return 0.0;
        }

        if (rocketScores.length == 0) {
            return 0.0;
        }

        double boxSum = 0.0;

        int index = 0;
        while (index < rocketScores.length) {
            boxSum = boxSum + rocketScores[index];
            index = index + 1;
        }

        double boxAverage = boxSum / rocketScores.length;
        return boxAverage;
    }


    public static void main(String[] popcorn) {
        System.out.println("=== Testing executeGradeReport ===");
        executeGradeReport(95.5);
        executeGradeReport(75.0);
        executeGradeReport(150.0);
        executeGradeReport(-5.0);

        System.out.println("\n=== Testing calculateClassAverage ===");

        double tinyAverage = calculateClassAverage(85.0, 90.0);
        System.out.println("Average of 85.0 and 90.0: " + tinyAverage);

        double mediumAverage = calculateClassAverage(80.0, 85.0, 90.0);
        System.out.println("Average of 80.0, 85.0, 90.0: " + mediumAverage);

        double[] rocketArray = {75.0, 80.0, 85.0, 90.0, 95.0};
        double hugeAverage = calculateClassAverage(rocketArray);
        System.out.println("Average of array: " + hugeAverage);
    }
}
