// @author Nicolas
public class Main {
    public static class SistemaReservas {
        public static void main(String[] args) {
            QuartoSimples quartoSimples = new QuartoSimples();
            QuartoDuplo quartoDuplo = new QuartoDuplo();
            SuiteLuxo suiteLuxo = new SuiteLuxo();
    
            Reserva reserva1 = new Reserva("Cliente1", "2023-12-01", quartoSimples);
            Reserva reserva2 = new Reserva("Cliente2", "2023-12-10", quartoDuplo);
            Reserva reserva3 = new Reserva("Cliente3", "2023-12-20", suiteLuxo);
    
            System.out.println("Reserva 1:");
            exibirDetalhesReserva(reserva1);
    
            System.out.println("\nReserva 2:");
            exibirDetalhesReserva(reserva2);
    
            System.out.println("\nReserva 3:");
            exibirDetalhesReserva(reserva3);
            
        }
    
        private static void exibirDetalhesReserva(Reserva reserva) {
            System.out.println("Cliente: " + reserva.getCliente());
            System.out.println("Período de Estadia: " + reserva.getPeriodoEstadia());
            System.out.println("Tipo de Quarto: " + reserva.getQuarto().getTipo());
            System.out.println("Preço Total: " + reserva.calcularPrecoTotal()); 
        }
    }
    
}
