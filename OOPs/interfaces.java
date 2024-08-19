package OOPs;

public class interfaces {
    public static void main(String[] args){
        Queen q= new Queen();
        q.moves();
    }
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
       System.out.println("left,right");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("straight");
    }
}