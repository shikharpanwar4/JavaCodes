package qwerty;

public class Matrix {
	
	    int row;
	    int column;
	    int[][] arr = new int[10][10];
	    private Matrix()
	    {
	        for(int i=0;i<10;i++)
	        {
	            for(int j=0;j<10;j++)
	            {
	                arr[i][j] = 0;
	            }
	        }
	    }
	    Matrix(int r, int c)
	    {
	        this();
	        row = r;
	        column = c;
	    }
	    void setElement(int r, int c, int value)
	    {
	        arr[r][c] = value;
	    }
	    void transpose()
	    {
	        for(int i=0;i<row;i++)
	        {
	            for(int j=0;j<column;j++)
	            {
	                if(i>j)
	                {
	                    int temp;
	                    temp = arr[i][j];
	                    arr[i][j] = arr[j][i];
	                    arr[j][i] = temp;
	                }
	            }
	        }
	    }
	    void show()
	    {
	        for(int i=0;i<row;i++)
	        {
	            for(int j=0;j<column;j++)
	            {
	                System.out.print(arr[i][j] + "\t");
	            }
	            System.out.print("\n");
	        }
	    }
	}

	

