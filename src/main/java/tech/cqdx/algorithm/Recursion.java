package tech.cqdx.algorithm;


public class Recursion {

    /**
     * 使用递归来打印数组全排列
     *
     * @param data 数组
     * @param n    原数组数据个数
     * @param k    子数组的数据个数
     */
    public static void printPermutation(int[] data, int n, int k) {
        if (k == 1) {
            for (int i = 0; i < n; i++) {
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < k; ++i) {
            int tmp = data[i];
            data[i] = data[k - 1];
            data[k - 1] = tmp;

            printPermutation(data, n, k - 1);

            tmp = data[i];
            data[i] = data[k - 1];
            data[k - 1] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        printPermutation(a, 4, 4);
    }
}
