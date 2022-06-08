public class FabricaEmbaralhadores {

    public Embaralhador getEmbaralhadorAleatorio()
    {
        int random = (int) (Math.random()*2);
        if (random ==0)
        {
            return  new EmbaralhadorUm();
        } else
        {
            return new EmbaralhadorDois();
        }
    }

}
