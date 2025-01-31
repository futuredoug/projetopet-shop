import java.util.Scanner;

public class petShop {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Olá, informe o nome por favor."); //nome do cliente

        String nome = entrada.next();

        System.out.println("Olá " + nome + ", a Pet Shop agradece seu contato, como podemos ajudar ?");// o que o cliente deseja
        System.out.println("1. Banho");
        System.out.println("2. Tosa");
        System.out.println("3. vacinas");

        int escolha = entrada.nextInt();
        entrada.nextLine();

        if (escolha == 1) {
            System.out.println("Você escolheu banho, vamos prosseguir");
            System.out.println("Por favor, informe o nome, raça do pet");

            String nomedopet = entrada.nextLine();
            String racadopet = entrada.nextLine();

            System.out.println("E para qual dia gostaria de agendar o(a) " + nomedopet + "?");

            System.out.println("1. Segunda-feira");
            System.out.println("2. Terça-feira");
            System.out.println("3. Quarta-feira");
            System.out.println("4. Quinta-feira");
            System.out.println("5. Sexta-feira");

            int diaEscolhido = entrada.nextInt();
            entrada.nextLine();

            String dia = " ";
            switch (diaEscolhido) {
                case 1:
                    dia = "Segunda-feira";
                    break;
                case 2:
                    dia = "Terça-feira";
                    break;
                case 3:
                    dia = "Quarta-feira";
                    break;
                case 4:
                    dia = "Quinta-feira";
                    break;
                case 5:
                    dia = "Sexta-feira";
                    break;
                default:
                    System.out.println("Opção invalida. Encerrando o agendamento");
            }

            System.out.println("Agora escolha o horário disponível (08:00 às 17:00):");

            String horarioEscolhido = entrada.nextLine();

            System.out.println("\nAgendamento confirmado:");
            System.out.println("Nome do cliente: " + nome);
            System.out.println("Serviço: Banho");
            System.out.println("Nome do pet: " + nomedopet);
            System.out.println("Raça do pet: " + racadopet);
            System.out.println("Dia: " + dia);
            System.out.println("Horário: " + horarioEscolhido);
            System.out.println("Obrigado por agendar com a Pet Shop!");
        }

        if (escolha == 2) {
            System.out.println("Você escolheu tosa, vamos prosseguir");
            System.out.println("Por favor, informe o nome, raça do pet");

            String nomedopet = entrada.nextLine();
            String racadopet = entrada.nextLine();

            System.out.println("E para qual dia e horário gostaria de agendar o(a) " + nomedopet + "?");

            System.out.println("1. Segunda-feira");
            System.out.println("2. Terça-feira");
            System.out.println("3. Quarta-feira");
            System.out.println("4. Quinta-feira");
            System.out.println("5. Sexta-feira");

            int diaEscolhido = entrada.nextInt();
            entrada.nextLine();

            String dia = " ";
            switch (diaEscolhido) {
                case 1:
                    dia = "Segunda-feira";
                    break;
                case 2:
                    dia = "Terça-feira";
                    break;
                case 3:
                    dia = "Quarta-feira";
                    break;
                case 4:
                    dia = "Quinta-feira";
                    break;
                case 5:
                    dia = "Sexta-feira";
                    break;
                default:
                    System.out.println("Opção invalida. Encerrando o agendamento");
            }
        }

        entrada.close();
    }
}
