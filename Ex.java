public class Ex {
    public static void main(String args[]) {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
        }
        // The variable i is out of scope here; you can't access it in this context

        for (int j = 0; j < 10; j++) {
            if (j == 4) {
                continue;
            }
            System.out.println(j);
        }
    }
}
