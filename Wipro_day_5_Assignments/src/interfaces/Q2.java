/*Moveable Shapes Simulation
•	Define an interface Movable with methods: moveUp(), moveDown(), moveLeft(), moveRight().
•	Implement classes:
o	MovablePoint(x, y, xSpeed, ySpeed) implements Movable
o	MovableCircle(radius, center: MovablePoint)
o	MovableRectangle(topLeft: MovablePoint, bottomRight: MovablePoint) (ensuring both points have same speed)
•	Provide toString() to display positions.
•	In main(), create a few objects and call move methods to simulate motion.
*/
package interfaces;

interface Movable
{
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

class MovablePoint implements Movable
{
    int x;
    int y;
    int xs;
    int ys;

    MovablePoint(int x, int y, int xs, int ys)
    {
        this.x = x;
        this.y = y;
        this.xs = xs;
        this.ys = ys;
    }

    public void moveUp()
    {
        y += ys;
    }

    public void moveDown()
    {
        y -= ys;
    }

    public void moveLeft()
    {
        x -= xs;
    }

    public void moveRight()
    {
        x += xs;
    }

    public String toString()
    {
        return x + "," + y;
    }
}

class MovableCircle implements Movable
{
    int r;
    MovablePoint c;

    MovableCircle(int r, MovablePoint c)
    {
        this.r = r;
        this.c = c;
    }

    public void moveUp()
    {
        c.moveUp();
    }

    public void moveDown()
    {
        c.moveDown();
    }

    public void moveLeft()
    {
        c.moveLeft();
    }

    public void moveRight()
    {
        c.moveRight();
    }

    public String toString()
    {
        return "Circle(" + c + ")";
    }
}

class MovableRectangle implements Movable
{
    MovablePoint t;
    MovablePoint b;

    MovableRectangle(MovablePoint t, MovablePoint b)
    {
        this.t = t;
        this.b = b;
    }

    public void moveUp()
    {
        t.moveUp();
        b.moveUp();
    }

    public void moveDown()
    {
        t.moveDown();
        b.moveDown();
    }

    public void moveLeft()
    {
        t.moveLeft();
        b.moveLeft();
    }

    public void moveRight()
    {
        t.moveRight();
        b.moveRight();
    }

    public String toString()
    {
        return "Rect(" + t + " to " + b + ")";
    }
}
public class Q2
{
    public static void main(String[] args)
    {
        MovablePoint p = new MovablePoint(0, 0, 1, 1);
        MovableCircle c = new MovableCircle(5, new MovablePoint(2, 2, 1, 1));
        MovableRectangle r = new MovableRectangle(new MovablePoint(0, 5, 2, 2), new MovablePoint(4, 1, 2, 2));

        p.moveUp();
        c.moveRight();
        r.moveDown();

        System.out.println(p);
        System.out.println(c);
        System.out.println(r);
    }
}

