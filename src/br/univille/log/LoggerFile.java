package br.univille.log;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

class LoggerFile implements Logger {
    public void log (Level level, String message) {
        String filename = "log.txt";
        String mensagem = level +": "+ message +"\n";
        try {
            Files.write(Paths.get(filename), mensagem.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("Erro ao salvar arquivo");
            e.printStackTrace();
        }
    }
}
