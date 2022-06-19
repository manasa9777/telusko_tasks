public class TeluskoIneuron{
	public static void main(String args[]) {
		int i, j, row = 5;
		int count = (row / 2) + 1;
		for (i = 0; i < row+row; i++) {
			// Printing "TELUSKO"
			if(i <row){
			for (j = 0; j <= 8 * row; j++) {

				// Printing "T"
				if (j < row) {
					if (i == 0)
						System.out.print("*");
					else if (j == row / 2)
						System.out.print("*");
					else
						System.out.print(" ");
				}

				if ((j == row ) || (j == 2 * row + 1) || (j == 3 * row + 2) || j == (4* row + 3) || (j == 5* row + 4) || (j == 7* row )) // space between letters
					System.out.print("  ");
				
				// Printing "E"
				if (j > row && j < 2 * row + 1) {
					if ((i == 0 || i == row - 1) || (i == row / 2 && j <= row + 3) || (j == row + 1))
						System.out.print("*");
					else
						System.out.print(" ");
				}

				// Printing "L"
				if (j >= 2 * row + 2 && j < 3 * row + 2) {
					if (i == row - 1 || (j == 2 * row + 2))
						System.out.print("*");
					else
						System.out.print(" ");
				}

				// Printing "U"
				if (j >= 3 * row + 3 && j < 4 * row + 3) {

					if (i == 4 || j == 3 * row + 3 || j == 4 * row + 2)
						System.out.print("*");
					else
						System.out.print(" ");
				}

				// Printing "S"
				if (j >= 4 * row + 4 && j < 5 * row + 4) {
					if ((i == 0 || i == row / 2 || i == row - 1))
						System.out.print("*");
					else if (i < row / 2 && j == 4 * row + 4)
						System.out.print("*");
					else if (i > row / 2 && j == 6 * row - 2)
						System.out.print("*");
					else
						System.out.print(" ");
				}

				// Printing "K"
				if (j >= 6 * row && j < 6 * row + 4) {
					if (j - 6 * row == count || j == 6 * row || j - 6 * row == -count)
						System.out.print(" *");
					else
						System.out.print("  ");

					if (j == 6 * row)
						count--;
				}

				// Printing "O"
				if (j >= 7 * row + 1) {

					if (i == 0 || i == row - 1 || j == 7 * row + 1 || j == 8 * row)
						System.out.print("*");
					else
						System.out.print(" ");
				}
												

			}
			System.out.println(""); // New line
			if (i == 4) System.out.println("----------------------------------------------------------");
			
			}
			else   // Printing "INEURON"
			{
				for (j = 0; j < 9*row+2; j++) {
					
					// Printing "I"
					if(j<row){
		            if (i == 5 || i == 2*row - 1)
		            	System.out.print("*");
		            else if (j == row / 2)
		            	System.out.print("*");
		            else
		            	System.out.print(" ");
					}
					
					if (j == 5 || j == 12 || j== 18  || j== 24  || j== 33 || j== 40) System.out.print("  "); ///// Space
					
					// Printing "N"
		            
					if(j>row && j<2*row+2){
		            if (j == row+2 || j==2*row+1)
		            	System.out.print("*");
		            else if (j == i+2)
		            	System.out.print("*");
		            else
		            	System.out.print(" ");
					}
					
					// Printing "E"
					
					if (j > 2*row+2 && j < 3*row+3) {
						if ((i == row || i == 2*row - 1) || (i == 7 && j <= 15) || (j == 2*row + 3))
							System.out.print("*");
						else
							System.out.print(" ");
					}
					
					// Printing "U"
					if (j > 3 * row + 3 && j < 4 * row + 4) {

						if (i == 9 || j == 3 * row + 4 || j == 4 * row + 3)
							System.out.print("*");
						else
							System.out.print(" ");
					}
					
					// Printing "R"
					 if (j >=5*row && j < 6 * row +4){
					 if ((i == 5 || (i == row+2) || j==5*row)
							  && j < (5*row+7))
				            	System.out.print("*");
				            else if (j == (5*row+7)
				                    && !(i == 5 || i == row+2))
				            	System.out.print("*");
				            else
				            	System.out.print(" ");
						 
					 }
					 
					// Printing "O"
						if (j > 6 * row +4 && j < 8*row) {
							if (i == row || i == 2*row-1 || j == 7 * row || j == 7 * row+4)
								System.out.print("*");
							else
								System.out.print(" ");
						}
						
					// Printing "N"
			            
						if(j > 8*row +1){
			            if (j == 8*row +2 || j==9*row +1)
			            	System.out.print("*");
			            else if (j == i+7*row+2)
			            	System.out.print("*");
			            else
			            	System.out.print(" ");
						}
		            
		        }
		        System.out.println("");
			}
			
		}
	}
}
