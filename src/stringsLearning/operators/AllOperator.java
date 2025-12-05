package stringsLearning.operators;

public class AllOperator {
    static void main() {
        //Bitwise OR
        int a = 9;                  // 1 0 0 1 in Binary
        int b = 10;                 // 1 0 1 0
                                    //--------- on diff value return 1
        System.out.println(a|b);    // 1 0 1 1 => 11(In decimal)


        //Bitwise And
        int c = 9;                  // 1 0 0 1 in Binary
        int d = 10;                 // 1 0 1 0
                                    //--------- on diff value return 0
        System.out.println(a&b);    // 1 0 0 0 => 8(In decimal)


        //Bitwise Exclusive OR
        int e = 9;                  // 1 0 0 1 in Binary
        int f = 10;                 // 1 0 1 0
                                    //--------- on same value return 0
        System.out.println(e^f);    // 0 0 1 1 => 3(In decimal)


        //Bitwise Compliment/NOT
        int g = 9;                  // 1 0 0 1 in Binary
                                    //     + 1
                                    //-----------plus 1 binary number in original value binary and put -ve sign
                                    // 1 0 1 0
        System.out.println("Bitwise Compliment " + ~9);


        // 1 Left Shift
        int h = 9;                      // 1 0 0 1 in Binary
                                        //--------- Left Shift to 1 bit
        System.out.println(h<<1);     // 1 0 0 1 0 => 18(In decimal)

        // 2 Left Shift
        int i = 9;                      // 1 0 0 1 in Binary
                                        //--------- Left Shift to 2 bit
        System.out.println(i<<2);   // 1 0 0 1 0 0 => 36(In decimal)

        // 1 Right Shift
        int j = 9;                      // 1 0 0 1 in Binary
                                        //--------- Right Shift to 1 bit
        System.out.println(j>>1);       //   1 0 0  => 4(In decimal)

        // 2 Right Shift
        int k = 9;                      // 1 0 0 1 in Binary
                                        //--------- Right Shift to 2 value
        System.out.println(k>>2);       //     1 0 => 2(In decimal)
    }
}
