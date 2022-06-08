import java.io.IOException;

public class MecanicaEasy implements MecanicaDoJogo {

    private FabricaEmbaralhadores f = new FabricaEmbaralhadores();
    private BancoDePalavras b = new BancoDePalavras();
    private boolean acertou;
    private String palavraEscolhidaAleatoria = b.getPalavraAleatoria();
    private String PalavraEscolhidaEmbaralhada = f.getEmbaralhadorAleatorio().embaralhar(palavraEscolhidaAleatoria);


    public MecanicaEasy() throws IOException {
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
        if (tentativas == 5 || acertou )
        {
            return true;
        } else return false;


    }

    @Override
    public boolean temDica()
    {
        return true;
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
