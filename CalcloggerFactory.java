public class CalcloggerFactory implements IcalculableFactory{
    private Logable logable;

    public CalcloggerFactory( Logable logable){
        this.logable = logable;
    }
    @Override
    public ICalculable create(int real, int imagin) {
        return new CalcLogger(new ComplexCalc(real, imagin), logable);
    }
    
}
