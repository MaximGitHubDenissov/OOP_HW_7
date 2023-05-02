
public class CalculableFactory implements IcalculableFactory {
    public ICalculable create(int real, int imagin) {
        return new ComplexCalc(real, imagin);
    }
}
