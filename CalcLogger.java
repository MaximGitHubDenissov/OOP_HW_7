
public class CalcLogger implements ICalculable {
    private ICalculable calculable;
    private Logable logable;

    public CalcLogger(ICalculable calculable, Logable logable) {
        this.calculable = calculable;
        this.logable = logable;
    }

    @Override
    public void sum(int real, int imagin) {
        logable.log("Прибавляем число\n");
        calculable.sum(real, imagin);

    }

    @Override
    public void diff(int real, int imagin) {
        logable.log("Отнимаем число\n");
        calculable.diff(real, imagin);

    }

    @Override
    public String getResult() {
        logable.log("Получаем результат\n");
        return calculable.getResult();
    }

}
