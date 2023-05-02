import java.util.Date;

public class Logger implements Logable {

    
    @Override
    public void log(String text) {
        Date date = new Date();
        System.out.printf("%s: %s", date.toString(), text);
        
    }
    
}
