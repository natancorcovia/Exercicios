package JAVA.API.Ex01;

public class ValidaParametrosAPI {

public static String validarParametros(String url) {
    if (!url.startsWith("?")) {
        return "Parametros invalidos";
    }

    url = url.substring(1);

    String[] parametros = url.split("&");

    for (String parametro : parametros) {
        // TODO: Verifique cada parametro individualmente:

        // TODO: Divida cada parametro pelo '=':
        if (parametro.indexOf('=') == -1 || parametro.indexOf('=') != parametro.lastIndexOf('=')) {
            return "Parametros invalidos";
        }

        String[] chaveValor = parametro.split("=", 2);

        // TODO: Verifica se há exatamente um '=':
        if (chaveValor.length != 2) {
            return "Parametros invalidos";
        }

        // TODO: Valideo nome do parametro (alfanumerico):
        if (!chaveValor[0].matches("^[a-zA-Z0-9]+$")) {
            return "Parametros invalidos";
        }

        if (!chaveValor[1].matches("^[a-zA-Z0-9@.]+$") && !chaveValor[1].matches("^\\d+$")) {
            return "Parametros invalidos";
        }
    }

    return "Parametros validos";
}
}