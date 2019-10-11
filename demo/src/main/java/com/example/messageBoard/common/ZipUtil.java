package com.example.messageBoard.common;

public class ZipUtil {

    private static boolean isZip(String fileNme) {
        boolean flag = false;
        if (fileNme != null) {
            if (fileNme.endsWith(".zip") || fileNme.endsWith(".ZIP")) {
                flag = true;
            }
        }
        return flag;
    }

}
