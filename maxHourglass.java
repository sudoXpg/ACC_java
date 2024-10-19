    public class maxHourglass {
        public static void main(String[] args) {
            int [][]mat = 
            {{1, 2, 3, 0, 0},
            {0, 0, 0, 0, 0},
            {2, 1, 4, 0, 0},
            {0, 0, 0, 0, 0},
            {1, 1, 0, 1, 0}};

            int maxSum=Integer.MIN_VALUE;
            int hourglass;
            for(int i=0;i<mat.length-2;i++){
                for(int j=0;j<mat[i].length-2;j++){
                    hourglass = mat[i][j] + mat[i][j + 1] +mat[i][j + 2] + (mat[i + 1][j + 1]) +(mat[i + 2][j] + mat[i + 2][j + 1] +mat[i + 2][j + 2]);
                    if(hourglass>maxSum){
                        maxSum=hourglass;
                    }
                }
            }
            System.out.println(maxSum);
        }
    }
