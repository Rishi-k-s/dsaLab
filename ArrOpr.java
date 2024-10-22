
class LoserBoard{
    class Loser{
        int score;
        String name;
    
        public Loser(int score, String name){
            this.name = name;
            this.score = score;
        }
    
        public int getScore(){
            return score;
        }
    
        public String getName(){
            return name;
        }
    
        public String getLoser(){
            return "("+name+", "+score+")";
        }
    }
    
    private int numOfLosers = 0;
    private Loser[] listLoser;

    public LoserBoard(int maxNoOfLosers){
        listLoser = new Loser[maxNoOfLosers]; 
    }
}

public class ArrOpr {
    public static void main(String[] args) {
        if(0<0){
            System.out.println("df");
        }
    }
}
