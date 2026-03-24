import static java.lang.IO.*;
void main() {

    println("insira seu consumo mensal de agua no me em m3:");
    float consumo = Float.parseFloat(readln());


    if (consumo <= 10) {
        println("a sua conta foi : 22,38R$  ");

    }

    else if (consumo <= 20) {
        double custo = consumo * 3.50;
        println("a sua conta foi" + custo + "R$" );
    }


    else if (consumo <= 50) {
        double custo = consumo * 8.75;
        println("a sua conta foi" + custo + "R$" );
    }

    else {
        double custo = consumo * 9.64 ;
        println("a sua conta foi" + custo + "R$" );
    }
}