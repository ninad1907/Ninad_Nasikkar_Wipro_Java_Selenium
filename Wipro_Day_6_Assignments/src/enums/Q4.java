/*Priority Levels with Extra Data
Implement enum PriorityLevel with constants (LOW, MEDIUM, HIGH, CRITICAL), each having:
•	A numeric severity code.
•	A boolean isUrgent() if severity ≥ some threshold.
Print descriptions and check urgency.
*/
package enums;

enum PriorityLevel
{
    LOW(1),
    MEDIUM(3),
    HIGH(5),
    CRITICAL(10);

    private int severity;

    PriorityLevel(int severity)
    {
        this.severity = severity;
    }

    boolean isUrgent()
    {
        return severity >= 5;
    }

    int getSeverity()
    {
        return severity;
    }
}

public class Q4
{
    public static void main(String[] args)
    {
        for (PriorityLevel p : PriorityLevel.values())
        {
            System.out.println(p + " severity: " + p.getSeverity() + ", urgent: " + p.isUrgent());
        }
    }
}

