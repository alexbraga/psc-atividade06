package service;

import com.google.gson.Gson;
import model.Endereco;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCEP {
    private static final String URL_VIACEP = "https://viacep.com.br/ws/%s/json/";

    public static Endereco buscar(String cep) throws URISyntaxException {
        String cepSanitizado = cep.replaceAll("[^0-9]", "");

        HttpRequest requisicao = null;
        HttpResponse<String> resposta = null;
        String urlString = String.format(URL_VIACEP, cepSanitizado);

        try {
            requisicao = HttpRequest.newBuilder()
                                    .uri(new URI(urlString))
                                    .GET()
                                    .build();

            resposta = HttpClient.newHttpClient().send(requisicao, HttpResponse.BodyHandlers.ofString());

            if (resposta.statusCode() != 200) {
                throw new RuntimeException("HTTP error code : " + resposta.statusCode());
            }
        } catch (URISyntaxException | IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        Gson gson = new Gson();
        return gson.fromJson(resposta.body(), Endereco.class);
    }
}
