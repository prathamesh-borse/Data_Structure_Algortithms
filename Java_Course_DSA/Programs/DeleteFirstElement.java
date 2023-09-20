package Java_Course_DSA.Programs;

public class DeleteFirstElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int index = 2;

        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        for (int i = 0; i < arr.length - 1; i++) {
            int num = arr[i];
            System.out.print(num + " ");
        }
    }
}
