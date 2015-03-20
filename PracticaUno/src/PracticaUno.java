import java.util.Scanner;
import java.util.Random;
public class PracticaUno {
	
  public static void main(String[] args) {
     llamar_menu();
      
  }

  //Aqui dibujamos el men� principal
public static void menu_principal(){
System.out.println("***************************************");
System.out.println("*****Menu Principal Practica No. 1*****");
System.out.println("***************************************");
//System.out.println(" ");
System.out.println("Presione (1) para ver los ejercicios de Nivel 1");
System.out.println("Presione (2) para ver los ejercicios de Nivel 2");
}
  
  //Este es el men� que nos muestra los ejercicios de nivel 1
public static void menu_nivel_uno(){
int operacion = 0;
System.out.println("Ejercicio No. 1");
System.out.println("Ejercicio No. 2");
System.out.println("Ejercicio No. 3");
System.out.println("Ejercicio No. 4");
System.out.println("Ejercicio No. 5");
System.out.println("Ingrese n�mero de ejercicio a ejecutar");
Scanner s = new Scanner(System.in);
operacion = s.nextInt();

switch (operacion){

    case 1:
      ejercicio_uno();
        break;
   
    case 2:
      ejercicio_dos();
        break;
       
    case 3:
      ejercicio_tres();
        break;
    
    case 4:
      ejercicio_cuatro();
        break;
    
    case 5:
      ejercicio_cinco();
        break;
    
    default:
        System.out.println("Opcion incorrecta");
		}     
        s.close();
 }

//Este es el menu que nos muestra los ejercicios del nivel 2
public static void menu_nivel_dos(){
int operacion = 0;
System.out.println("Ejercicio No. 6");
System.out.println("Ejercicio No. 7");
System.out.println("Ejercicio No. 8");
System.out.println("Ejercicio No. 9");
System.out.println("Ejercicio No. 10");
System.out.println("Ejercicio No. 11");
System.out.println("Ejercicio No. 12");
System.out.println("Ejercicio No. 13");
System.out.println("Ejercicio No. 14");
System.out.println("Ejercicio No. 15");
System.out.println("Ingrese n�mero de ejercicio a revisar");
Scanner s = new Scanner(System.in);
operacion = s.nextInt();

switch (operacion){
  
  case 6:  	
  	ejercicio_seis();
      break;
      
  case 7:
    ejercicio_siete();
      break;
  
  case 8:
	ejercicio_ocho();
	  break;
  
  case 9:
      
      break;
  
  case 10:
	ejercicio_diez(); 
      break;    

  case 11:
      
      break;   
  
  case 12:
	ejercicio_doce();
	  break;   
  
  case 13:
	ejercicio_trece();
	  break; 
  
  case 14:
	ejercicio_catorce();
      break; 

  case 15:
	ejercicio_quince();  
	  break; 
  
  default:
      System.out.println("Opcion incorrecta");
 }
s.close();
}

public static void ejercicio_uno(){
	
	String Rombo = ("        *\n\n      * * *\n\n    * * * * *\n\n  * * * * * * *\n\n* * * * * * * * *\n\n  * * * * * * *"
			+ " \n\n    * * * * *\n\n      * * *\n\n"
			+ "        *");
				  
	System.out.println(Rombo);
	
	llamar_menu();
}	

public static void ejercicio_dos(){
	
	int num1=0;
	int num2=0;
	int num3=0;
	int num4=0;
	int num5=0;
	int num6=0;
	double res=0;
	
	System.out.println("Ingrese notas:");
	Scanner p = new Scanner(System.in);
	num1 = p.nextInt();
	num2 = p.nextInt();
	num3 = p.nextInt();
	num4 = p.nextInt();
	num5 = p.nextInt();
	num6 = p.nextInt();
	
	res = ((num1+num2+num3+num4+num5+num6)/6);
	
	if(res<=59)
	System.out.println("Su nota es:" +" "+ "E");
	else if(res>60 & res<=69)
		System.out.println("Su nota es:" + " "+"D");
	else if(res > 70 & res<=79)
		System.out.println("Su nota es:"+ " "+"C");
	else if(res > 80 & res<=89)
		System.out.println("Su nota es:"+" "+"B");
	else if(res > 90 & res<=100){
		System.out.println("Su nota es:"+" "+ "A");
p.close();
	}
	llamar_menu();
}
	
public static void ejercicio_tres(){
	String hora;
	
	System.out.println("ingrese hora:");
	
	Scanner h = new Scanner(System.in);
	hora = h.next();
	
	
	
	if(hora.length()==5){
		String horas = hora;
		String horasArray[] = horas.split("\\:");
				
		switch(hora){
		
		case "13":
			hora = "01";
			System.out.println("Su hora es: " +hora + ":"+ horasArray[1]+"PM");
			break;
		case "14":
			hora = "02";
			System.out.println("Su hora es: " +hora);
			break;
		case "15":
			hora = "03";
			System.out.println("Su hora es: " +hora);
			break;
		case "16":
			hora = "04";
			System.out.println("Su hora es: " +hora);
			break;
		case "17":
			hora = "05";
			System.out.println("Su hora es: " +hora);
			break;
		case "18":
			hora = "06";
			System.out.println("Su hora es: " +hora);
			break;
		case "19":
			hora = "07";
			System.out.println("Su hora es: " +hora);
			break;
		case "20":
			hora = "08";
			System.out.println("Su hora es: " +hora);
			break;
		case "21":
			hora = "09";
			System.out.println("Su hora es: " +hora);
			break;	
		case "22":
			hora = "10";
			System.out.println("Su hora es: " +hora);
			break;	
		case "23":
			hora = "11";
			System.out.println("Su hora es: " +hora);
			break;	
		case "24":
			hora = "12";
			System.out.println("Su hora es: " +hora);
			break;	
			
		
		
		default: 
			System.out.println("Su hora es incorrecta:");
		
		}
	}
	else 
	{
		System.out.println("Formato de hora incorrecto, formato correcto 00:00");
	}
	llamar_menu();
	h.close();	
	
}

public static void ejercicio_cuatro(){
	double num = 0;
	double radio = 0;
	double area = 0;
	double perimetro = 0;
	double altura = 0;
	
	String opt;
	
    System.out.println("Datos para un circulo, presione C");
    System.out.println("Datos para un cuadrado, presione U");
    System.out.println("Datos para un triangulo, presione T");
    Scanner s = new Scanner(System.in);
    opt = s.next();
    
    //Datos para el C�rculo
    if(opt.equalsIgnoreCase("C")){
        System.out.println("Ingrese valor del di�metro");
        	Scanner m = new Scanner(System.in);
        	num = m.nextDouble();
        	radio = num/2;
        	area = (Math.PI)*(Math.pow(radio, 2));
        	perimetro = 2*(Math.PI)*(radio);
        	
        System.out.println("Area:"+" " +area);
        System.out.println("Per�metro" +" "+ perimetro);
        System.out.println("Radio" + " "+radio);
        llamar_menu();
        //m.close();
     }
    //Datos para el cuadrado
    else if(opt.equalsIgnoreCase("U")){
    	System.out.println("Ingrese el valor del lado del cuadrado");
    	Scanner m = new Scanner(System.in);
    	num = m.nextDouble();
    	area = Math.pow(num,  2);
    	perimetro = 4*num;
    	System.out.println("El �rea del cuadrado es:"+" " +area);
    	System.out.println("El per�metro del cuadrado es:"+" "+perimetro);
    	llamar_menu();
    	//m.close();
     }
    //Datos para el Tri�ngulo
    else if(opt.equalsIgnoreCase("T")){
    	System.out.println("Ingrese el valor del lado del Tri�ngulo Equil�tero:");
    	Scanner m = new Scanner(System.in);
    	num = m.nextDouble();
    	area = (Math.sqrt(3)/4)*(Math.pow(num, 2));
    	perimetro = 3*num;
    	altura = (Math.sqrt(3)/2)*num;
    	System.out.println("El �rea del Tri�ngulo Equil�tero es:"+" " +area);
    	System.out.println("El per�metro del Tri�ngulo Equil�tero es:"+" "+perimetro);
    	System.out.println("La altura del Tri�ngulo Equil�tero es:"+" "+ altura);
    	llamar_menu();
    	//m.close();
    }	
    llamar_menu();
   // s.close();
    
}

public static void ejercicio_cinco(){
	int dia1 = 0;
	int dia2 = 0;
	int mes1 = 0;
	int mes2 = 0;
	int a�o1 = 0;
	int a�o2 = 0;
	
	System.out.println("Ingrese Primer Fecha:");
	System.out.println("Ingrese dia:");
	Scanner f = new Scanner(System.in);
	dia1 = f.nextInt();
	System.out.println("Ingrese n�mero del mes:");
	mes1 = f.nextInt();
	System.out.println("Ingrese a�o:");
	a�o1 = f.nextInt();
	
	System.out.println("Ingrese segunda Fecha:");
	System.out.println("Ingrese dia:");
	dia2 = f.nextInt();
	System.out.println("Ingrese n�mero del mes:");
	mes2 = f.nextInt();
	System.out.println("Ingrese a�o:");
	a�o2 = f.nextInt();
	
	int dias =(dia2-dia1);
	int mes =(mes2-mes1)*30;
	int a�o = (a�o2-a�o1)*365;
	
    int diasfaltantes = dias + mes + a�o;
    
    System.out.println("Faltan "+diasfaltantes+ " dias");

llamar_menu();
f.close();
}

public static void ejercicio_seis(){
	
	double num1 = 0;
  	double num2 = 0;
  	double suma = 0;
  	double resta = 0;
  	double multi = 0;
  	double div = 0;
  	String opt;
  	
  	System.out.println("Ingrese operaci�n a realizar:");
  	System.out.println(" Para suma (s)\n Para resta(r)\n Para multiplicaci�n (m)\n Para divisi�n(d)\n");
  	Scanner s = new Scanner(System.in);
  	opt = s.next();
  	
  	if(opt.equalsIgnoreCase("s")){
  		System.out.println("Ingrese dos numeros:");
  		num1 = s.nextDouble();
  		num2 = s.nextDouble();
  		suma = num1+num2;
  		System.out.println("La suma de"+" "+num1+" "+"y"+" "+num2+" "+"es:"+" "+suma);
  		llamar_menu();
  	}
  	else if(opt.equalsIgnoreCase("r")){
  		System.out.println("Ingrese dos numeros:");
  		num1 = s.nextDouble();
  		num2 = s.nextDouble();
  		resta = num1-num2;
  		System.out.println("La resta de"+" "+num1+" "+"y"+" "+num2+" "+"es:"+" "+resta);
  		llamar_menu();
  	}
  	else if(opt.equalsIgnoreCase("m")){
  		System.out.println("Ingrese dos numeros:");
  		num1 = s.nextDouble();
  		num2 = s.nextDouble();
  		multi = num1*num2;
  		System.out.println("La multiplicaci�n de"+" "+num1+" "+"y"+" "+num2+" "+"es:"+" "+multi);
  		llamar_menu();
  	}
  	else if(opt.equalsIgnoreCase("d")){
  		System.out.println("Ingrese dos numeros:");
  		num1 = s.nextDouble();
  		num2 = s.nextDouble();
  		div = num1/num2;
  		System.out.println("La divisi�n de"+" "+num1+" "+"y"+" "+num2+" "+"es:"+" "+div);
  		llamar_menu();
  	}
  	
  	else
  		System.out.println("Opci�n Incorrecta");
  	llamar_menu();
  	//s.close();
  	
}

public static void ejercicio_siete(){
	
	int tabla = 0;
 	System.out.println("Qu� tabla de multiplicar desea?");
  Scanner p = new Scanner(System.in);
  tabla = p.nextInt();
  if(tabla>0 & tabla<=10){
  	for(int i = 10; i>0; i--)
  		System.out.println(tabla+" " + "x"+"  "+i+" " +"="+" "+(tabla*i));	
  }
  else{
  	System.out.println("N�mero fuera de rango");
  p.close();
  }
  llamar_menu();
}

public static void ejercicio_ocho(){
	
	 int nm1 = 0;
	  int nm2 = 0;
	  int res = 0;
	  int a = 0;
	  	  
	  System.out.println("Ingrese L�mite Inferior");
	  Scanner lm = new Scanner(System.in);
	  nm1 = lm.nextInt();
	  System.out.println("Ingrese L�mite Superior");
	  nm2 = lm.nextInt();
	  Random rnd = new Random();
	  	a = nm2-nm1;
	  	if(nm1>0 & nm1<100 & nm2>0 & nm2<100){
	  		
	  	res = (int)(rnd.nextDouble()* a + nm1);
	  	
	  	System.out.println("El n�mero generado es: "+ res);
	  	}
	  	else{
	  		System.out.println("Los n�meros estan fuera del intervalo de 0 a 100");
	  	lm.close();
	  	}
	  	llamar_menu();
	  	
}

public static void ejercicio_nueve(){
	
	
}

public static void ejercicio_diez(){
	
	 int numero = 0;
	  
     System.out.println("Ingrese n�mero: ");
    
     Scanner t = new Scanner(System.in);
     numero = t.nextInt();
     
     for(int i = 1; i <= numero; i++){
   	 
   	 for(int j = numero-(numero-2); j<=i; j++) 
   		  System.out.print(" ");
   	  	 for(int k = numero; k >= i; k--)
   	  		 System.out.print(i + " ");
   	  	 
   	  	 	 System.out.println(" ");
   	  	
   	 } 
    // t.close();
	
     llamar_menu();
}

public static void ejercicio_once(){
	
	
}

public static void ejercicio_doce(){
	
	String text;
	  
    System.out.println("Ingrese texto:");
    
    Scanner tex = new Scanner(System.in);
    text = tex.next();
    System.out.println("\n");
    for(int i=0; i<text.length(); i++){
  	  
  	  System.out.print("*");
    }
    System.out.println("\n");
    System.out.println(text);
    llamar_menu();
    //tex.close();
    
}

public static void ejercicio_trece(){
	
	String letra;
	String compara;
	
	
	
	System.out.println("Ingrese cualquier letra para iniciar");
	Scanner s = new Scanner(System.in);
	letra = s.next();
	
	System.out.println("Ingrese letra a comparar");
	compara = s.next();
	
	if(compara.compareTo(letra)==0)
		System.out.println("Las letras son iguales");
	else if(compara.compareTo(letra)<0)
		System.out.println(compara + " est� antes");
	else  
		System.out.println(compara + " est� despues");
	
    //s.close();
	llamar_menu();
    
}

public static void ejercicio_catorce(){
	
	int lado = 0;
  	System.out.println("Ingrese tama�o del lado del cuadrado:");
  	Scanner l = new Scanner(System.in);
  	lado = l.nextInt();
      for(int i = 1; i <= lado; i++){
            	for(int j = 1; j <= lado; j++){
            	System.out.print("*"+ " ");
            	}
      System.out.println(" ");      	
      }	
      //l.close();
      llamar_menu();
}

public static void ejercicio_quince(){
	
	 int contador = 1;
	  int num = 0;
 	System.out.println("Ingrese n�mero a verificar: ");
 	Scanner v = new Scanner(System.in);
 	num = v.nextInt();
 	
 	for(int i = 1; i<=num; i++)
 	{
 		if(num % i  == 1 ){
 			contador++;
 			
 		}
 		
 	}
 	
 	System.out.println("Hay "+contador+" n�mero(s) primos");
     llamar_menu();
   //v.close();
     
}

public static void llamar_menu(){
	 int num = 0;
     menu_principal();
     Scanner s = new Scanner(System.in);
     num = s.nextInt();
    
     switch(num){
             case 1:
                 menu_nivel_uno();
                 break;
             case 2:
                 menu_nivel_dos();
                 break;
             default:
                 System.out.println("Opci�n incorrecta, elija uno o dos");
     
 }
   s.close();  
	}
}



