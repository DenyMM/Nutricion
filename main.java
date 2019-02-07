import java.util.Scanner;

public class main {
	public static void main(String[] args){
        int i; // indice//
        double[] altura = new double[6]; // se declara el arreglo con el limite de numeros//
        int[] peso = new int[2];
        String[] actividades = new String[4] ;

        Scanner newAltura = new Scanner(System.in);
        Scanner newPeso = new Scanner(System.in); 
        Scanner newActividad = new Scanner(System.in);
        
        for(i=0; i<altura.length; i++) //se recorre el arreglo//
        {
        System.out.printf("Introduce tu altura en metros %d: ", i+1);
        altura[i] = newAltura.nextDouble(); //se guardan los numeros insertados//
        }
        for(i=0; i<peso.length; i++) //se recorre el arreglo//
        {
        System.out.printf("Introduce tu peso %d: ", i+1);
        peso[i] = newPeso.nextInt(); //se guardan los numeros insertados//
        }
        System.out.println("Lista de IMC");
        for(i=0; i<peso.length; i++){ // despues de recorrer el arreglo se condiciona//	
        	double IMC = (peso[i]/(altura[i]*altura[i]));
        System.out.println(IMC);  
        if (IMC<=18) {
        	System.out.println("Tiene peso bajo");
        }
        if (IMC >=18 && IMC <=24) {
        	System.out.println("Tiene peso normal");
        }
        if (IMC >=25 && IMC <=26) {
        	System.out.println("Tiene sobrepeso grado 1");
        }
        if (IMC >=27 && IMC <=29) {
        	System.out.println("Tiene sobrepeso grado 2");
        }
        if (IMC >=30 && IMC <=34) {
        	System.out.println("Tiene obesidad tipo 1");
        }
        if (IMC >=35 && IMC <=39) {
        	System.out.println("Tiene obesidad tipo 2");
        }
        if (IMC >=40 && IMC <=49) {
        	System.out.println("Tiene obesidad tipo 3 (Morbida)");
        }
        if (IMC >=50) {
        	System.out.println("Tiene obesidad tipo 4 (Extrema)");
        }
        }
        System.out.println("            ¿Que actividad practicas?");
        System.out.println(" Estar sentadol  - Natación  - Tenis    - Futbol");
        System.out.println(" Caminata lenta  - Bicicleta - Ping-pong - Yoga ");
        System.out.println(" Caminata rapida - Correr    - Gimnasia  - Baile");
        
        for(i=0; i<peso.length; i++) //se recorre el arreglo//
        {
        System.out.printf("Introduce tu actividad %d: ",i+0);
        actividades[i] = newActividad.nextLine();
        actividades.toString();
       
        }
        System.out.println("Lista de actividad");
        for(i=0; i<actividades.length; i++){ // despues de recorrer el arreglo se condiciona//	
        System.out.println(actividades[i]);   
       }
        
	
	}
}
