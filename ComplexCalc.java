public class ComplexCalc implements ICalculable {
    private int firstreal;
    private int firstimagin; 
    
    public ComplexCalc(int firstreal, int firstimagin){
        this.firstreal = firstreal;
        this.firstimagin = firstimagin;

    }
    @Override
    public void sum(int real, int imagin) {
        firstreal += real;
        firstimagin += imagin;
    }

    @Override
    public void diff(int real, int imagin) {
        firstreal -=real;
        firstimagin -=firstimagin;
        
    }
    @Override
    public String getResult() {
        String sign = "";
        if(firstimagin<0){
            sign ="-";
        }
        else sign = "+";
        return String.format("Результат: %d%s%di", firstreal,sign,Math.abs(firstimagin));
    }
    
}
