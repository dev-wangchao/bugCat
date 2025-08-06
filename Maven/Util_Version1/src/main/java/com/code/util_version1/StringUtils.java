package com.code.util_version1;

public class StringUtils {

    public static String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    public static void print() {
        System.out.println("我是Util_Version1中的print方法");
//        System.out.println("目前还是快照SNAPSHOT版本！！！！！！！");
        System.out.println("目前还是发布版本！！！！！！！");
    }
}
