package br.edu.fafic.es;

public class Calculadora {

	//Andr� - M�todo Subtra��o
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
			System.out.println("As medidas nao obedecem a condicaoo existencia do triangulo");
		}
	}

	public void imprimirNome(){
		System.out.println("Luciano Tavares");
	}

}
