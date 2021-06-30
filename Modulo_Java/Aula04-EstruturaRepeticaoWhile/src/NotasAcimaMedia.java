import java.util.Scanner;

public class NotasAcimaMedia {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int media;
		System.out.println("Digite a médida de nota da turma: ");
		media = leitor.nextInt();
		
		int i = 0;
		int nota=0;
		int qtdAlunoNotaSuperior=0;
		int qtdAlunoNotaInferior=0;
		int qtdAlunoNotaIguais=0;
		
		while (i < 50) {
			System.out.println("Digite a nota do " + (i+1) + "º aluno: ");
			nota = leitor.nextInt();
			
			if (nota > media) {
				qtdAlunoNotaSuperior = qtdAlunoNotaSuperior + 1;
			}else if (nota < media) {
				qtdAlunoNotaInferior++;
			}else {
				qtdAlunoNotaIguais+=1;
			}
			i++;			
		}
		
		System.out.println("A quantidade de Alunos que obtiveram notas superiores a média da turma foi de: " + qtdAlunoNotaSuperior);
		System.out.println("A quantidade de Alunos que obtiveram notas inferiores a média da turma foi de: " + qtdAlunoNotaInferior);
		System.out.println("A quantidade de Alunos que obtiveram notas iguais a média da turma foi de: " + qtdAlunoNotaIguais);
		
		leitor.close();
	
	}
}
