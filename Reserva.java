public class Reserva{
//atributos
    private String cliente;
    private int periodoEstadia;
    private Quarto quarto;
    private double valorTotal;
    
//construtor para objetos da classe Reserva
    public Reserva(String cliente, int periodoEstadia, Quarto quarto, double valorTotal) {
        this.cliente = cliente;
        this.periodoEstadia = periodoEstadia;
        this.quarto = quarto;
        this.valorTotal = valorTotal;
        }
    //método para fazer o calculo do valor total a ser pago
    public double CalcularTotal(int PeriodoEstadia, double valorBase , double valorTotal){
       this.valorTotal = quarto.getPrecoBase() * periodoEstadia;
       return valorTotal;
    }
    //método que exibe as informações da reserva
     public void exibirDetalhes(Reserva reserva) {
        System.out.println("Cliente: " + reserva.getCliente());
        System.out.println("Período de Estadia: " + reserva.getPeriodoEstadia());
        System.out.println("Tipo de Quarto: " + reserva.getQuarto().getTipo());
        reserva.CalcularTotal(periodoEstadia, valorTotal, valorTotal);
        System.out.println("Preço Total: " + reserva.getValorTotal()) ; 
        }
    
    //Métodos Getters e Setters da classe
    public String getCliente() {
        return cliente;
        }
    
    public int getPeriodoEstadia() {
        return periodoEstadia;
        }
    
    public Quarto getQuarto() {
        return quarto;
        }
    
    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
}
