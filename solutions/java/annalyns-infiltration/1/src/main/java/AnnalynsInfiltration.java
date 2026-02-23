class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        if(knightIsAwake == true){
            return false;
        }else{
            return true;
        }
         
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        
        if( knightIsAwake==true || prisonerIsAwake==true ||  archerIsAwake==true){
            return true;
        }else{
            return false;
        }
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
       
        if(archerIsAwake==false && prisonerIsAwake==true){
             return true;
        }else{
            return false;
        }
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        
        if(!archerIsAwake && petDogIsPresent){
            return true;
        }else if(knightIsAwake==false && archerIsAwake==false && prisonerIsAwake==true && petDogIsPresent==false){
            return true;    
        }else{
            return false;
        }
    }
}
