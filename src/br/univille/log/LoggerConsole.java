package br.univille.log;

class LoggerConsole implements Logger {
    public void log (Level level, String message){
        if (level == level.DEBUG){
            System.out.println("\u001b[32m"+ level +": \u001b[0m"+ message);
        } else if (level == level.WARNING){
            System.out.println("\u001b[33m"+ level +": \u001b[0m"+ message);
        } else if (level == level.ERROR){
            System.out.println("\u001b[31m"+ level +": \u001b[0m"+ message);
        }
    }
}
