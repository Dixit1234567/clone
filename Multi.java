public class Multi {
    public static void main(String args[]) {
        try {
            int a[] = new int[5];
            a[5] = 30;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception occurred");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception occurred");
        } catch (Exception e) {
            System.out.println("Parent exception occurred");
        }
        System.out.println("Rest of the code");
    }
}
