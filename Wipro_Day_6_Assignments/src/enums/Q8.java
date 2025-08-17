/*Knowledge Level from Score Range
Define enum KnowledgeLevel with constants BEGINNER, ADVANCED, PROFESSIONAL, MASTER.
Use a static method fromScore(int score) to return the appropriate enum:
•	0–3 → BEGINNER, 4–6 → ADVANCED, 7–9 → PROFESSIONAL, 10 → MASTER.
Then print the level and test boundary conditions.
*/
package enums;

enum KnowledgeLevel
{
    BEGINNER,
    ADVANCED,
    PROFESSIONAL,
    MASTER;

    static KnowledgeLevel fromScore(int score)
    {
        if (score >= 0 && score <= 3)
            return BEGINNER;
        else if (score >= 4 && score <= 6)
            return ADVANCED;
        else if (score >= 7 && score <= 9)
            return PROFESSIONAL;
        else if (score == 10)
            return MASTER;
        else
            throw new IllegalArgumentException("Score out of range");
    }
}

public class Q8
{
    public static void main(String[] args)
    {
        int[] testScores = {0, 3, 4, 6, 7, 9, 10};

        for (int score : testScores)
        {
            KnowledgeLevel level = KnowledgeLevel.fromScore(score);
            System.out.println("Score " + score + " → Level: " + level);
        }
    }
}

