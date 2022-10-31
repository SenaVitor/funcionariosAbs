public class Gerente extends Funcionario{
  private int numSubordinadosAtuais = 0;
  private Funcionario[] subordinados;
  public Gerente(String nome, int matricula, int numSubordinados){
    setNome(nome);
    setMatricula(matricula);
    subordinados = new Funcionario[numSubordinados];
  }

  public void adicionarSubordinado(Peao peao){
    if(numSubordinadosAtuais < subordinados.length){
      subordinados[numSubordinadosAtuais] = peao;
      numSubordinadosAtuais++;
    }else{
      System.out.println("Gerente " + getNome() + " atingiu o número máximo de subordinados!");
    }
  }
  
  public void fazerAtividade(Atividade atividade){
    if(numSubordinadosAtuais > 0){
      for(int i = 0; i < numSubordinadosAtuais; i++){
        subordinados[i].fazerAtividade(atividade);
      }
    }else{
      System.out.println("Gerente " + getNome() + " não possui subordinados!");
    }
  }
}