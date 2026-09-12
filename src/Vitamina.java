public class Vitamina {

    private String nome;
    private String funcao;
    private String sintomaDeficiencia;
    private String fonteAlimentar;
    private String doseRecomendada;
    private String vitaminaCura;

    //Aqui em baixo tem que criar um construtor

    /* Criar um contrutor, o Setter é individual, teria q ter public String SetNome()*/
    /*Construtor é um molde que encaixa os valores futuros das variaveis */

    public Vitamina(String nome, String funcao, String sintomaDeficiencia, String fonteAlimentar, String doseRecomendada, String vitaminaCura){
        this.nome = nome;
        this.funcao = funcao;
        this.sintomaDeficiencia = sintomaDeficiencia;
        this.fonteAlimentar = fonteAlimentar;
        this.doseRecomendada = doseRecomendada;
        this.vitaminaCura = vitaminaCura;
    }

    /*Aqui os getters para mostrar ao usuário o valor das variaveis, como o nome da Vitamina */
    public String getNome() {
        return nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public String getSintomaDeficiencia(){
        return getSintomaDeficiencia();
    }

    public String getFonteAlimentar() {
        return fonteAlimentar;
    }

    public String getDoseRecomendada() {
        return doseRecomendada;
    }

    public String getVitaminaCura() {
        return vitaminaCura;
    }
    


}
