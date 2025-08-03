package list;

import java.util.LinkedList;

public class test1 {

//    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
//        list.add("唐僧");
//        list.add("孙悟空");
//        list.add("猪八戒");
//        list.add("沙和尚");
////        Iterator<String> iterator = list.iterator();
////        while (iterator.hasNext()) {
////            String next = iterator.next();
////            if ("猪八戒".equals(next)) {
////                list.add("白龙马");
////            }
////            System.out.println(next);
////        }
//        ListIterator<String> iterator = list.listIterator();
//        while (iterator.hasNext()) {
//            String next = iterator.next();
//            if ("猪八戒".equals(next)) {
//                iterator.add("白龙马");
//            }
//            System.out.println(next);
//        }
//    }



    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("星际宝贝");
        list.add("恐龙宝贝");
        list.add("神奇宝贝");
        list.add("数码宝贝");
        //public void push(E e):将元素推入此列表所表示的堆栈。
        list.push("涛哥宝贝");
        System.out.println(list);

        System.out.println("=================");

        //public E pop():从此列表所表示的堆栈处弹出一个元素
        String s = list.pop();
        System.out.println(s);
        System.out.println(list);
        String s1 = list.get(0);
        System.out.println(s1);
    }
}
