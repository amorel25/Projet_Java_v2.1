package State;

public class EndGameState implements GameState {
    @Override
    public void startGame() {
        return;
    }

    @Override
    public void BlackPlayerTurn() {
        return;
    }

    @Override
    public void WhitePlayerTurn() {
        return;
    }

    @Override
    public void endGame() {
        System.out.println("end game");
    }

    @Override
    public void resetGame() {
        return;
    }
}
