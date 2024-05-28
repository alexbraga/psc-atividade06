package repository;

import dao.TrabalhadorDAO;
import model.Trabalhador;

import java.util.ArrayList;
import java.util.List;

public class TrabalhadorRepository {
    private static TrabalhadorRepository instance;
    private TrabalhadorDAO trabalhadorDAO;
    private List<Trabalhador> trabalhadores;

    private TrabalhadorRepository() {
        trabalhadorDAO = new TrabalhadorDAO();
        trabalhadorDAO.inicializarArquivo();
        carregarDados();
    }

    public static TrabalhadorRepository getInstance() {
        if (instance == null) {
            instance = new TrabalhadorRepository();
        }

        return instance;
    }

    public void carregarDados() {
        trabalhadores = trabalhadorDAO.carregarTodos();
    }

    public void adicionarOuAtualizar(Trabalhador trabalhador) {
        Trabalhador existente = buscarPorCPF(trabalhador.getCpf());
        if (existente != null) {
            trabalhadores.remove(existente);
        }

        trabalhadores.add(trabalhador);
        trabalhadorDAO.salvarTodos(trabalhadores);
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
