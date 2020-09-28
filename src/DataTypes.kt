fun main(){

    //definindo uma variavel IMUTÁVEL SEM tipo
    //val NÃO é uma variável mutável.
    val str = "Welcome to Kotlin ";

    //definindo variável IMUTÁVEL COM tipo
    val str2:String = "Pedro";

    /** VAR é uma variável MUTÁVEL **/
    var name:String? = "Pedro Andrade";

    //formas de chamar uma variável
    println(str);
    println(str + str2);

    //ou utilizando o $, que pode ser utilizado para operações
    println("SEGUNDO MODO: $str $str2");

    name = "Ventura";

    /** Se a variável MUTÁVEL possuir + de um valor, deverá ser chamada entre ${ } **/
    println("Variável mutavel assumindo um novo valor: ${name!!} ");


}