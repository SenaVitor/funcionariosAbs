class Main {
  public static void main(String[] args) {
    Atividade atividade1 = new Atividade(1, 10);
    Peao peao = new Peao("Vitor", 1);
    Peao peao1 = new Peao("André", 2);
    Gerente gerente = new Gerente("Lucas", 3, 4);
    gerente.fazerAtividade(atividade1);
    gerente.adicionarSubordinado(peao);
    gerente.adicionarSubordinado(peao1);
    gerente.fazerAtividade(atividade1);
  }
}