package targetSistemasRepositorio;

public class StringCheck {

	public static void main(String[] args) {
		//palavra escolhida na String abaixo
		String palavra = "Abacate";
		//String palavra = "Bombeiro";
		//String palavra = "Bola";
		//String palavra = "Videira";
		//String palavra = "Inteligente";
		//String palavra = "Criativo";
		
		/*Retirar // da palavra que quiser testar como entrada*/
		
		String palavraSemA = palavra.replace("a", "");//Removo as ocorrencias de 'a' ou 'A'
		palavraSemA = palavraSemA.replace("A", "");
		
		int diferenca = palavra.length() - palavraSemA.length();
		//Comparo a palavra com ela sem os a's pra saber a diferença
		if(diferenca == 0) {
			System.out.println("A palavra não contém A's");
			System.out.println("Qtd de A's na palavra = "+diferenca);
		}else {
			System.out.println("A palavra contém a letra A");
			System.out.println("Qtd de A's na palavra = "+diferenca);
		}
		
	}


}
