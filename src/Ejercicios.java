//Este trabajo se realizo en grupo con Maynor

public class Ejercicios
{
	//deveulve true si "numero" es par y false de lo contrario
	static boolean esPar(int numero)
	{
		if (numero % 2 == 0)//Se hace el "if" para evaluar la condicion y sacar si es par o no.
		{
			return true;//si la condicion es verdadera devuelve "true".
		}
		return false;// si la condicion es falsa devuelve "false".
	}
	
	//devuelve "paquetillo" si lempiras es menor que 50
	//devuelve "paquetin" si lempiras es menor que 100
	//devuelve "paquetote" si lempiras es menor que 200
	//de lo contrario devuelve paqueton
	//nota: solo aceptan minusculas
	static String churches(int lempiras)
	{
		if (lempiras < 50 )//Se establece un "if" para evaluar la condicion propuesta.
			return "paquetillo";//devuelve lo que queremos saber.
		if (lempiras < 100)//Se establece un "if" para evaluar la condicion propuesta.
			return "paquetin";//devuelve lo que queremos saber.
		if (lempiras < 200)//Se establece un "if" para evaluar la condicion propuesta.
			return "paquetote";//devuelve lo que queremos saber.
		return "paqueton";//Si ninguna condicion anterior es correcta se devuelve otra respuesta.
	
		
		
	}
	
	//devuelve el factorial de "num"
	static int factorial(int num)
	{
		if (num==1)//Se hace un "if" para empezar la formula de factorial.
			return 1;//devuelve 1.
		else//Se hace un "else" para evaluar si la condicion anterior no es correcta. 
			return num *factorial(num-1);//Se hace la operacion que se quiere.
	}
	
	//devuelve el elemento de "arr" en la posicion "pos"
	static int getElemento(int arr[],int pos)
	{
		return arr[pos];//Devuelve "arr" en la posicion asignada "pos". 
	}
	
	//devuelve el elemento de "arr" en la posicion ["col"] ["fila"]
	static int getElemento(int arr[][],int col,int fila)
	{
		return arr[col][fila];//Devuelve el arreglo bidimensional un la "col" y "fila" asignada.
	}
	
	//devuelve el atributo "x" de "MiClase"
	static int getX(MiClase mi_clase)
	{
		return mi_clase.x;//Devulve el atributo x en la posicion buscada.
	}
	
	//implementar la funcion "getXPor2()" descrita en la clase "MiClase"
	//No modificar esta funcion
	static int implementarGetXPor2(MiClase mi_clase)
	{
		return mi_clase.getXPor2();
	}
	
	//implementar la funcion "getXPor2()" descrita en la clase "MiClase"
	//No modificar esta funcion
	static int implementarGetXMasY(MiClase mi_clase, int y)
	{
		return mi_clase.getXMasY(y);
	}
	
	//devuelve la funcion fibonacci de "num"
	//nota: puedes consultar la funcion en http://es.wikipedia.org/wiki/Sucesi%C3%B3n_de_Fibonacci
	static int fibonacci(int num)
	{
		if (num == 1)//Se agregan las condiciones de la formula con un "if".
			return 1;//Devuelve 1
		
		else //Se hace un "else" para evaluar si la condicion anterior no es correcta.
			if(num == 0)//Se agregan las condiciones de la formula con un "if".
			return 0;//Devuelve 0.
		
		else//Se hace un "else" para evaluar si las condiciones anteriores no son correctas.
		return fibonacci(num - 1) + fibonacci(num -2);//Devuleve la formula de fibonacci.
	}
	
	//realizar la siguiente funcion recursiva:
	//funcionRecursiva(n) = funcionRecursiva(n-1)*2+1
	//donde: funcionRecursiva(0) = 0 y funcionRecursiva(1) = 2
	static int funcionRecursiva(int num)
	{
		if (num == 0)//Se hace un "if" para igual a 0.
		
			return 0;//Devuelve 0.
		else//Se hace un "else" por si la condicion anterior no es correcta.
		if (num == 1)//Se hace un "if" para igual a 1.
		
			return 2;//Devuleve 2.
		
		else//Se hace un "else" por si la condicion anterior no es correcta.
		
		return funcionRecursiva(num - 1)*2 +1;//Devuelve la funcion recursiva segun la formula escrita.
		
		
	}
	
	public static void main(String[] args)
	{

	}

}
