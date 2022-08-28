package basictype.io;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/08/15/10:41
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 * 实现复制1.txt文件内容到2.txt
 */
public class InPutDemo {
    public static void main(String[] args) {
        //定义读取文件的字节输入流对象
        FileInputStream read = null;
        //定义写入文件的字节输出流
        FileOutputStream write = null;
        try {
            read =new FileInputStream("D:\\java_io_test\\1.txt");
            write = new FileOutputStream("D:\\java_io_test\\2.txt",true);
                //定义in接收读取的字节
                int in ;
                //循环读取，直至最后一个字符
                while ((in = read.read()) != -1){
                    //写进数据
                    write.write((char)in);
                }
        }catch (Exception e ){
            e.printStackTrace();
        }
        finally {
            //释放输入流资源
            if (read != null){
                try {
                    read.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            //释放输出流资源
            if (write != null){
                try {
                    write.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
