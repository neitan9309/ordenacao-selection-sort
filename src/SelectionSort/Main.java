//Créditos para o dono do canal "Bro Code", que eu sempre recorro para procurar meus cursos (gratuitos) de programação.
//Link para o vídeo sobre estrutura de dados e algorítmos: https://youtu.be/CBYHwZcbD-s?si=NSHDQx0HUmC6M3XZ

package SelectionSort;

public class Main{
	
	public static void main(String args[]) {
		int array[] = {11, 4, 13, 24, 15, 1, 0, 7, 9, 5}; //Array desorganizada com 10 posições.
		
		selectionSort(array); //Chamada do método Selection Sort.
		
		for(int i : array) { //Impressão dos valores da array na tela do usuário.
			System.out.print(i + " ");
		}
	}
	
	public static void selectionSort(int[] array) {
		
		for(int i = 0; i < array.length - 1; i++) { //Loop que percorre toda a array e também é responsável pela repetição do loop que organiza os índices.
			int min = i; //Variável onde será escrito o menor valor encontrado a cada iteração.
			for(int j = i + 1; j < array.length; j++) { //Loop que inicia um índice na frente do loop anterior e é responsável por comparar ambos os valores.
				if(array[min] > array[j]) {				//Se "min" (assainada com o valor de "i") for maior que "j"
					min = j;							//reescrevemos a variável com o valor de "j".
				}
			}
			
			int temp = array[i];   //A cada iteração do loop principal assinamos a variável "temp" com o valor de "i",
			array[i] = array[min]; //o valor do índice "i" é reescrito com o valor da variável "min" (menor valor encontrado na iteração),
			array[min] = temp;	   //e por fim, reescrevemos o valor do índice "min" com o valor de "temp".
		}
	}
}
