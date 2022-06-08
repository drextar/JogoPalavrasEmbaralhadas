import java.io.IOException;

public class MecanicaHard implements MecanicaDoJogo {

    private FabricaEmbaralhadores f = new FabricaEmbaralhadores();
    private BancoDePalavras b = new BancoDePalavras();
    private boolean acertou;
    private String palavraEscolhidaAleatoria = b.getPalavraAleatoria();
    private String PalavraEscolhidaEmbaralhada = f.getEmbaralhadorAleatorio().embaralhar(palavraEscolhidaAleatoria);

    public MecanicaHard() throws IOException {
    }

    @Override
    public boolean testaPalavra(String tentativa) throws IOException
    {
        if (tentativa.equals(getPalavraEscolhida()))
        {
            acertou = true;
            return true;
        }else
        {
            acertou = false;
            return false;
        }
    }

    @Override
    public boolean jogoTerminou (int tentativas)
    {
        if (tentativas == 3 || acertou )
        {
            return true;
        } else return false;


    }
    @Override
    public boolean temDica()
    {
        return false;
    }

    @Override
    public String getPalavraEscolhida() throws IOException
    {
        return palavraEscolhidaAleatoria;
    }

    public String getPalavraEscolhidaEmbaralhada() throws IOException
    {
        return PalavraEscolhidaEmbaralhada;
    }

}
