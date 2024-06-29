public class Tasks261_270 {
    public static void main(String[] args) {

        int[] X = {1, 7, 2, 8, 3, 9, 11};
        int[] Y = {8, 2, 4, 6, 3, 14};

        //Task261
        int count1 = 0;
        int sum1 = 0;
        for (int i = 0; i < X.length; i++) {
            sum1 += X[i];
            count1++;
        }

        int count2 = 0;
        int sum2 = 0;
        for (int i = 0; i < Y.length; i++) {
            sum2 += Y[i];
            count2++;
        }

        System.out.println("zangvacneri mijin tvabanakanneri artadryaly: " + (sum1 / count1) * (sum2 / count2));

        // Task263
        int count3 = 0;
        for (int i = 0; i < X.length; i++) {
            if (X[i] > 0) {
                count3++;
            }
        }
        for (int i = 0; i < Y.length; i++) {
            if (Y[i] > 0) {
                count3++;
            }
        }
        System.out.println("erku zangvacneri drakan tarreri yndhanur qanaky: " + count3);

        // Task264
        int count4 = 0;
        for (int i = 0; i < X.length; i++) {
            if (X[i] < 0) {
                count4++;
            }
        }
        for (int i = 0; i < Y.length; i++) {
            if (Y[i] < 0) {
                count4++;
            }
        }
        System.out.println("erku zangvacneri bacasakan tarreri yndhanur qanaky: " + count4);


        //Task266
        int sum3 = 0;
        int sum4 = 0;
        for (int i = 0; i < X.length; i++) {
            if (X[i] % 2 != 0) {
                sum3 += X[i];
            }
        }
        for (int i = 0; i < Y.length; i++) {
            if (Y[i] % 2 == 0) {
                sum4 += Y[i];
            }
        }
        System.out.println("X-i kent tarreri ev Y-i zuyg tarreri gumarneri tarberutyuny: " + (sum3 - sum4));


        //Task267
        int sum5 = 0;
        for (int i = 0; i < X.length; i++) {
            if (X[i] % 7 == 0) {
                sum5 += X[i];
            }
        }
        for (int i = 0; i < Y.length; i++) {
            if (Y[i] % 7 == 0) {
                sum5 += Y[i];
            }
        }
        System.out.println("7-in bazmapatik tarreri yndhanur gumary: " + sum5);


        //Task269
        int sum6 = 0;
        for (int i = 0; i < X.length; i++) {
            if (i % 2 == 0) {
                sum6 += X[i];
            }
        }
        for (int i = 0; i < Y.length; i++) {
            if (i % 2 != 0) {
                sum6 += Y[i];
            }
        }
        System.out.println("X-i zuyg index undecox ev Y-i kent index unecox tarreri yndhanur gumary: " + sum6);


    }
}
