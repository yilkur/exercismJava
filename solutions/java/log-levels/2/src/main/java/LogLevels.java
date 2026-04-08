public class LogLevels {
    
    public static String message(String logLine) {
        String msg = logLine.split(":")[1].trim();
        return msg;
    }
    
    public static String logLevel(String logLine) {
        String lvl = logLine.split(":")[0].trim();
        return lvl.replaceAll("[^a-zA-Z]", "").toLowerCase();
    }

    public static String reformat(String logLine) {
        String[] parts = logLine.split(":");
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
