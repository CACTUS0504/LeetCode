package task67;

public class Solution {
    public static String addBinary(String a, String b) {
        String ost = "0";
        a = new StringBuffer(a).reverse().toString();
        b = new StringBuffer(b).reverse().toString();

        if (a.length() < b .length()) {
            String tmp = b;
            b = a;
            a = tmp;
        }

        int last;
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < Math.max(a.length(),b.length()); i++) {
            if (i < Math.min(a.length(), b.length())){
                if (a.charAt(i) == '0' && b.charAt(i) == '0') {
                    res.append(ost);
                    ost = "0";
                } else if (a.charAt(i) == '1' && b.charAt(i) == '1') {
                    res.append(ost);
                    ost = "1";
                } else {
                    if (ost.equals("0")) {
                        res.append("1");
                        ost = "0";
                    } else {
                        res.append("0");
                        ost = "1";
                    }
                }
            } else if (ost.equals("1")){
                if (a.charAt(i) == '1') {
                    res.append("0");
                    ost = "1";
                } else {
                    res.append("1");
                    ost = "0";
                }
            } else {
                res.append(a.charAt(i));
            }
        }
        if (ost.equals("1")) res.append("1");
        return res.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
        System.out.println(addBinary("1010", "1011"));
        System.out.println(addBinary("111", "111"));
        System.out.println(addBinary("1", "11"));
    }
}
