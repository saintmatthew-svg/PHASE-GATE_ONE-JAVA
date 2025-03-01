public class TrianglePrinting {
	public static void main(String[] args) {
		TrianglePrintingProgram();
	}

	public static void TrianglePrintingProgram() {
		for (int count = 1; count <= 10; count++) {
			for (int a = 1; a <= count; a++) {
				System.out.print("*");
			}
			System.out.print("      ");

			for (int space = 10; space >= count; space--) {
				System.out.print(" ");
			}

			for (int b = 10; b >= count; b--) {
				System.out.print("*");
				} 
			System.out.print("                      ");


			for (int d = 1; d <= count; d++) {
			System.out.print("*");
			}
			System.out.println();
		}
	}
}



