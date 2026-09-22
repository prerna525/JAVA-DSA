public class array2D {
    public static void main(String[]args)
    {
    int[][] marks = new int[3][3];
    marks[0][0] = 10;
    marks[0][1] = 20;
    marks[0][2] = 30;

    marks[1][0] = 40;
    marks[1][1] = 50;   
    marks[1][2] = 60;

    marks[2][0] = 70;
    marks[2][1] = 80;
    marks[2][2] = 90;
    for(int row =0;row < 3; row++)

        for(int col =0; col < 3; col++)
        {
            System.out.print(marks[row][col] + " ");
        } System.out.println();
    }
    
}
