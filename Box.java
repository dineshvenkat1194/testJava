public class Box {
	
	public static void main(String[] args) {
		int row = 5, col = 10, i, j;
		for (i = 0; i < row; i++)
		{
			for (j = 0; j < col; j++)
			{
				if (j == 0 || i == 0 || j == col - 1 || i == row - 1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
			
		}
		
	}}