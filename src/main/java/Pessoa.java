public class Pessoa {

    private double real;
    private double dolar;

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getDolar() {
        return dolar;
    }

    public void setDolar(double dolar) {
        this.dolar = dolar;
    }

    public double converter(){
        return Cambio.converter(this.real, this.dolar);
    }
}
