import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int m = 3;
        int[][] matrix = new int[n][m];
        //eleemnt insertion
        System.out.print("Enter elements into the matrix :");
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < matrix[0].length; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        //element display
        System.out.println("Display matrix elements :");
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < matrix[0].length;j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        // System.out.print("Enter search element :");
        // int element = sc.nextInt();
        // searchElement(matrix, element);
        // largestElement(matrix);
        // smallestElement(matrix);
        printSpiral(matrix);
        sc.close();
    }

    //search element
    public static void searchElement(int[][] matrix, int element)
    {
        for(int i = 0; i < matrix.length;i++)
        {
            for(int j = 0; j < matrix[0].length; j++)
            {
                if(matrix[i][j] == element)
                {
                    System.out.println("cell (" + i +"," + j +")");
                    return;
                }
            }
        }
        System.out.println("Not found");
    }

    //largest element
    public static void largestElement(int[][] matrix){
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[0].length; j++)
            {
                if(matrix[i][j] > max)
                {
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("Largest element is :" +max );
    }

    //smallest element
    public static void smallestElement(int[][] matrix){
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[0].length; j++)
            {
                if(matrix[i][j] < min)
                {
                    min = matrix[i][j];
                }
            }
        }
        System.out.println("Largest element is :" +min );
    }

    //print spiral
    public static void printSpiral(int[][] matrix){
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startColumn = 0;
        int endColumn = matrix[0].length - 1;

        while(startRow <= endRow && startColumn <= endColumn)
        {
            //for column -> j
            //for row -> i

            //Top
            for(int j = startColumn; j <= endColumn; j++)
            {
                System.out.print(matrix[startRow][j] +" ");
            }


            //Right
            for(int i = startRow+1; i <= endRow;i++)
            {
                System.out.print(matrix[i][endColumn] + " ");
            }

            //buttom
            for(int j = endColumn-1; j >= startColumn; j--)
            {
                if(startRow==endRow)
                    break;
                System.out.print(matrix[endRow][j] + " ");
            }

            //Left
            for(int i = endRow-1; i > startRow; i--)
            {
                if(startColumn==endColumn)
                    break;
                System.out.print(matrix[i][startColumn] + " ");
            }

            startColumn++;
            startRow++;
            endColumn--;
            endRow--;
        }
        System.out.println();
    }
}