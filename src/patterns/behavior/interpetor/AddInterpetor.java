package patterns.behavior.interpetor;

/**
 * @author One
 * @description
 * @date 2019/01/09
 */
public class AddInterpetor implements Interpetor {
    private final int num1;
    private final int num2;

    public AddInterpetor(Interpetor num1, Interpetor num2) {
        this.num1 = num1.interpet();
        this.num2 = num2.interpet();
    }

    @Override
    public int interpet() {
        return num1 + num2;
    }
}
