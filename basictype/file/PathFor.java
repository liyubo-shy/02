package basictype.file;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/08/12/22:11
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class PathFor {
    public static void main(String[] args) throws IOException {
        long l1 = System.currentTimeMillis();
        ArrayList<String> list = new ArrayList<>();
        File f = new File("C:\\");

        FileMethod.forFile(f,list);
        System.out.println("遍历完成！找到"+list.size()+"个文件");
        //FileMethod.show(list);
        FileMethod.save(list,new File("D:\\测试字节输出流.txt"));

        long l2 = System.currentTimeMillis();
        System.out.println("耗时："+(l2-l1)/1000+"s");

    }


}
