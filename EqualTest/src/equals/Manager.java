package equals;
/**
 * @program EqualTest
 * @description: Manager 类
 * @author: ycbron
 * @create: 2020/04/19 17:11
 */
public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, int year, int month, int day)
    {
        super(name, salary, year, month, day);
        bonus = 0;
    }

    @Override
    public double getSalary()
    {
        return super.getSalary() + bonus;
    }

    public void setBonus(double bonus)
    {
        this.bonus = bonus;
    }

    public boolean equals(Object otherObject)
    {
        //如果在子类中重新定义 equals，就要在其中包含调用 super.equals(other)。
        if(!super.equals(otherObject))
        {
            return false;
        }
        Manager other = (Manager) otherObject;
        return  bonus == other.bonus;
    }

    public int hashCode()
    {
        return super.hashCode() + 17 * new Double(bonus).hashCode();
    }

    public String toString()
    {
        return super.toString() + "[bonus=" + bonus + "]";
    }
}
