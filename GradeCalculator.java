import javax.swing.*;

public class GradeCalculator {
   public static void main(String[] args) {
      int numSubjects = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of subjects: "));
      int[] marks = new int[numSubjects];
      int totalMarks = 0;
      for (int i = 0; i < numSubjects; i++) {
         marks[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter marks obtained in subject(Out of 100) " + (i+1) + ": "));
         totalMarks += marks[i];
      }
      double avgPercentage = (double) totalMarks / numSubjects;
      String grade;
      if (avgPercentage >= 90) {
         grade = "A+";
      } else if (avgPercentage >= 80) {
         grade = "A";
      } else if (avgPercentage >= 70) {
         grade = "B";
      } else if (avgPercentage >= 60) {
         grade = "C";
      } else if (avgPercentage >= 50) {
         grade = "D";
      } else {
         grade = "F";
      }
      String message = "Total Marks: " + totalMarks + "\nAverage Percentage: " + avgPercentage + "%\nGrade: " + grade;
      JOptionPane.showMessageDialog(null, message, "Results", JOptionPane.INFORMATION_MESSAGE);
   }
}