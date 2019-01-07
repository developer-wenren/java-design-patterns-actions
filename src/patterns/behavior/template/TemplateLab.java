package patterns.behavior.template;

/**
 * @author One
 * @description 模板方法模式实验
 * @date 2019/01/08
 */
public class TemplateLab {
    public static void main(String[] args) {
        //煮红茶
        AbastractTea tea = new BlackTea();
        tea.makeTea();
        /**
         * 把水烧开
         * 放入红茶
         * 混合搅拌
         */

        //煮绿茶
        tea = new GreenTea();
        tea.makeTea();
        /**
         * 把水烧开
         * 放入绿茶
         * 混合搅拌
         */
    }
}
