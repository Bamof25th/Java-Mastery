package oops;

public class interF {
    public static void main(String[] args) {
            Queen q = new Queen();

            q.moves();
    }
}

/**
 * ChessPlayer
 */
interface ChessPlayer {

    void moves();

}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("Up, down , left , right , diagonal (in all directions)");
    }
}

class pawn implements ChessPlayer {
    public void moves() {
        System.out.println("Up, down , left , right");
    }
}

class king implements ChessPlayer {
    public void moves() {
        System.out.println("Up, down , left , right only one step");
    }
}
