//import java.util.ArrayList;
//
//public  class Main {
//
//    public static void main(String[] args){
//        int idade = 20;
//
//        String sla = "";
//
//        if(sla.isBlank()){
//            System.out.println("Não sei qq faz"); // o isBlank pede se ela é vazia
//        }else {
//            System.out.println("tentando");
//        }
//
//        if (idade >= 20){
//            System.out.println(true);
//        }else{
//            System.out.println(false);
//        }
//
//
//        ArrayList<String> name = new ArrayList<>();
//    }
//
//}


//public class Main {
//     public static void main(String[] args){
//
//         //CRIAÇÃO DE OBJETOS objeto1
//         PessoaPOO marcos = new PessoaPOO(); // a 2 parte é um novo e o nome da classe, referenciando como um METODO
//         //acessar atributos da classe
//         marcos.SetNome("Marcos");
//         marcos.manco(); // tem acesso ao metodo ateaves do . e nome do atributo
//         marcos.chatice();
//
////         //objeto 2
////         PessoaPOO maristela = new PessoaPOO();
////         maristela.nome = "Maristela";
//
//         // herança
//         inteligencia maristela = new inteligencia();
//         maristela.inteligenciaBoa();
//         maristela.familia = "Thibes De Campos e Maso";
//         System.out.println(maristela.familia);
//         maristela.chatice();
//         maristela.chatice(1);
//
//                                // não precisa explicitar o tipo dentro do mostrarFuncao, o java mesmo coloca pelo parametro anterior
//
//            mostrarFuncao(  "VitaminaD ", "Auxiliar produção de testosterona e imunidade", 1); // passou parametro embaixo tem que passar valor aqui dentro
//
//    }
//
//    private static void mostrarFuncao(String nome, String funcao ,int qntDosagem){ // void significa que não vai retornar nada, TEM QUE PASSAR TIPO PRA PARAMETRO
//    System.out.println(nome + funcao + qntDosagem);
//    }
//}

public class Main {

    public static void main(String [] args){
        Vitamina vitamina1 = new Vitamina("Vitamina C", "", "", "", "", "");
        Vitamina vitamina2 = new Vitamina("Vitamina D", "", "", "", "", "");


        System.out.println(vitamina1);
        /*Puxa o getter p teste */
        System.out.println(vitamina1.getNome());

        /*Teste do setter */
        System.out.println(vitamina1.getNome());
        vitamina1.setNome("Mudando nome");
        System.out.println(vitamina1.getNome());
    }
}