import java.util.ArrayList;
import java.util.Scanner;

public class jogador {
    public static void main(String[] args) {
        ArrayList<jogador> jogadores = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Cadastro dos jogadores
        System.out.println(new jogador ("Alane Dias"));
        System.out.println(new jogador ("Beatriz Reis"));
        System.out.println(new jogador ("Davi Brito"));
        System.out.println(new jogador ("Deniziane Ferreira"));
        System.out.println(new jogador ("Fernanda Bande"));
        System.out.println(new jogador ("Giovana Lima"));
        System.out.println(new jogador ("Giovan Pitel"));
        System.out.println(new jogador ("Isabelle Nogueira"));
        System.out.println(new jogador ("Juninho"));
        System.out.println(new jogador ("Leidy Elin"));
        System.out.println(new jogador ("Lucas Henrique"));
        System.out.println(new jogador ("Lucas Luige"));
        System.out.println(new jogador ("Lucas pizzane"));
        System.out.println(new jogador ("Marcus Vinicius"));
        System.out.println(new jogador ("Maycon Cosmer"));
        System.out.println(new jogador ("MC Bin Laden"));
        System.out.println(new jogador ("Michel Nogueira"));
        System.out.println(new jogador ("Nizam"));
        System.out.println(new jogador ("raquel Cardoso"));
        System.out.println(new jogador ("Rodriguinho"));
        System.out.println(new jogador ("Vanessa Lopez"));
        System.out.println(new jogador ("Wanessa Camargo"));

        String voto;
        do {
            System.out.print("Em quem você vota para sair da casa? (Digite 'sair' para encerrar): ");
            voto = scanner.nextLine();

            if (!voto.equalsIgnoreCase("sair")) {
                // Encontra o jogador correspondente ao voto
                for (jogador jogador : jogadores) {
                    if (jogador.getNome().equalsIgnoreCase(voto)) {
                        jogador.incrementaUmVoto();
                        break;
                    }
                }
            }
        } while (!voto.equalsIgnoreCase("sair"));

        // Encontra o jogador mais votado
        Jogador eliminado = jogadores.get(0);
        for (Jogador jogador : jogadores) {
            if (jogador.getVotos() > eliminado.getVotos()) {
                eliminado = jogador;
            }
        }

        // Exibe a mensagem de eliminação
        System.out.printf("Se eu conseguir mover montanhas, se eu conseguir surfar um tsunami, se eu conseguir domar o sol, se eu conseguir fazer o mar virar sertão, e o sertão virar mar, se eu conseguir dizer o que eu nunca vou conseguir dizer, aí terá chegado o dia em que eu vou conseguir te eliminar com alegria. Com %d votos, é você quem sai %s.%n",
                eliminado.getVotos(), eliminado.getNome());
    }
}
