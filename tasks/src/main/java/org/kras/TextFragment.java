package org.kras;

public class TextFragment {
    public static void main(String[] args) {
        String myStr = "Hello Java";
        String myText1 = """
                Hello Java""";
        String myText2 = """
                Hello Java
                """;
        boolean equals1 = myStr.equals(myText1);
        boolean equals2 = myStr.equals(myText2);
        boolean equals = myText1.equals(myText2);
        String intern = myText1.intern();
        String intern2 = myText2.intern();
        boolean isIntern = myText1.intern() == myText2.intern();
    }
}
