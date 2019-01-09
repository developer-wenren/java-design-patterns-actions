package patterns.behavior.interpetor;

/**
 * @author One
 * @description
 * @date 2019/01/09
 */
public class NumberInterpetor implements Interpetor {
    private int num;

    public NumberInterpetor(String num) {
        this.num = Integer.parseInt(num);
    }

    @Override
    public int interpet() {
        return this.num;
    }
}
