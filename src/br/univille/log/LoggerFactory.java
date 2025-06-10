package br.univille.log;

public class LoggerFactory {
    public static Logger onConsole() {
        LoggerConsole console = new LoggerConsole();
        return console;
    }
    public static Logger onFile () {
        LoggerFile file = new LoggerFile();
        return file;
    }
}
