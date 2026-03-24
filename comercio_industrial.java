import static java.lang.IO.*;
void main() {

    println("insira seu consumo mensal de agua no me em m3:");
    float consumo = Float.parseFloat(readln());


    if (consumo <= 10) {
        println("a sua conta foi : 44.95R$  ");

    }

    else if (consumo <= 20) {
        double custo = consumo * 8.75;
        println("a sua conta foi" + custo + "R$" );
    }


    else if (consumo <= 50) {
        double custo = consumo * 16.76;
        println("a sua conta foi" + custo + "R$" );
    }

    else {
        double custo = consumo * 17.46 ;
        println("a sua conta foi" + custo + "R$" );
    }
}