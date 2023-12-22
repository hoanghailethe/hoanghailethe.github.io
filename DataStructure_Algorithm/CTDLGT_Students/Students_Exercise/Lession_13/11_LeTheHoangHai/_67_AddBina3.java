public class _67_AddBina3 {
    public static String addBinary(String a, String b) {
        char[] aa = a.toCharArray();
        int maxa = aa.length - 1;

        char[] bb = b.toCharArray();
        int maxb = bb.length - 1;

        int cleng = Math.max(a.length(), b.length());
        char[] cc = new char[cleng + 1];

        int remainder = 0;

        for (int i = cc.length - 1; i >= 0; i--) {
            int soHang1 = 0;
            int soHang2 = 0;

            if (maxa >= 0) {
                soHang1 = aa[maxa--] - '0';
            }
            if (maxb >= 0) {
                soHang2 = bb[maxb--] - '0';
            }

            int calculate = soHang1 + soHang2 + remainder;
            // all the case : 0+0+0, 0+0+1, 1+0+0, 1+0+1, 0+1+0, 0+1+1, 1+1+0, 1+1+1
            if (calculate == 0 && i != 0) {
                cc[i] = '0';
                remainder = 0;
            }
            if (calculate == 1) {
                cc[i] = '1';
                remainder = 0;
            }
            if (calculate == 2) {
                cc[i] = '0';
                remainder = 1;
            }
            if (calculate == 3) {
                cc[i] = '1';
                remainder = 1;
            }

        }
        String result = String.valueOf(cc).trim();
        return result;
    }

    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
    }
}
