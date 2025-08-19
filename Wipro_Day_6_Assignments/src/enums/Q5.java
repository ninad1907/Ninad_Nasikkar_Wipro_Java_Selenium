/*Traffic Light State Machine
Implement enum TrafficLight implementing interface State, with constants RED, GREEN, YELLOW.
Each must override State next() to transition in the cycle.
Simulate and print six transitions starting from RED.
*/
package enums;

interface State
{
    TrafficLight next();
}

enum TrafficLight implements State
{
    RED
    {
        public TrafficLight next()
        {
            return GREEN;
        }
    },
    GREEN
    {
        public TrafficLight next()
        {
            return YELLOW;
        }
    },
    YELLOW
    {
        public TrafficLight next()
        {
            return RED;
        }
    };
}

public class Q5
{
    public static void main(String[] args)
    {
        TrafficLight current = TrafficLight.RED;

        for (int i = 0; i < 6; i++)
        {
            System.out.println("Current light: " + current);
            current = current.next();
        }
    }
}
