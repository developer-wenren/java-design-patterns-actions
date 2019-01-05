package patterns.structure.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author One
 * @description
 * @date 2019/01/05
 */
public class BeanFactory {
    private Map<String, Bean> beans = new ConcurrentHashMap<String, Bean>();

    public Bean getBean(String beanName) {
        Bean bean = beans.get(beanName);
        if (bean == null) {
            System.out.println("新建 Bean :" + beanName);
            bean = new Bean(beanName);
            beans.put(beanName, bean);
        }
        return bean;
    }
}
