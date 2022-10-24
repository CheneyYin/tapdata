package io.tapdata.coding.utils.tool;

import cn.hutool.core.date.DateUtil;
import io.tapdata.coding.service.sync.Sync;

import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Checker {
    public static boolean isEmpty(Object obj){
        if (null == obj) return Boolean.TRUE;
        if (obj instanceof String){
            return "".equals(((String) obj).trim());
        }
        return Boolean.FALSE;
    }
    public static boolean isNotEmpty(Object object){
        return !isEmpty(object);
    }
    public static boolean isEmptyCollection(Object collection){
        return isEmpty(collection)
                        || ( collection instanceof Collection && ((Collection) collection).isEmpty() )
                        || (collection instanceof Map && ((Map) collection).isEmpty())
                ;
    }
    public static boolean isNotEmptyCollection(Object collection){
        return !isEmptyCollection(collection);
    }

    public static void main(String[] args) throws Exception{
//        long start = System.currentTimeMillis();
//        for (int i = 0; i < 1000000; i++) {
//            String time = "2016-06-21T13:16:14.000Z";
//            long timeLong = DateUtil.parse(
//                    time.replaceAll("Z","").replaceAll("T"," "),
//                    "yyyy-MM-dd HH:mm:ss.SSS").getTime();
//        }
//        long end = System.currentTimeMillis();
//        System.out.println(end - start);
//        int fromPageIndex = 1;//从第几个工单开始分页
//        for (int i = 0; i < 10 ; i++) {
//            System.out.println(fromPageIndex);
//            fromPageIndex += 100 ;
//        }
//        Map<String,Object> map = new HashMap<>();
//        System.out.println(isEmptyCollection(map));

        int max = 0;
        final int m = 10000000;
        long s = System.nanoTime();

        for (;max++<m;){}
        long e = System.nanoTime();

        while (max-->0){}
        long e2 = System.nanoTime();

        do{}while (max++<m);
        long e3 = System.nanoTime();

        System.out.println((e-s) +"\n"+(e2-e)+"\n"+(e3-e2));
    }
}
