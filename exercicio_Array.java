package códigos_programação;

import java.util.Scanner;

public class exercicio_Array {

	public static void main(String[] args) {
	 Scanner scanner = new Scanner (System.in);
	  
	 int pontuacaoTotal = 0;
     String resposta;

     String[] perguntas = {
         "1. Você se sente frequentemente inquieto ou agitado?",
         "2. Tem dificuldade para relaxar?",
         "3. Sente-se preocupado com frequência, mesmo sem motivo?",
         "4. Tem dificuldade em controlar suas preocupações?",
         "5. Sente medo excessivo em situações cotidianas?",
         "6. Evita situações por medo de se sentir ansioso?",
         "7. Tem dificuldade para dormir devido à preocupação?",
         "8. Sente tensão muscular com frequência?",
         "9. Você fica facilmente irritado?",
         "10. Tem dificuldade de concentração devido à preocupação?"
     };

     System.out.println("Responda as perguntas com 'sim' ou 'não'.");

     for (int i = 0; i < perguntas.length; i++) {
         do {
             System.out.println(perguntas[i]);
             resposta = scanner.next().toLowerCase();
         } while (!resposta.equals("sim") && !resposta.equals("não"));

         if (resposta.equals("sim")) {
             pontuacaoTotal += 1;
         }
     }

     System.out.println("Sua pontuação total é: " + pontuacaoTotal);

     // Avaliação baseada na pontuação
     if (pontuacaoTotal <= 3) {
         System.out.println("Nível de ansiedade: Baixo.");
     } else if (pontuacaoTotal <= 6) {
         System.out.println("Nível de ansiedade: Moderado.");
     } else if (pontuacaoTotal <= 8) {
         System.out.println("Nível de ansiedade: Alto.");
     } else {
         System.out.println("Nível de ansiedade: Muito alto. Procure ajuda profissional.");
     }
	  
	 

	}

}
