package service;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCEP {
    private static final String URL_VIACEP = "https://viacep.com.br/ws/%s/json/";

    public static String consultar(String cep) throws URISyntaxException {
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
        } catch (URISyntaxException | IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        return resposta.body();
    }
}
