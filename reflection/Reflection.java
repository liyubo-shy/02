package reflection;

/**
 * Created with IntelliJ IDEA.
 *反射
 * @Author: bo
 * @Date: 2022/08/22/14:33
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class Reflection {
    public static void main(String[] args) {
        printClassInfo("".getClass());
        System.out.println("-------------------");
        printClassInfo(Runnable.class);
        System.out.println("-------------------");
        printClassInfo(java.time.Month.class);
        System.out.println("-------------------");
        printClassInfo(String[].class);
        System.out.println("-------------------");
        printClassInfo(int.class);
    }

    static void printClassInfo(Class cls) {
        System.out.println("Class name: " + cls.getName());
        System.out.println("Simple name: " + cls.getSimpleName());
        if (cls.getPackage() != null) {
            System.out.println("Package name: " + cls.getPackage().getName());
        }
        System.out.println("is interface: " + cls.isInterface());
        System.out.println("is enum: " + cls.isEnum());
        System.out.println("is array: " + cls.isArray());
        System.out.println("is primitive: " + cls.isPrimitive());
    }
}