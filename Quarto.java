public class Quarto{
  //atributos
  private String tipo; //1-simples 2-duplo 3-suite de luxo
  private double precoBase;
  
  //construtor
  public Quarto(String tipo, double precoBase){
      this.tipo = tipo;
      this.precoBase = precoBase;
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
}
  
