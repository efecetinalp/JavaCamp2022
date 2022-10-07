package Core;

public class FileLogger implements ILogger{
    public void log(String message) {
        System.out.println("Logged to file : " + message);
    }
}
