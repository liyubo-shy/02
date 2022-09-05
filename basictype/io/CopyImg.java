package basictype.io;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * 复制图片，并输出文件大小
 *
 * @Author: bo
 * @Date: 2022/09/05/21:20
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class CopyImg {
    public static void main(String[] args) {
        FileInputStream fileIn = null;
        FileOutputStream filOutImg = null;
        //定义路径
        File filePath = new File("D:\\小照片\\微信图片_20220905003714(1).png");
        File copyImgPath = new File("D:\\小照片\\newImg.png");
        //定义int计算文件大小
        int size = 0;

        try {
            fileIn = new FileInputStream(filePath);
            filOutImg = new FileOutputStream(copyImgPath, true);
            //定义字节数组，一次读取1024字节的数据
            byte[] buf = new byte[1024];
            //接收read方法返回的字节长度
            int len;
            //开始复制
            while ((len = fileIn.read(buf)) != -1) {
                //读取到的字节数组写入新文件
                filOutImg.write(buf, 0, len);
                //统计总字节长度
                size += len;
            }
            System.out.println("文件大小：" + size / 1024 / 1024 + "M");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭资源
            try {
                if (fileIn != null) {
                    fileIn.close();
                }
                if (filOutImg != null) {
                    filOutImg.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
