package decorator;

import decorator.decoradores.Moncha;
import decorator.decoradores.Whip;
import decorator.objetosconcretos.Expresso;

/***
 * Perceba que cada decorador guarda uma variavel
 * de instancia que aponta para um objeto  do tipo mais abstrato pai dos decoradores e dos objetos concretos(no caso Beverage)
 * isso permite que um decorador mais externo na camada conheça o decorador imediatamente mais interno.
 *
 */
public class Teste {

    public static void main(String ...args){

        //Inicialmente bebidia aponta para um objeto concreto Espresso
        Bevarage bebida = new Expresso(); // A

        //Mocha internamente guarda uma referencia para o objeto (Expresso)
        bebida = new Moncha(bebida); // B

        //Mocha internamente guarda uma referencia para o objeto anterior (Moncha)
        bebida = new Moncha(bebida); // C

        // Whip internamente guarda uma referencia para o objeto anterior (Moncha)
        bebida = new Whip(bebida); // D

        //Ao invocar bebida getDescricao nesta linha estamos invocando o getDescricao do Whip da linha D, que por sua
        // vez invoca o gedDestcicao do Moncha da linha C, que invoca o getDescricao do Moncha da linha B,
        // que invoca o gedDescricao do Expresso da linha A , que retorna a descrição pra B, C e D,
        // compondo a descrição final 'Espresso, Moncha, Moncha, Whip'
        System.out.println(bebida.getDescricao());
    }
}
