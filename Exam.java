/*
 * This class represents an exam.
 */
public class Exam extends Assessment {

    // stores how many points each question is worth
    private double pointsEach;

    /*
     * Constructor for the Exam class
     * questions = total number of questions on the test
     * missed = how many questions the student got wrong
     */
    public Exam(int questions, int missed) {

        // figure out how much each question is worth
        pointsEach = 100.0 / questions;

        // calculate the final score based on missed questions
        int score = (int)(100 - (missed * pointsEach));

        // use the method from Assessment to set the score
        setScore(score);
    }

    /*
     * returns how many points each question is worth
     */
    public double getPointsEach() {
        return pointsEach;
    }
}