public class Solution {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4};
        int n = arr.length;
        int k = 0;
        for (int mask = 0; mask < (1 << n); mask++){
            System.out.print("{");
            for (int i = 0; i < n; i++){
                if ((mask & (1 << i)) > 0){
                    System.out.print(arr[i]);
                }
            }
            System.out.print("}");
            k ++;
            System.out.println();
        }
        System.out.println(k);
    }

    public double[] convertTemperature(double celsius) {
        double[] arr = new double[2];
        arr[0] = celsius + 273.15;
        arr[1] = celsius * 1.8 + 32;
        return arr;
    }
}
