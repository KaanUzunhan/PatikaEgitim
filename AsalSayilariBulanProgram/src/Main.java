public class Main {
    public static void main(String[] args) {
        int a = 0;


        for (int j = 2; j < 100; j++) {
            for (int i = 2; i < j; i++) {
                if (j % i != 0) {
                    a++;
                    if (a == j - 2) {
                        System.out.println(j);
                        a = 0;
                    }
                } else {
                    a = 0;
                    break;
                }

            }
        }
    }
}