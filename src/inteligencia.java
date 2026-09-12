public class inteligencia extends PessoaPOO{

    public void inteligenciaBoa(){
        System.out.println("Inteligência acima da média");
    }

    @Override // diferencia atributo dos objetos
    public void chatice() {
        System.out.println("Somos parecidos com o Martires e somos parentes dele");
    }

    public void chatice(int nivelParentesco){
        if (nivelParentesco == 1 ){
            System.out.println("Eu sou filho ou filha do martires");
        }
    }
}
