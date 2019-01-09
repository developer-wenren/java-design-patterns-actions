package patterns.behavior.interpetor;

/**
 * @author One
 * @description
 * @date 2019/01/09
 */
public class CustomeExpressionParser implements Interpetor {
    private Interpetor interpetor;

    public CustomeExpressionParser(String expressionStr) {
        String[] symbols = expressionStr.split(" ");
        NumberInterpetor numberInterpetor1 = new NumberInterpetor(symbols[0]);
        NumberInterpetor numberInterpetor2 = new NumberInterpetor(symbols[2]);
        this.interpetor = new AddInterpetor(numberInterpetor1, numberInterpetor2);
    }

    @Override
    public int interpet() {
        return interpetor.interpet();
    }
}
