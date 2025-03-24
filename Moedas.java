import java.util.Scanner;

public class Moedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do teclado

        System.out.print("Digite o valor em centavos: "); // Solicita ao usuário que digite o valor
        int valor = scanner.nextInt(); // Lê o valor inteiro digitado pelo usuário

        calcular(valor); // Chama o método calcular com o valor fornecido pelo usuário

        scanner.close(); // Fecha o objeto Scanner para liberar recursos
    }

    public static void calcular(int valor) {
        int[] valorMoedas = {100, 50, 25, 10, 5, 1}; // Array contendo os valores das moedas em centavos (1 real, 50, 25, 10, 5, 1)
        int[] qtdMoedas = {0, 0, 0, 0, 0, 0}; // Array para armazenar a quantidade de cada moeda
        int valorAtual = valor; // Variável para controlar o valor restante a ser distribuído em moedas

        // Loop para percorrer os diferentes valores de moedas
        for (int idx = 0; idx < valorMoedas.length; idx++) {
            int elem = valorMoedas[idx]; // Obtém o valor da moeda atual

            // Verifica se o valor atual é maior ou igual ao valor da moeda atual
            if (valorAtual >= elem) {
                // Calcula a quantidade de moedas deste valor que podem ser usadas
                qtdMoedas[idx] = valorAtual / elem;
                // Atualiza o valor restante subtraindo o valor total das moedas usadas
                valorAtual = valorAtual - elem * qtdMoedas[idx];
            }

            // Se o valor atual se torna zero ou negativo, não há mais moedas a serem distribuídas
            if (valorAtual <= 0) {
                break; // Sai do loop, pois todas as moedas necessárias já foram encontradas
            }
        }

        // Loop para imprimir a quantidade de cada tipo de moeda
        for (int i = 0; i < valorMoedas.length; i++) {
            System.out.println(qtdMoedas[i] + " Moedas de " + valorMoedas[i] + " centavos");
        }
    }
}