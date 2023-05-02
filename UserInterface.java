import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private IcalculableFactory icalculableFactory;

    public UserInterface(IcalculableFactory icalculableFactory) {
        this.icalculableFactory = icalculableFactory;
    }

    public void run() {
        while (true) {
            List<Integer> firstArg = promptComplex("Введите комплексное число в формате x1+x2i");
            ICalculable complexCalc = icalculableFactory.create(firstArg.get(0), firstArg.get(1));
            while(true){
                String cmd = prompt("Введите операцию (+, - , =)");
                if(cmd.equals("+")){
                    List<Integer> arg = promptComplex("Введите второе комплексное число");
                    complexCalc.sum(arg.get(0), arg.get(1));
                    continue;
                }
                if (cmd.equals("-")){
                    List<Integer> arg = promptComplex("Введите второе комплексное число");
                    complexCalc.diff(arg.get(0), arg.get(1));
                    continue;
                }
                if (cmd.equals("=")){
                    System.out.println(complexCalc.getResult());
                    break;
                }

            }

        }
    }

    public String prompt(String message){
        System.out.println(message);
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public List<Integer> promptComplex(String message) {
        System.out.println(message);
        List<Integer> result = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String res = in.nextLine();
        String[] lst = res.split("");
        String signRe = "";
        String signIm = "";
        String re = "";
        String im = "";
        int i = 0;
        boolean Flag = false;
        if (lst[0].equals("-")) {
            i = 1;
            signRe = lst[0];
        }
        while (i < lst.length - 1) {
            if (Flag == false) {
                if (lst[i].equals("-") || lst[i].equals("+")) {
                    signIm = lst[i];
                    i++;
                    Flag = true;
                } else {
                    re += lst[i];
                    i++;
                }
            } else {
                im += lst[i];
                i++;
            }

        }
        result.add(Integer.parseInt(signRe + re));
        result.add(Integer.parseInt(signIm + im));
        return result;

    }
}