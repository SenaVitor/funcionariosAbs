public class Atividade{
  private final int numero;
  private final int custo;

  public Atividade(int numero, int custo){
    this.numero = numero;
    this.custo = custo;
  }

  public int getNumero(){
    return numero;
  }
  public int getCusto(){
    return custo;
  }
}