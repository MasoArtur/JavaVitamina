public class PessoaPOO {
    private String nome;
    String familia;
    int idade;

    //criar um atributo para o objeto

    /* Criar um Getter, que mostra pro usuário */
    public String getNome() {
        return nome;
    }

    /*Setter - Criação de Setter, Settar o valor da variável*/

    public void SetNome(String nome){
        this.nome = nome;
        System.out.println("Mude o nome");
    }



    public void manco(){
        System.out.println("É manco");
    }

    public void chatice(){
        System.out.println("Somos parecidos com o Martires");
    }
}
