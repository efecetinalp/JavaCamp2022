package Core;

public class ConsoleLogger implements  ILogger{
    public void log(String message) {
        System.out.println("Logged to console : " + message);
    }
}
