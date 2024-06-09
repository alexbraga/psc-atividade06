package repository;

import dao.TrabalhadorDAO;
import model.Trabalhador;

import java.util.List;

public class TrabalhadorRepository {
    private static TrabalhadorRepository instance;
    private final TrabalhadorDAO TRABALHADOR_DAO;
    private List<Trabalhador> trabalhadores;

    private TrabalhadorRepository() {
        TRABALHADOR_DAO = new TrabalhadorDAO();
        TRABALHADOR_DAO.inicializarArquivo();
        carregarDados();
    }

    public static TrabalhadorRepository getInstance() {
        if (instance == null) {
            instance = new TrabalhadorRepository();
        }

        return instance;
    }

    public void carregarDados() {
        trabalhadores = TRABALHADOR_DAO.carregarTodos();
    }

    public void adicionarOuAtualizar(Trabalhador trabalhador) {
        Trabalhador existente = buscarPorCPF(trabalhador.getCpf());
        if (existente != null) {
            trabalhadores.remove(existente);
        }

        trabalhadores.add(trabalhador);
        TRABALHADOR_DAO.salvarTodos(trabalhadores);
    }

    public Trabalhador buscarPorCPF(String cpf) {
        for (Trabalhador trabalhador : trabalhadores) {
            if (trabalhador.getCpf().equals(cpf)) {
                return trabalhador;
            }
        }

        return null;
    }
}
