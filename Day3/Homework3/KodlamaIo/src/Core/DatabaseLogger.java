package Core;

public class DatabaseLogger implements ILogger{
    public void log(String message) {
        System.out.println("Logged to database : " + message);
    }
}
