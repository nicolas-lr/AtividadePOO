//@author Nicolas

public class Quarto{
  //atributos
  private String tipo; //1-simples 2-duplo 3-suite de luxo
  private double precoBase;
  private int camasCasal;
  private int camasSolteiro; 
  private int qntCamas; //quantidade maxima de camas por quarto
  
  //construtor
  public Quarto(String tipo, double precoBase, int camasCasal, int camasSolteiro, int qntCamas){
      this.tipo = tipo;
      this.precoBase = precoBase;
      this.camasCasal = camasCasal;
      this.camasSolteiro = camasSolteiro;
      this.qntCamas = qntCamas;
  }
  
  //metodos getters e setters
  public void setTipo(String tipo){
    this.tipo = tipo;
  }
  public String getTipo(){
    return tipo;
  }
  public void setPrecoBase(double precoBase){
    this.precoBase = precoBase;
  }
  public double getPrecoBase(){
    return precoBase;
  }
  public void setCamasCasal(int camasCasal){
    this.camasCasal = camasCasal;
  }
  public int getCamasCasal(){
    return camasCasal;
  }
  public void setCamasSolteiro(int camasSolteiro){
    this.camasSolteiro = camasSolteiro;
  }
  public int getCamasSolteiro(){
      return camasSolteiro;
  } 
}
  
