/*Difficulty Level & Game Setup
Define enum Difficulty with EASY, MEDIUM, HARD.
Write a Game class that takes a Difficulty and prints logic like:
•	EASY → 3000 bullets, MEDIUM → 2000, HARD → 1000.
Use a switch(diff) inside constructor or method.
*/
package enums;

enum Difficulty
{
    EASY,
    MEDIUM,
    HARD
}

class Game
{
    int bullets;

    Game(Difficulty diff)
    {
        switch(diff)
        {
            case EASY:
                bullets = 3000;
                break;
            case MEDIUM:
                bullets = 2000;
                break;
            case HARD:
                bullets = 1000;
                break;
        }
    }

    void showSetup()
    {
        System.out.println("Game setup: bullets = " + bullets);
    }
}

public class Q6
{
    public static void main(String[] args)
    {
        Game easyGame = new Game(Difficulty.EASY);
        easyGame.showSetup();

        Game mediumGame = new Game(Difficulty.MEDIUM);
        mediumGame.showSetup();

        Game hardGame = new Game(Difficulty.HARD);
        hardGame.showSetup();
    }
}
