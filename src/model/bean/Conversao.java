
package model.bean;

/**
 *
 * @author Pedro Citadin Coelho
 */
public class Conversao {
       private Float valor;
       private int moedaInicial;
       private int moedaFinal;
       private Float valorFinal;

    public Conversao(Float valor, int moedaInicial, int moedaFinal) {
        this.valor = valor;
        this.moedaInicial = moedaInicial;
        this.moedaFinal = moedaFinal;
    }
       
    public String retornaString(){
        return valor+"//"+moedaInicial+"//"+moedaFinal;
    }
       
    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public int getMoedaInicial() {
        return moedaInicial;
    }

    public void setMoedaInicial(int moedaInicial) {
        this.moedaInicial = moedaInicial;
    }

    public int getMoedaFinal() {
        return moedaFinal;
    }

    public void setMoedaFinal(int moedaFinal) {
        this.moedaFinal = moedaFinal;
    }

    public Float getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(Float valorFinal) {
        this.valorFinal = valorFinal;
    }
       
       
}
