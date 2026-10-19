
public class Main {

    public static void main(String[] args) {

        final int[][] STUDENTS_MARKS = {
                {2, 7, 1},
                {3, 6, 9},
                {9, 8, 10},
                {2, 8, 5}
        };

        Main main = new Main();
        main.displayStudentsMarks(STUDENTS_MARKS);

    }

    public void displayStudentsMarks(int[][] STUDENTS_MARKS) {


        System.out.println("Students marks: ");
        int total = 0;
        int counter = 0;

        for (int i = 0; i < STUDENTS_MARKS.length; i++) {

            System.out.print("Student " + (i + 1) + ": ");

            for (int j = 0; j < STUDENTS_MARKS[i].length; j++) {
                System.out.print(STUDENTS_MARKS[i][j] + " ");
                total += STUDENTS_MARKS[i][j];
                counter++;
            }

            int average = countAverage(total, counter);

            System.out.print("| AVG: " + average);
            String classifiedResult = classifyResult(average);
            System.out.print(" | " + classifiedResult);
            counter = 0;
            total = 0;
            System.out.println();
        }

    }

    public int countAverage(int total, int counter) {

        return (total / counter);

    }

    public String classifyResult(int average){

        switch (average){
            case 1,2,3: return "Bad";
            case 4,5: return "Average";
            case 6,7,8: return "Good";
            case 9, 10: return "Excellent";
            default: return  "Error";
        }


    }

}
