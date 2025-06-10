package br.univille.log;
import java.time.ZoneId;
import java.time.ZonedDateTime;

class LoggerConsole implements Logger {
    public void log (Level level, String message){
        ZonedDateTime datahoraZona = ZonedDateTime.now();
        if (level == level.DEBUG){
            System.out.println("\u001b[32m"+ datahoraZona.withZoneSameInstant(ZoneId.of("America/Sao_Paulo")) +" "+ level +": "+ message);
        } else if (level == level.WARNING){
            System.out.println("\u001b[33m"+ datahoraZona.withZoneSameInstant(ZoneId.of("America/Sao_Paulo")) +" "+ level +": "+ message);
        } else if (level == level.ERROR){
            System.out.println("\u001b[31m"+ datahoraZona.withZoneSameInstant(ZoneId.of("America/Sao_Paulo")) +" "+ level +": "+ message);
        }
    }
}
