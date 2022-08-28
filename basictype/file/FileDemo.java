package basictype.file;

import java.io.File;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/08/12/3:44
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class FileDemo {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:\\goodgame\\javalearning\\StudentManage");
        File[] files = f1.listFiles();
        for (File f :files){
            if (f.isDirectory()){
                System.out.println(f.getName());
            }
        }


    }
}
