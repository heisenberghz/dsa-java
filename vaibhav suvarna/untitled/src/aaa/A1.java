package aaa;

public class A1 {
    public static void main(String[] args) {
        int a[][] = {{1, 2, 3}, {5, 6, 6}, {22, 4, 8}};

        for (int i = 0; i < a.length; i++) {
            int sum=0;
            for (int j = 0; j < a[i].length; j++) {
                sum=sum+a[i][j];
                System.out.print(a[i][j] + " ");
            }
            System.out.println(sum);
            System.out.println();
        }
    }
}