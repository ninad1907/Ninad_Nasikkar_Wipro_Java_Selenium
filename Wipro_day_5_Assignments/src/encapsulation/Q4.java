/*Inner Class Encapsulation: Secure Locker
Encapsulate helper logic inside the class.
•	Implement a class Locker with private fields such as lockerId, isLocked, and passcode.
•	Use an inner private class SecurityManager to handle passcode verification logic.
•	Only expose public methods: lock(), unlock(String code), isLocked().
•	Password attempts should not leak verification logic externally—only success/failure.
•	Ensure no direct access to passcode or the inner SecurityManager from outside.
*/
package encapsulation;
class Locker {
    private String lockerId;
    private boolean isLocked;
    private String passcode;

    
    private class SecurityManager {
        private boolean verifyPasscode(String input) {
            return passcode.equals(input);
        }
    }

    public Locker(String lockerId, String passcode) {
        this.lockerId = lockerId;
        this.passcode = passcode;
        this.isLocked = true; 
        System.out.println("Locker " + lockerId + " created and locked.");
    }

    public void lock() {
        if (!isLocked) {
            isLocked = true;
            System.out.println("Locker " + lockerId + " is now locked.");
        } else {
            System.out.println("Locker " + lockerId + " is already locked.");
        }
    }

    public void unlock(String code) {
        SecurityManager sm = new SecurityManager();
        if (sm.verifyPasscode(code)) {
            if (isLocked) {
                isLocked = false;
                System.out.println("Locker " + lockerId + " has been unlocked successfully.");
            } else {
                System.out.println("Locker " + lockerId + " is already unlocked.");
            }
        } else {
            System.out.println("Unlock failed. Incorrect passcode.");
        }
    }

    public boolean isLocked() {
        return isLocked;
    }
}

// Demo class
public class Q4 {
    public static void main(String[] args) {
        Locker myLocker = new Locker("L123", "secure123");

        myLocker.unlock("wrongpass");   
        myLocker.unlock("secure123");   
        myLocker.lock();                
        myLocker.lock();                
        myLocker.unlock("secure123");   
    }
}
