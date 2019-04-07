package com.ltcz99;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Test {

    public static void print(int index, Object obj) {
        System.out.println(String.format("{%d}:%s", index, obj.toString()));
    }

    //01基础运算符
    public static void demoOpertion() {
        print(1, 5 + 2);
        print(2, 5 - 2);
        print(3, 5 * 2);
        print(4, 5 / 2);
        print(5, 5 % 2);
        print(6, 5 << 2);
        print(7, 5 >> 2);
        print(8, 5 | 2);
        print(9, 5 ^ 2);
        print(10, 5 == 2);
        print(11, 5 != 2);
        print(12, 5 & 2); // 0x101 & 0x010
        // 自增自减
        int a = 1;
        print(13, a++);
        print(14, ++a);
        print(15, a--);
        print(16, --a);
    }

    //02控制流(if,for,while)
    public static void demoControlFlow() {
        //if else
        int score = 80;
        if (score > 80) {
            print(1, 'A');
        } else if (score == 80) {
            print(2, 'B');
        } else
            print(3, 'C');

        //switch case

        String grade = "C";
        switch (grade) {
            case "A":
                print(4, 'A');
            case "B":
                print(5, 'B');
            case "C":
                print(6, 'C');
        }

        //for
        for (int i = 0; i < 8; i++) {
            if (i == 1) {
                continue;
            }
            if (i == 7) {
                break;
            }
            if (i % 2 == 1) {
                // System.out.println(i);
                print(7, "i%2=1");
            }
        }
        String str = "hello";
        for (char c : str.toCharArray()) {  //遍历字符串
            print(8, c);
        }

        int target = 20;
        int current = 0;
        while (current < target) {
            current += 5;
            print(9, current);
            if (current == 10) {
                break;
            }
        }
    }

    //03String字符串的常用操作
    public static void demoString() {
        String str = "Good Good Study,Day Day Up!!";
        print(1, str.length());
        print(2, str.indexOf('p'));
        print(3, str.charAt(5));
        print(4, str.codePointAt(2));
        print(5, str.compareTo("Good Good Study,Day Day Up!!"));
        print(6, str.compareToIgnoreCase("Hello Nowcoder"));
        print(7, str.concat("!!"));
        print(8, str.contains("hello"));
        print(9, str.endsWith("xowcoder"));
        print(10, str.startsWith("hello"));
        print(11, str.lastIndexOf('o'));
        print(12, str.toUpperCase());
        print(13, str.replace('o', 'a'));
        print(14, str.replaceAll("o|y", "a"));
        print(15, str.replaceAll("hello", "hi"));
        print(16, str.toLowerCase());
        StringBuilder sb = new StringBuilder();
        sb.append(true);
        sb.append(1);
        sb.append(2.2);
        print(16, sb.toString());
        print(17, "a" + "b" + String.valueOf(12));
    }

    //04List常见操作
    public static void demoList() {
        List<String> strList = new ArrayList<String>();
        for (int i = 0; i < 4; ++i) {
            strList.add(String.valueOf(i * i));
        }
        print(1, strList);

        strList.addAll(strList);
        print(2, strList);
        strList.remove(0);
        print(3, strList);
        strList.remove(String.valueOf(1)); //删除具体某个数
        print(4, strList);
        print(5, strList.get(2));    //打印出某个数组下标的值

        Collections.sort(strList);
        print(6, strList);

        Collections.sort(strList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        print(7, strList);

        Collections.reverse(strList);
        print(8, strList);

        int[] arr = new int[]{13, 56, 2, 8, 98};
        print(9, arr[3]);
    }

    //05set常见操作
    public static void demoSet() {
        Set<String> strSet = new HashSet<String>();
        for (int i = 1; i < 4; i++) {
            strSet.add(String.valueOf(i));
        }
        print(1, strSet);
        strSet.remove("1");
        print(2, strSet);
        print(3, strSet.contains("4"));
        strSet.addAll(Arrays.asList(new String[]{"z", "v", "2"}));
        print(4, strSet);
        for (String value : strSet) {
            print(5, value);
        }

        print(6, strSet.isEmpty());
        print(7, strSet.size());
    }

    //06map常见操作
    public static void demoMap() {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < 4; ++i) {
            map.put(String.valueOf(i), String.valueOf(i * i));
        }
        print(1, map);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            print(2, entry.getKey() + ":" + entry.getValue());
        }
        print(3, map.keySet());
        print(4, map.values());
        print(5, map.containsKey("2"));
        print(6, map.get("1"));
        map.replace("1", "A");
        print(7, map);
    }

    //07异常操作
    public static void demoException() {
        try {
            print(1, "hello");
            int a = 2;
            a = a / 0;
            String b = null;
            b.indexOf(a);
        } catch (Exception e) {
            //e.printStackTrace();
            print(2, "有异常了！！");
        } finally {
            print(3, "清理工作");
        }
    }

    //08Random和Date
    public static void demoCommon() {
        Random rand = new Random();
        rand.setSeed(2);    //通过setSeed来控制生成随机数的值
        for (int i = 0; i < 4; ++i) {
            print(1, rand.nextInt(100));
            print(2, rand.nextDouble());
        }

        List<Integer> array = Arrays.asList(new Integer[]{1, 6, 95, 25, 3});
        print(3, array);

        Collections.shuffle(array);
        print(4, array);

        //日期
        Date date = new Date();
        print(5, date);
        print(6, date.getTime());

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        print(7, df.format(date));//2019-04-07 18:12:53
        print(8, DateFormat.
                getDateInstance(DateFormat.FULL).format(date));//2019年4月7日 星期日
        print(9, UUID.randomUUID());
        print(10, Math.max(1, 2));
        print(11, Math.ceil(2.2));
        print(12, Math.floor(2.5));
        print(13, Math.log(2.71)); //e
    }

    //09封装、继承、多态
    public static  Animal getAnimal(){

        return new Animal("LILI",12);
    }
    public static void demoClass(){
        Talking animal=new Animal("XIAOMA",2);
        animal.say();

        Talking human =new Human("lili",23,"CN");
        human.say();
    }

    public static void main(String[] args) {
        // write your code here
        //demoOpertion();
        //demoControlFlow();
        //demoString();
        //demoList();
        //demoSet();
        //demoMap();
        //demoException();
        //demoCommon();
        demoClass();

    }
}
