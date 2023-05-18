package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {


        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(8);
        Filme meuFilme = new Filme("Top Gun:Maverick", 2022);
        meuFilme.avalia(10);
        Filme outroFilme = new Filme("Avatar - O Caminho da Agua", 2023);
        outroFilme.avalia(7);
        Serie lost = new Serie("Lost", 2000);
        lost.avalia(6);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item: lista) {
            System.out.println("Nome: " + item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }
    }
}