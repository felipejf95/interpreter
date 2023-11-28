public class Cambio {

    public static String formula = "real / dolar";

    public static double converter(double real, double dolar){
        String expressao;
        expressao = formula.replace("real", Double.toString(real));
        expressao = expressao.replace("dolar", Double.toString(dolar));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}
