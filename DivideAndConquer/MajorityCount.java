package DivideAndConquer;


public class MajorityCount {

    public static void count(int arr[]) {
        boolean visited[] = new boolean[arr.length];
        int count[] = new int[arr.length];

        int times = arr.length / 2;

        for (int i = 0; i < arr.length; i++) {

            if (visited[i]) {
                continue;
            }

            count[i] = 1;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    count[i]++;
                    visited[j] = true;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (count[i] > times) {
                System.out.println(arr[i]);
                return;
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = {3, 2, 3};
        count(arr);
    }
}
