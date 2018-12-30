class PatternPascal
{
    public static void main(String[] args)
    {
        int totalRows =6;
        int element=1;    
        for (int row=0;row<totalRows;row++)
        {
            for (int space=0;space < totalRows-row; space++)
            {
                System.out.print("  "); // 2 space     
            }
            for (int value=0; value<=row; value++)
            {
                if(value == 0 || row == 0)
                     element=1;
                else
                    element = element * (row - value + 1) / value;
                System.out.printf("%4d",element);
            }
            System.out.println();
        }
    }
}
