public class LogLine {
    private String logLine;

    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        String abbreviation = this.logLine.substring(1,4);

        return switch (abbreviation) {
            case "TRC" -> LogLevel.TRACE;
            case "DBG" -> LogLevel.DEBUG;
            case "INF" -> LogLevel.INFO;
            case "WRN" -> LogLevel.WARNING;
            case "ERR" -> LogLevel.ERROR;
            case "FTL" -> LogLevel.FATAL;
            default    -> LogLevel.UNKNOWN;
        };
    }

    public String getOutputForShortLog() {
        String abbreviation = this.logLine.substring(1,4);
        String msg = this.logLine.substring(7);

        return switch (abbreviation) {
            case "TRC" -> "1:" + msg;
            case "DBG" -> "2:" + msg;
            case "INF" -> "4:" + msg;
            case "WRN" -> "5:" + msg;
            case "ERR" -> "6:" + msg;
            case "FTL" -> "42:" + msg;
            default    -> "0:" + msg;
        };
    }
}
