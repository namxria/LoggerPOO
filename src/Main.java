import br.univille.log.Level;
import br.univille.log.LoggerFactory;

public class Main {
    public static void main(String[] args) {
        LoggerFactory.onConsole().log(Level.DEBUG, "Teste");
        LoggerFactory.onConsole().log(Level.WARNING, "Teste");
        LoggerFactory.onConsole().log(Level.ERROR, "Teste");
        LoggerFactory.onFile().log(Level.DEBUG, "Teste");
        LoggerFactory.onFile().log(Level.WARNING, "Teste");
        LoggerFactory.onFile().log(Level.ERROR, "Teste");
    }
}
