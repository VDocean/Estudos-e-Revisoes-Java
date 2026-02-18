public class Lasagna {

    public static final int TEMPO_PREPARO_FORNO=40;
    public static final int TEMPO_PREPARO_CAMADA=2;
    

        public int expectedMinutesInOven(){
            return TEMPO_PREPARO_FORNO;
        }
    // TODO: define the 'remainingMinutesInOven()' method
         public int remainingMinutesInOven(int tempo){
             return TEMPO_PREPARO_FORNO-tempo;
         }
    // TODO: define the 'preparationTimeInMinutes()' method
     public int preparationTimeInMinutes(int numCamadas){
         return numCamadas*TEMPO_PREPARO_CAMADA;
     }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int numCamadas, int tempoForno){
        return (numCamadas*TEMPO_PREPARO_CAMADA)+tempoForno;
    }
}
