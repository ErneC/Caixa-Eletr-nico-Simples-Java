package caixa_eletronico;

public class sistema_caixa {

	public static void main(String[] args) {
		
		int sRestante = 53;
		int [] valDasNotas = {100,50,20,10,5,2}; 
		int [] quantDeNotas = distribuicaoDasNotas(sRestante, valDasNotas);
		
		printTela(sRestante, valDasNotas, quantDeNotas);
		
		for(int i = 0; i < quantDeNotas.length; i++) {
			System.out.println("Notas de "+valDasNotas[i]+": "+quantDeNotas[i]);
		}
				
	}
	
	
	public static void printTela(int sRestante, int [] valDasNotas,int [] quantDeNotas){
		System.out.println("Distribuindo R$"+sRestante+" em notas de 100,"
				+ "50, 20, 10, 5 e 2");
	}

	
	public static int[] distribuicaoDasNotas(int sRestante, int [] valDasNotas) {
		int [] quantDeNotas = new int[valDasNotas.length];
		
		for(int i = 0; i < quantDeNotas.length; i++) {
			quantDeNotas[i] = sRestante / valDasNotas[i];
			sRestante %= valDasNotas[i];
		}
		return quantDeNotas;
	} 

}
