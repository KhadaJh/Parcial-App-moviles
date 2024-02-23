import java.util.Scanner;

class saludo {

	String bienvenido (){
		return "Bienvenido señor usuario";
	}

}

class sig_mens extends saludo{

	String bienvenido (){
		return "Por favor ingrese el numero de horas que ha estado usando nuestra app: ";
	}
}


class saludobackup extends taluego {
	String bienvenido(){
    	return super.bienvenido();

	}	    
}

class taluego extends saludo{

	String bienvenido(){
		return "Gracias por usarnos, ¡nos vemos pronto!";
	}
}

public class Main {
	

public static int valorfactura ( int x ) {

	if ( x == 0 ){
		return 0;
	} else {
		return 12000 + valorfactura (x-1);
	}
}




	public static void Main (String [] args){
        
        Scanner sc = new Scanner(System.in);
		saludo primero = new saludo();
		saludo segundo = new sig_mens();
		saludo tercero = new saludobackup();

		return primero.bienvenido() + "\n\n" + segundo.bienvenido();
	    int x = sc.nextInt();
        
        int result = valorfactura(x);
        
		System.out.println ("\n\nEl valor total a pagar es: "+ result +"\n\n");
		
		return tercero.bienvenido();
				
	}


}




