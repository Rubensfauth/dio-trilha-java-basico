public class TiposDados {
    public static void main(String[] args) throws Exception {
        byte idade = 123;
        short ano = 2021;
        int cep = 89229070; // se começar com zero, talvez tenha que ser outro tipo, como string, pois o Java não armazena dados iniciando com zero como tipo INT. 
        long cpf = 33344455566L; // se começar com zero, talvez tenha que ser outro tipo
        float pi = 3.14F;
        double salario = 1275.33;
}
}