package br.univille.log;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.ZoneId;
import java.time.ZonedDateTime;

class LoggerFile implements Logger {
    public void log (Level level, String message) {
        ZonedDateTime datahoraZona = ZonedDateTime.now();
        String filename = "log.txt";
        String mensagem = datahoraZona.withZoneSameInstant(ZoneId.of("America/Sao_Paulo")) +" "+ level +": "+ message +"\n";
        try {
            Files.write(Paths.get(filename), mensagem.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("Erro ao salvar arquivo");
            e.printStackTrace();
        }
    }
}
