package creepershift.journalparser.mods.data;

/**
 * EliteCompanion
 * Created by Max on 2/24/2017.
 */
public class EngineerTier {


    private String[][] engineerTiers;

    public EngineerTier(int length){

        engineerTiers = new String[length][];

    }



    public void addTiers(String tiers, String[] engineers){

        assignTiers(splitString(tiers), engineers);
    }

    public void addTiers(String tiers, String engineer){

        assignTiers(splitString(tiers), new String[]{engineer});
    }


    private int[] splitString(String s) {

        if(!s.isEmpty()) {

            String[] data = s.split(">");

            if(data.length >1) {

                return new int[]{Integer.parseInt(data[0]),Integer.parseInt(data[1])};

            }
        }
        return null;
    }


    private void assignTiers(int[] tiers, String[] engineers){

        if (tiers.length == 2){

            if (tiers[0] == tiers[1]){
                engineerTiers[tiers[0]-1] = engineers;
            }else{

                for(int i = tiers[0]-1; i < tiers[1]; i++){

                    engineerTiers[i] = engineers;
                }

            }


        }


    }


}
