import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

/**
 * @program: reflection
 * @description: TODO
 * @author: ycbron
 * @create: 2021-06-06 18:19
 **/
public class ReflectionTest {
    public static void main(String[] args) {
        // 命令行或者用户输入类名称
        String name;
        if(args.length > 0) {
            name = args[0];
        }
        else {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter class name (e.g. java.util.Date): ");
            name = in.next();
        }
        try {
            Class cl = Class.forName(name);
            /**
             *Returns the Class representing the superclass of the entity (class, interface, primitive type or void) represented by this Class.
             * If this Class represents either the Object class, an interface, a primitive type, or void, then null is returned.
             * If this object represents an array class then the Class object representing the Object class is returned.
             **/
            Class supercl = cl.getSuperclass();
            String modifies = Modifier.toString(cl.getModifiers());
            if(modifies.length() > 0) System.out.print(modifies + " ");
            System.out.print("class " + name);
            if(supercl != null && supercl != Object.class) System.out.println(" extends " + supercl.getName());
            System.out.print("\n{\n");
            printConstructors(cl);
            System.out.println();
            printMethods(cl);
            System.out.println();
            printFields(cl);
            System.out.println("}");
        }
        catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public static void printConstructors(Class cl) {
        Constructor[] constructors = cl.getDeclaredConstructors();
        for(Constructor c : constructors) {
            String name = c.getName();
            System.out.print("  ");
            String modifies = Modifier.toString(c.getModifiers());
            if(modifies.length() > 0) System.out.print(modifies + " ");
            System.out.print(name + "(");
            Class[] parameter = c.getParameterTypes();
            for(int j = 0; j < parameter.length; j++) {
                if(j > 0) System.out.print(", ");
                System.out.print(parameter[j].getName());
            }
            System.out.println(");");
        }
    }

    public static void printMethods(Class cl) {
        Method[] methods = cl.getDeclaredMethods();
        for(Method m : methods) {
            Class retType = m.getReturnType();
            String name = m.getName();
            System.out.print("  ");
            String modifies = Modifier.toString(m.getModifiers());
            if(modifies.length() > 0) System.out.print(modifies + " ");
            System.out.print(retType.getName() + " " + name + "(");
            Class[] paramTypes = m.getParameterTypes();
            for(int j = 0; j < paramTypes.length; j++) {
                if(j > 0) System.out.print(", ");
                System.out.print(paramTypes[j].getName());
            }
            System.out.println(");");
        }
    }

    public static void printFields(Class cl) {
        Field[] fields = cl.getDeclaredFields();
        for (Field f: fields) {
            Class type = f.getType();
            String name = f.getName();
            System.out.print("  ");
            String modifies = Modifier.toString(f.getModifiers());
            if(modifies.length() > 0)  System.out.print(modifies + " ");
            System.out.println(type.getName() + " " + name);
        }
    }
}
