package boardgame;

public class Piece {
	protected Position position;
	private Board board;
	
	
	public Piece(Board board) {
		super();
		
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}


	public boolean possibleMoves() {
		return true;
	}
	
	public boolean possibleMove(Position position) {
		
		return true;
	}
	
	public boolean isTherePossibleMove() {
		return true;
	}
	
	
	
	
	

}
