package basictype.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/08/16/8:32
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class InPutDemo1 {
    public static void main(String[] args) throws IOException {
        FileInputStream read = new FileInputStream("D:\\java_io_test\\1.txt");
        //定义字节数组
        byte[] num = new byte[15];
        //读取15个字节的数据并存在num中
        int len = read.read(num);
        int n = read.read();
        System.out.println(n);
        System.out.println(len);
        System.out.println(new String(num));

        read.close();
    }
}

class Main1{
    public static void main(String[] args) {
        System.out.println("23123");
    }
}

class Main2{
    public static void main(String[] args) throws IOException {
        System.out.println("wahaha");
        Main1.main(args);
        InPutDemo1.main(args);
    }
}
