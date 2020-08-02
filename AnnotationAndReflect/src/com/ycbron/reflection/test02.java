package com.ycbron.reflection;

/*
 * Class 类的几种创建方式
 */
public class test02 {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Student();
        System.out.println(person.getName());
        //方式1：通过对象获得
        Class aClass = person.getClass();
        System.out.println(aClass.hashCode());

        //方式2：通过forName获得
        Class bClass = Class.forName("com.ycbron.reflection.Student");
        System.out.println(bClass.hashCode());

        //方式3：通过类名.class获得
        Class cClass = Student.class;
        System.out.println(cClass.hashCode());

        //方式4：基本内置对象的包装类都有一个Type属性
        Class dClass = Integer.TYPE;
        System.out.println(dClass);

        //获得父类类型
        Class superclass = aClass.getSuperclass();
        System.out.println(superclass);
    }
}

class Person{
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Student extends Person{
    public Student(){
        this.setName("学生");
    }
}

class Teacher extends Person{
    public Teacher(){
        this.setName("老师");
    }
}
