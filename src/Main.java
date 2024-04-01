public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("task 1");
        int[] number = new int[3];
        for (int i = 0; i < number.length; i++) {
            number[i] = i + 1;
        }

        System.out.println();
        double[] doubles = {1.57, 7.654, 9.986};
        char[] chars = {1535, 658, 852};
        System.out.print(chars);

        //task 2
        System.out.println("task 2");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]);
            if (i < number.length - 1) {
                System.out.print(" , ");
            }

        }

        for (int i = 0; i < doubles.length; i++) {
            System.out.print(doubles[i]);
            if (i < doubles.length - 1) {
                System.out.print(" , ");

            }
        }
        System.out.println();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
            if (i < chars.length - 1) {
                System.out.print(" , ");
            }
        }
        System.out.println();
        //task 3
        System.out.println("task 3");
        for (int i = number.length - 1; i >= 0; i--) {
            System.out.print(number[i]);
            if (i > 0) {
                System.out.print(" , ");
            }

        }
        System.out.println();
        for (int i = doubles.length - 1; i >= 0; i--) {
            System.out.print(doubles[i]);
            if (i > 0) {
                System.out.print(" , ");
            }

        }
        System.out.println();
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
            if (i > 0) {
                System.out.print(" , ");
            }
        }
        System.out.println();
        //task 4
        System.out.println("task 4");
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 != 0) {
                number[i]++;
            }
        }
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]);
            if (i < number.length - 1) {
                System.out.print(" , ");

            }
        }


    }
}
