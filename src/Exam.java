//Austin Horne

public class Exam extends Assessment {
    private int numQuestions;
    private int numMissed;
    private int pointsEach;


    public Exam(int questions, int missed) {
        numQuestions = questions;
        numMissed = missed;

        // Calculate points each question is worth (assuming 100 total points)
        if (numQuestions > 0) {
            pointsEach = 100 / numQuestions;
        } else {
            pointsEach = 0;
        }

        // Calculate the numeric score and set it in the parent Assessment class
        int score = 100 - (numMissed * pointsEach);
        setScore(score);
    }


    public int getPointsEach() {
        return pointsEach;
    }


    public int getNumMissed() {
        return numMissed;
    }
}