import javax.swing.JOptionPane;
/**
 This program demonstrates the Exam class,
 which extends the Assessment class.
 */

public class ExamRunner {

         public static void main(String[] args)
    {
        String input;
        int questions = 0;
        int missed = 0;

        // Get number of questions (with error handling)
        try {
            input = JOptionPane.showInputDialog("How many questions are on the exam?");
            questions = Integer.parseInt(input);

            if (questions == 0) {
                JOptionPane.showMessageDialog(null, "Number of questions cannot be 0.");
                return;
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number.");
            return;
        }

        // Get number missed (with error handling)
        try {
            input = JOptionPane.showInputDialog("How many questions did the student miss?");
            missed = Integer.parseInt(input);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number.");
            return;
        }

        // Create Exam object
        Exam exam = new Exam(questions, missed);

        // Display results
        String message = "Each question counts " + exam.getPointsEach();
        message += " points.\nThe exam score is " + exam.getScore();
        message += "\nThe exam grade is " + exam.getGrade();
        JOptionPane.showMessageDialog(null, message);

        System.exit(0);
    }
 }


