public class Lasagna {

    public static final int TEMPO_PREPARO_FORNO=40;
    public static final int TEMPO_PREPARO_CAMADA=2;
    

        public int expectedMinutesInOven(){
            return TEMPO_PREPARO_FORNO;
        }
  
         public int remainingMinutesInOven(int tempo){
             return expectedMinutesInOven()-tempo;
         }
   
     public int preparationTimeInMinutes(int numCamadas){
         return numCamadas*TEMPO_PREPARO_CAMADA;
     }

  
    public int totalTimeInMinutes(int numCamadas, int tempoForno){
        return preparationTimeInMinutes(numCamadas)+tempoForno;
    }
}
