import java.io.IOException;

public class FabricaMecanicaDoJogo {

    public MecanicaDoJogo getMecanicaEasy () throws IOException
    {
        return new MecanicaEasy();
    }

    public MecanicaDoJogo getMecanicaHard () throws IOException
    {
        return new MecanicaHard();
    }

}
