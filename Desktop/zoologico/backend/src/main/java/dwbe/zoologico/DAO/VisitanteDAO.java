package dwbe.zoologico.DAO;

import dwbe.zoologico.model.Visitante;

import java.util.ArrayList;
import java.util.List;
public class VisitanteDAO {
    private List<Visitante> visitantes = new ArrayList<>();

    public void cadastrarVisitante(Visitante visitante) {
        visitantes.add(visitante);
    }

    public List<Visitante> listarVisitantes() {
        return new ArrayList<>(visitantes);
    }

    public Visitante buscarVisitantePorId(int id) {
        for (Visitante visitante : visitantes) {
            if (visitante.getId() == id) {
                return visitante;
            }
        }
        return null;
    }

    public void atualizarVisitante(Visitante visitanteAtualizado) {
        for (Visitante visitante : visitantes) {
            if (visitante.getId() == visitanteAtualizado.getId()) {
                visitante.setNome(visitanteAtualizado.getNome());
                visitante.setIdade(visitanteAtualizado.getIdade());
                visitante.setTipoIngresso(visitanteAtualizado.getTipoIngresso());
                visitante.setPossuiGuia(visitanteAtualizado.isPossuiGuia());
                visitante.setPossuiMapa(visitanteAtualizado.isPossuiMapa());
                break;
            }
        }
    }

    public void deletarVisitante(int id) {
        visitantes.removeIf(visitante -> visitante.getId() == id);
    }
}
