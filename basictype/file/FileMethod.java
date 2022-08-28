package basictype.file;

import java.io.File;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;


/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/08/12/23:23
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class FileMethod {
    /*
    public static ArrayList<String> getList(ArrayList<String> list, String like) {
        ArrayList<String> results = new ArrayList<>();
        list.forEach(obj -> {
            StringBuilder sb = new StringBuilder();
            Field[] fields = obj.getClass().getDeclaredFields();
            //设置大小写不敏感  加Pattern.CASE_INSENSITIVE
            Pattern pattern = Pattern.compile(like, Pattern.CASE_INSENSITIVE);
            for (Field field : fields) {
                try {
                    // 获取原来的访问控制权限
                    boolean accessFlag = field.isAccessible();
                    // 修改访问控制权限
                    field.setAccessible(true);
                    // 获取在对象f中属性fields[i]对应的对象中的变量
                    Object o;
                    try {
                        o = field.get(obj);
                        //字段是null跳过
                        if (o == null) {
                            continue;
                        }
                        String s = o.toString();
                        //根据需要排除部分属性值
                        if ("truefalse".contains(s)) {
                            continue;
                        }
                        //拼接对象中的值
                        sb.append(s);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                    // 恢复访问控制权限
                    field.setAccessible(accessFlag);
                } catch (IllegalArgumentException ex) {
                    ex.printStackTrace();
                }
            }

            Matcher matcher = pattern.matcher(sb);

            //模糊匹配                可根据需求调整匹配规则
            if (matcher.find()) {
                results.add(obj);
            }
        });
        return results;
    }*/


    public static void forFile(File file, ArrayList<String> list) throws IOException {
        File[] fArr = file.listFiles();
        if (fArr != null) {
            for (File file1 : fArr) {
                if (file1.isDirectory()) {
                    forFile(file1, list);
                } else {
                    list.add(file1.getAbsolutePath());
                    System.out.println("已找到" + list.size() + "个文件");
                }
            }
        }
    }

    public static void show(ArrayList<String> list) {
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println(list.size() + "个文件");
    }

    public static void save (ArrayList<String> arr, File file) throws IOException {
        FileOutputStream out = new FileOutputStream(file);
        for (String s : arr) {
            byte[] bytes = s.getBytes();
            out.write(bytes);
            out.write("\r\n".getBytes());
        }
        out.close();

    }
}

