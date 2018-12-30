class PatternPascal
{
    public static void main(String[] args)
    {
        int totalRows =5;
        int element=1;    
        for (int row=0;row<totalRows;row++)
        {
            for (int space=0;space < totalRows-row; space++)
            {
                System.out.print(" ");     
            }
            for (int value=0; value<=row; value++)
            {
                System.out.printf("* ");
            }
            System.out.println();
        }
    }
}
