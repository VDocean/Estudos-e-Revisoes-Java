public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
        public int expectedMinutesInOven(){
            return 40;
        }
    // TODO: define the 'remainingMinutesInOven()' method
         public int remainingMinutesInOven(int tempo){
             return 40-tempo;
         }
    // TODO: define the 'preparationTimeInMinutes()' method
     public int preparationTimeInMinutes(int numCamadas){
         return numCamadas*2;
     }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int numCamadas, int tempoForno){
        return (numCamadas*2)+tempoForno;
    }
}
