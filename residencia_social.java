import static java.lang.IO.*;
void main() {

    println("insira seu consumo mensal de agua no me em m3:");
    float consumo = Float.parseFloat(readln());


    if (consumo <= 10) {
        println("a sua conta foi : R$ 7,59 ");

    }

    else if (consumo <= 20) {
        double custo = consumo * 1.32;
        println("a sua conta foi" + custo + "R$" );
    }

    else if (consumo <= 30) {
        double custo = consumo * 4.64;

        println("a sua conta foi" + custo + "R$" );
    }

    else if (consumo <= 50) {
        double custo = consumo * 6.62;
        println("a sua conta foi" + custo + "R$" );
    }

    else {
        double custo = consumo * 9.64 ;
        println("a sua conta foi" + custo + "R$" );
    }
}