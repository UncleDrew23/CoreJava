package abstractClasses;
/**
 * @program: abstractClasses
 * @description: 抽象类
 * @author: ycbron
 * @create: 2019-11-13 00:06
 **/

public abstract class Person
{
    /**
     * 抽象方法
     */
    public abstract String getDescription();

    public String name;

    public Person(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
