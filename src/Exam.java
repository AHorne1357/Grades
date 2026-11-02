//Austin Horne

public class Exam extends Assessment {
    private int numQuestions;
    private int numMissed;
    private int pointsEach;


    public Exam(int questions, int missed) {
        numQuestions = questions;
        numMissed = missed;

        if (numQuestions > 0) {
            pointsEach = 100 / numQuestions;
        } else {
            pointsEach = 0;
        }

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