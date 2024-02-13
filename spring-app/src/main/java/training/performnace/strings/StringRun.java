package training.performnace.strings;

import java.util.function.Supplier;

public class StringRun {
    public static void main(String[] args) {
        String abc       = "1";
        int    ab        = 100;
        String stringLoc = "osman " + ab + " " + args;
        stringLoc += " deneme";

        String stringLoc1 = new String("osman");

        String sLoc = "first";
        for (int i = 0; i < 100; i++) {
            sLoc += " " + i;
        }
        final String sLast = sLoc;

        StringBuilder builderLoc = new StringBuilder(350);
        for (int i = 0; i < 100; i++) {
            builderLoc.append(" ")
                      .append(i);
        }

        testMethod(sLoc + abc + " ",
                   stringLoc + " " + sLoc,
                   3);
        testMethod2(() -> sLast + abc + " ",
                    () -> " " + sLast,
                    3);
    }

    public static void testMethod(String str1,
                                  String str2,
                                  int threshold) {
        if (threshold > 5 && threshold < 10) {
            System.out.println(str1);
        } else if (threshold >= 10) {
            System.out.println(str2);
        } else {
            // xyz ...
        }
    }

    public static void testMethod2(Supplier<String> str1,
                                   Supplier<String> str2,
                                   int threshold) {
        if (threshold > 5 && threshold < 10) {
            System.out.println(str1.get());
        } else if (threshold >= 10) {
            System.out.println(str2.get());
        } else {
            // xyz ...
        }
    }

}
