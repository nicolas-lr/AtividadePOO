public class Main {
   
        public static void main(String[] args) {
            QuartoSimples quartoSimples = new QuartoSimples();
            QuartoDuplo quartoDuplo = new QuartoDuplo();
            SuiteLuxo suiteLuxo = new SuiteLuxo();
    
            Reserva reserva1 = new Reserva("João", 3, quartoSimples, 0);
            Reserva reserva2 = new Reserva("Felipe", 2, quartoDuplo, 0);
            Reserva reserva3 = new Reserva("Julia", 1, suiteLuxo, 0);
    
            System.out.println("Bem vindo ao perfil de testes de reserva de quartos do Nassau's Grand Hotel");
            System.out.println("Os dados armazenados na reserva 1 são:");
            reserva1.exibirDetalhes(reserva1);
            
            System.out.println("Os dados armazenados na reserva 2 são:");
            reserva1.exibirDetalhes(reserva2);
 
            System.out.println("Os dados armazenados na reserva 3 são:");
            reserva1.exibirDetalhes(reserva3);
            
        }
    
      
    }
    
