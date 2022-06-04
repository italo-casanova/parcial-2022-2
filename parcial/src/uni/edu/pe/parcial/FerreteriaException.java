package uni.edu.pe.parcial;

public class FerreteriaException extends RuntimeException{
    public FerreteriaException(String string) {
        super("La red social un error: " + string);
    }
    public FerreteriaException() {
        super("La red social un error");
    }
}
