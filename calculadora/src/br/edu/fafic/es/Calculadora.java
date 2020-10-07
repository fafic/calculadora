package br.edu.fafic.es;

public class Calculadora {

	//André - Método Subtração
	public float subtrair(float a, float b) {
		float resultado = a-b;
		return resultado;
	}

	public int calcularQuadrado(int a){
		return a*a;
	}

	public float calcularQuadrado(float a){
		return a*a;
	}

	public static void calAreaTriangulo(){
		double a=0,b=0,c=0 ,Area,semip,perimetro;

		if((a<b+c)||(b<a+c)||(c<b+a)){
			perimetro=a+b+c;

			semip=perimetro/2;

			Area=Math.sqrt(semip*(semip-a)*(semip-b)*(semip-c));

			System.out.println(" perimetro: "+perimetro);
			System.out.println("Area= "+Area);
		}
		else{
			System.out.println("As medidas não obedecem a condição existência do triângulo");
		}
	}

	public void imprimirNome(){
		System.out.println("Luciano");
	}

	public void metodoDaBranchDoDesenevolvedor(){
		System.out.println("Cada um na sua branch");
	}


}
