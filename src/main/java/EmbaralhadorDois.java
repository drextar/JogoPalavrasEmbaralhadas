import java.util.ArrayList;

public class EmbaralhadorDois implements Embaralhador {

    @Override
    public String embaralhar(String palavra) {

        int tamanho = palavra.length();
        ArrayList<String> lista = new ArrayList<String>();

        for (int i= palavra.length(); i > 0; i--)
        {
            lista.add(palavra.substring(i-1, i));
        }

        String novaPalavra= palavra.substring(1, 1);

        for (int i=0; i<tamanho ; i++)
        {
            novaPalavra += lista.get(i);
        }
        return novaPalavra;
    }


    @Override
    public String toString() {
        return "Embaralhador Dois";
    }

}
