public abstract class Funcionario{
  private String nome;
  private int matricula;
  public abstract void fazerAtividade(Atividade atividade);

  public String getNome(){
    return nome;
  }
  public void setNome(String nome){
    this.nome = nome;
  }
  public int getMatricula(){
    return matricula;
  }
  public void setMatricula(int matricula){
    this.matricula = matricula;
  }
}