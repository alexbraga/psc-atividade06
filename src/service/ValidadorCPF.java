package service;

public class ValidadorCPF {
    public static boolean validarCPF(String cpf) {
        String cpfSanitizado = cpf.replaceAll("[^0-9]", "");

        if (cpfSanitizado.length() != 11) {
            return false;
        }

        // Cálculo do primeiro dígito verificador
        int soma = 0;

        for (int i = 0; i < 9; i++) {
            soma += Character.getNumericValue(cpfSanitizado.charAt(i)) * (10 - i);
        }

        int primeiroDigito = 11 - (soma % 11);

        if (primeiroDigito > 9) {
            primeiroDigito = 0;
        }

        // Cálculo do segundo dígito verificador
        soma = 0;

        for (int i = 0; i < 10; i++) {
            if (i < 9) {
                soma += Character.getNumericValue(cpfSanitizado.charAt(i)) * (11 - i);
            } else {
                soma += primeiroDigito * (11 - i);
            }
        }

        int segundoDigito = 11 - (soma % 11);

        if (segundoDigito > 9) {
            segundoDigito = 0;
        }

        String cpfCalculado = cpfSanitizado.substring(0, 9) + Integer.toString(primeiroDigito) + Integer.toString(segundoDigito);

        return cpfSanitizado.equals(cpfCalculado);
    }
}