package Array;

public class ArrayDemo7 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[][] a2D = new int[3][4];
        int[][] b2D = new int[3][4];

        a2D[0][0] = 1;
        a2D[0][1] = 2;
        a2D[0][2] = 3;
        a2D[0][3] = 4;
        a2D[1][0] = 1;
        a2D[1][1] = 2;
        a2D[1][2] = -400;
        a2D[1][3] = 5;
        a2D[2][0] = 2;
        a2D[2][1] = 5;
        a2D[2][2] = 7;
        a2D[2][3] = 5;
        b2D[0][0] = 10;
        b2D[0][1] = 11;
        b2D[0][2] = 12;
        b2D[0][3] = 13;
        b2D[1][0] = 14;
        b2D[1][1] = 15;
        b2D[1][2] = 16;
        b2D[1][3] = 17;
        b2D[2][0] = 18;
        b2D[2][1] = 19;
        b2D[2][2] = 20;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(a2D[i][j] + b2D[i][j] + "  ");

            }
            System.out.println();

        }


    }
}
