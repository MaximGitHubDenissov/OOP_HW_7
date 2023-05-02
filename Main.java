

public class Main {
    public static void main(String[] args) {
        IcalculableFactory icalculableFactory = new CalcloggerFactory(new Logger());
        UserInterface userInterface = new UserInterface(icalculableFactory);
        userInterface.run();    
        };
    }

