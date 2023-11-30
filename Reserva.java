// @author Nicolas
public class Reserva{
//atributos
    private String cliente;
    private String periodoEstadia;
    private Quarto quarto;
    public Reserva(String cliente, String periodoEstadia, Quarto quarto) {
        this.cliente = cliente;
        this.periodoEstadia = periodoEstadia;
        this.quarto = quarto;
        }
    public String getCliente() {
        return cliente;
        }
    
    public String getPeriodoEstadia() {
        return periodoEstadia;
        }
    
    public Quarto getQuarto() {
        return quarto;
        }
    
    public double calcularPrecoTotal() {
        quarto.getPrecoBase() + quarto.getCamasCasal() + quarto.getCamasSolteiro()
        return quarto.getPrecoBase();
        }   
    }




