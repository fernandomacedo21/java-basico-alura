
/**
public class TestaLacos {

	public static void main(String[] args) {

		for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
			for (int contador = 1; contador <= 10; contador++) {
				System.out.println(multiplicador * contador);
				System.out.println(" ");
			}
			System.out.println();
		}
	}
}
**/
public class TestaLacos {
    public static void main(String args[]) {
        for(int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                if ( coluna > linha ) {
                    break;
                }
                System.out.print( coluna + 1 );
            }
            System.out.println();
        }
    }
}
