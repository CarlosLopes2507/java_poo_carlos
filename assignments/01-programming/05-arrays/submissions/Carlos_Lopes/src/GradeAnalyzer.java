import java.util.InputMismatchException;
import java.util.Scanner;
public class GradeAnalyzer {
    //Calcular a Média das Notas
    public static double calculateAverage(int[] grades){
        int soma = 0;
        for(int i = 0; i < grades.length;  i++){
            soma += grades[i];
        }
        double media = (double) soma / grades.length;
        return media;
    }
    //Encontrar a Maior Nota
    public static int findHighestGrade(int[] grades){
        int MaiorNota = grades[0];
        for(int i = 0; i < grades.length; i++){
            if(grades[i] > MaiorNota){
                MaiorNota = grades[i];
            }
        }
        return MaiorNota;
    }
    //Encontrar a Menor Nota
    public static int findLowestGrade(int[] grades){
        int MenorNota = grades[0];
        for(int i = 0; i < grades.length; i++){
            if(grades[i] < MenorNota){
                MenorNota = grades[i];
            }
        }
        return MenorNota;
    }

    //Calcular Quantas notas estão acima da média
    public static int countGradesAtOrAboveAverage(int[] grades){
        int soma = 0;
        for(int i = 0; i < grades.length;  i++){
            soma += grades[i];
        }
        double media = (double) soma / grades.length;

        int AcimaMedia = 0;
        for(int i = 0; i < grades.length; i++){
            if(grades[i] >= media){
                AcimaMedia++;
            }
        }
        return AcimaMedia;
    }

    //Frequência das Notas
    public static int[] calculateFrequency(int[] grades){
        int[] frequency = new int[11];
        for(int nota : grades){
            if(nota >= 0 && nota <= 100){
                frequency[nota / 10]++;
            }
        }
        return frequency;
    }

    public static String formatFrequencyLine(int index, int frequency){
        if(index == 10){
            return String.format("100: %d", frequency);
        }
            int IntervalStart = index * 10;
            int IntervalEnd = IntervalStart + 9;
            return String.format("%02d-%02d: %d",IntervalStart, IntervalEnd, frequency);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int Tamanho;
        int nota;
        int[] grades;

        System.out.print("Digite a quantidade de estudantes: ");
        Tamanho = scanner.nextInt();
        grades =  new int[Tamanho];

        for(int i = 0; i < Tamanho; i++){
            nota = 0;
            boolean entradaInvalida = false;

            do {
                try {
                    System.out.printf("Digite a nota do estudante %d: ",i+1);
                    nota = scanner.nextInt();
                    if(nota < 0 || nota > 100){
                    System.out.println("Nota Invalida Digite Novamente!");
                    } else {
                    entradaInvalida = true;
                    }    
                } catch (InputMismatchException e) {
                    System.out.println("Digite um Numero Inteiro!");
                    scanner.nextLine();
                }
            }while(!entradaInvalida);
            grades[i] = nota;
        }

        double media = calculateAverage(grades);
        System.out.printf("Média da turma: %.2f%n", media);

        int MaiorNota = findHighestGrade(grades);
        System.out.printf("Maior Nota: %d\n", MaiorNota);

        int MenorNota = findLowestGrade(grades);
        System.out.printf("Menor Nota: %d\n", MenorNota);

        int AcimaMedia = countGradesAtOrAboveAverage(grades);
        System.out.printf("Notas acima ou iguais à média: %d\n\n", AcimaMedia);

        System.out.print("Distribuição de notas:\n");
        int[] frequency = calculateFrequency(grades);
        for(int i = 0; i < frequency.length; i++){
            String linhaFormatada = formatFrequencyLine(i, frequency[i]);
            System.out.println(linhaFormatada);
        }
    }    
}
