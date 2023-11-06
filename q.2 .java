import java.util.HashMap;
import java.util.Map;

public class StudentDataProcessing {
    public static void main(String[] args) {
        String studentData = "John:85, Alice:92, Bob:78, Carol:95, David:88, Emma:79, Frank:90";
        String[] studentRecords = studentData.split(", ");

        Map<String, Integer> studentScores = new HashMap<>();
        int totalScore = 0;
        String topScorer = null;
        String lowestScorer = null;
        int highestScore = Integer.MIN_VALUE;
        int lowestScore = Integer.MAX_VALUE;

        for (String record : studentRecords) {
            String[] parts = record.split(":");
            String studentName = parts[0];
            int score = Integer.parseInt(parts[1]);

            // Update the total score
            totalScore += score;

            // Update the highest and lowest scores and their respective students
            if (score > highestScore) {
                highestScore = score;
                topScorer = studentName;
            }
            if (score < lowestScore) {
                lowestScore = score;
                lowestScorer = studentName;
            }

            // Add the student's score to the map
            studentScores.put(studentName, score);
        }

        int numStudents = studentRecords.length;
        float averageScore = (float) totalScore / numStudents;

        System.out.println("Student Data Processing Results:");
        System.out.println("Total number of students: " + numStudents);
        System.out.println("Average marks of all students: " + averageScore);
        System.out.println("Student with the highest score: " + topScorer + " : " + highestScore);
        System.out.println("Student with the lowest score: " + lowestScorer + " : " + lowestScore);
    }
}

