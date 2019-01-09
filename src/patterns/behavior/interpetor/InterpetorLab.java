package patterns.behavior.interpetor;

/**
 * @author One
 * @description 解释器实验
 * @date 2019/01/09
 */
public class InterpetorLab {
    public static void main(String[] args) {
        String expressionStr = "1 + 2";
        CustomeExpressionParser customeExpressionParser = new CustomeExpressionParser(expressionStr);
        int interpet = customeExpressionParser.interpet();
        System.out.println("表达式 " + expressionStr + " 解释器处理结果: " + interpet);
    }
}
