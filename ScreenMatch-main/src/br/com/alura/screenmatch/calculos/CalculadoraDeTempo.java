package br.com.alura.screenmatch.calculos;


import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Titulo titulo){
        tempoTotal += titulo.getDuracaoEmMinutos();
    }

//    public void inclui(Filme f){
//        tempoTotal += f.getDuracaoEmMinutos();
//    }  Sobrecarga de Método
//    public void inclui(Serie s){
//        tempoTotal += s.getDuracaoEmMinutos();
//    }
}
