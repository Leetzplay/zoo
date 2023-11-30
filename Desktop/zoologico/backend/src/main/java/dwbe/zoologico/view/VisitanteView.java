package dwbe.zoologico.view;

import dwbe.zoologico.model.Visitante;

public class VisitanteView {

    public void exibirInformacoesVisitante(Visitante visitante) {
        System.out.println("Informações do Visitante:");
        System.out.println("ID: " + visitante.getId());
        System.out.println("Nome: " + visitante.getNome());
        System.out.println("Idade: " + visitante.getIdade());
        System.out.println("Tipo de Ingresso: " + visitante.getTipoIngresso());
        System.out.println("Possui Guia: " + (visitante.isPossuiGuia() ? "Sim" : "Não"));
        System.out.println("Possui Mapa: " + (visitante.isPossuiMapa() ? "Sim" : "Não"));
        System.out.println();
    }
}