package paquete;

public class ejemplo_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char frase[] = new char[10]; 

		 
		frase[5] = 'h'; 
		frase[6] = 'o'; 
		frase[7] = 'l'; 
		frase[8] = 'a'; 
		frase[9] = '!'; 

		//Los dos puntos ":" significa que por letra pase por todo lo que hay en frase "0,1,2...".
		
		for(char letra: frase)	{
			System.out.println("Bucle avanzado " +letra);
		}
			
				
	}

}
