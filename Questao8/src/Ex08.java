public class Ex08 {
    public static void main(String[] args) {

        ImpostoRenda Joao = new ImpostoRenda("João Antonio dos Santos","123456789","RS",10000);
        ImpostoRenda Maria = new ImpostoRenda("Maria Regina","45788897514","SC", 20000);
        ImpostoRenda Zezinho = new ImpostoRenda("Zezinho da Silva","11111111111","PR", 5000);
        ImpostoRenda Marques = new ImpostoRenda("Leandro Marques","22211133389","RS", 80000);
        ImpostoRenda Lian = new ImpostoRenda("Lian Carlos de Almeida", "98766681900",3000);

        ImpostoRenda clientes[] = {Joao,Maria,Zezinho,Marques,Lian};

        // a) Quem mais paga imposto.

        // b) Qual o total de imposto pago entre os 5 contribuintes?

    }
}
