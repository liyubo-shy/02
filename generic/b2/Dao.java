package generic.b2;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/08/28/18:17
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
public class Dao <T> {
    //定义Map成员变量，String类型
    public Map<String,T> map =new HashMap<>();

    //保存
    public void save(String id, T entity){
        map.put(id,entity);
    }

    //get方法
    public T get(String id){
        return map.get(id);
    }

    //更新
    public void update(String id, T entity){
        map.replace(id,entity);
    }

    //列出所有T
    public List<T> list(){
        //获取keySet集合
        Set<String> keySet = map.keySet();
        //使用迭代器遍历key
        Iterator<String> it = keySet.iterator();

        //创建List集合接收value
        List<T> list = new ArrayList<>();
        //开始遍历并添加进list集合
        while (it.hasNext()) {
            String key =  it.next();
            T t = map.get(key);
            list.add(t);
        }


        return list;
    }

    //删除
    public void delete(String id){
        map.remove(id);
    }
}
