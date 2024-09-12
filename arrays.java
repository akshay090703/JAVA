public class arrays {
    static void printArr(int num[], int size) {
        for(int i = 0; i<size; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.print('\n');
    }

    public static void main(String args[]) {
        int nums[] = {1, 2, 3, 4};
        int nums1[] = new int[4];
        nums1[0] = 2;
        nums1[1] = 4;
        nums1[2] = 3;

        printArr(nums, 4);
        printArr(nums1, 4);
    }
}