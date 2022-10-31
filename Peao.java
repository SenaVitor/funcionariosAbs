public class Peao extends Funcionario{
  public Peao(String nome, int matricula){
    setNome(nome);
    setMatricula(matricula);
  }

  public void fazerAtividade(Atividade atividade){
    System.out.println(getNome() + " fazendo atividade número " + atividade.getNumero() + " de custo " + atividade.getCusto());
  }
}