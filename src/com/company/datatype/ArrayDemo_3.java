package com.company.datatype;

/**
 * 传值和传引用
 * @author Administrator
 */
public class ArrayDemo_3 {
    public static void main(String[] args) {
        String str = "java.long.String";
        stringUpd(str);
        stringBufferUpd(str);
        getString.Score score = new getString.Score();
        score.setValue(1);
        System.out.println(score.getValue());
    }

    public static void stringUpd(String str) {
        str = str.replace("java", "Seve");
        System.out.println(str);
    }

    public static void stringBufferUpd(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("123");
        System.out.println(stringBuffer);
    }
}

class getString {
    public static class Score {
        private int value;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
}
