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

    public String getSintomaDeficiencia() {
        return sintomaDeficiencia;
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

    /*Aqui começa os Setters para quando precisar adicionar mais informações */
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public void setSintomaDeficiencia(String sintomaDeficiencia){
        this.sintomaDeficiencia = sintomaDeficiencia;
    }

    public void setFonteAlimentar(String fonteAlimentar) {
        this.fonteAlimentar = fonteAlimentar;
    }

    public void setDoseRecomendada(String doseRecomendada){
        this.doseRecomendada = doseRecomendada;
    }

    public void setVitaminaCura(String vitaminaCura) {
        this.vitaminaCura = vitaminaCura;
    }

    @Override
    public String toString(){
        return "Vitamina: " + nome +
            "\n função: " + funcao +
               "\n Sintomas da Deficiência: " + sintomaDeficiencia +
                "\n Fonte Alimentar: " + fonteAlimentar +
                    "\n Dose Recomendada: " + doseRecomendada +
                        "\n Vitamina cura estes problemas: " + vitaminaCura;
    }

}
