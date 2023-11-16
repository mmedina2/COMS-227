package hw2;
/**
 * Model of a Monopoly-like game. Two players take turns rolling dice to move
 * around a board. The game ends when one of the players has at least
 * MONEY_TO_WIN money or one of the players goes bankrupt (has negative money).
 * 
 * @author YOUR_NAME_HERE
 */
public class CyGame {

/** 
 * instanc3 variables 
 */
	
	private int numOfSquares = 0;
	private int currentPlayer = 0;
	private int player1Square = 0;
	private int player1Money = 0;
	private int player1Units = 0;
	private int player2Square = 0;
	private int player2Money = 0;
	private int player2Units = 0;
	private boolean is1Stuck = false;
	private boolean is2Stuck = false;
	private boolean isGameEnded = false;
	private boolean rollAgain = false;
	private boolean doNothing1 = false;
	private boolean doNothing2 = false;
/**
 * Do nothing square type.
 */	
	public static final int DO_NOTHING = 0;
/**
 * Pass go square type.
 */
	public static final int PASS_GO = 1;
/**
 * Cyclone square type.
 */
	public static final int CYCLONE = 2;
/**
 * Pay the other player square type.
 */
	public static final int PAY_PLAYER = 3;
/**
 * Get an extra turn square type.
 */
	public static final int EXTRA_TURN = 4;
/**
 * Jump forward square type.
 */
	public static final int JUMP_FORWARD = 5;
/**
 * Stuck square type.
 */
	public static final int STUCK = 6;
/**
 * Points awarded when landing on or passing over go.
 */
	public static final int PASS_GO_PRIZE = 200;
/**
 * The amount payed to the other player per unit when landing on a
 * PAY_PLAYER square.
 */
	public static final int PAYMENT_PER_UNIT = 20;
/**
 * The amount of money required to win.
 */
	public static final int MONEY_TO_WIN = 400;
/**
 * The cost of one unit.
 */
	public static final int UNIT_COST = 50;
// TODO: EVERTHING ELSE
// Note that this code will not compile until you have put in stubs for all
// the required methods.
// The method below is provided for you and you should not modify it.
// The compile errors will go away after you have written stubs for the
// rest of the API methods.

	/**\
	 * Constructs a game that has the given number of squares and starts both players on square 0.
	 * @param numSquares
	 * @param startingMoney
	 */
	public CyGame(int numSquares, int startingMoney) {
		numOfSquares = numSquares;
		player1Money = startingMoney;
		player2Money = startingMoney;
		currentPlayer = 1;
		player1Units = 1;
		player2Units = 1;
		
		
	}
	/** 
	 * Method called to indicate the current player attempts to buy one unit 
	 */
	public void buyUnit() {
		if (currentPlayer == 1 && getSquareType(player1Square) == DO_NOTHING && player1Money > UNIT_COST && isGameEnded() == false) {
			player1Money -= UNIT_COST;
			player1Units += 1;
			endTurn();
		}
		else if (currentPlayer == 2 && getSquareType(player2Square) == DO_NOTHING && player2Money > UNIT_COST && isGameEnded() == false) {
			player2Money -= UNIT_COST;
			player2Units += 1;
			endTurn();
		}
	}
	
	/**
	 * Method called to indicate the current player passes or completes their turn 
	 */
	public void endTurn() {
		if (rollAgain == false && isGameEnded() == false) {
			if (currentPlayer == 1) {
				currentPlayer = 2;
			}
			else
				currentPlayer = 1;
			
		}
	}
	
	/**
	 * Get the current player 
	 * @return the current player 
	 */
	public int getCurrentPlayer() {
		return currentPlayer;
	}
	
	/**
	 * Get Player 1's money.
	 * @return player1money
	 */
	public int getPlayer1Money() {
		return player1Money;
	}
	
	/**
	 * Get Player 1's square.
	 * @return player1square
	 */
	public int getPlayer1Square() {
		return player1Square;
	}
	
	/**
	 * Get Player 1's units.
	 * @return player1units
	 */
	public int getPlayer1Units() {
		return player1Units;
	}

	/**
	 * Get Player 2's money.
	 * @return player2Money
	 */
	public int getPlayer2Money() {
		return player2Money;
	}
	
	/**
	 * Get Player 2's square.
	 * @return player2square
	 */
	public int getPlayer2Square() {
		return player2Square;
	}
	
	/**
	 * Get Player 2's units.
	 * @return player2money
	 */
	public int getPlayer2Units() {
		return player2Units;
	}
	
	/**
	 * 	Get the type of square for the given square number
	 * @param square
	 * @return square type
	 */
	public int getSquareType(int square) {
		
		int typeSquare = DO_NOTHING;
		if (square % 2 == 0) {
			typeSquare = JUMP_FORWARD;
		}
		if (square % 3 == 0) {
			typeSquare = STUCK;
		}
		if (square % 7 == 0) {
			typeSquare = EXTRA_TURN;
		}
		if (square % 5 == 0) {
			typeSquare = PAY_PLAYER;
		}
		if (square % 11 == 0) {
			typeSquare = EXTRA_TURN;
		}
		if (square == (numOfSquares -1)) {
			typeSquare = CYCLONE;
		}
		if (square == 0) {
			typeSquare = PASS_GO;
		}
		return typeSquare;
	}
	
	/**
	 * Returns true if game is over, false otherwise.
	 * @return boolean if game ended or not 
	 */
	public boolean isGameEnded() {
		if (player1Money >= MONEY_TO_WIN || player1Money < 0) {
			isGameEnded = true;
		}
		else if (player2Money >= MONEY_TO_WIN || player2Money < 0) {
			isGameEnded = true;
		}
		return isGameEnded;
	}
	
	/**
	 * Method called to indicate the dice has been rolled.
	 * @param value, the number rolled on the dice 1 - 6
	 */
	public void roll(int value) {
		if (currentPlayer == 1 && isGameEnded() == false){
			if (is1Stuck == true && value % 2 != 0) {
				endTurn();
			}
			if (is1Stuck == false || value % 2 == 0) {
				player1Square += value;	
				rollAgain = false;
					doNothing1 = false;
				if (player1Square >= numOfSquares) {
					player1Square -= numOfSquares;
					player1Money += PASS_GO_PRIZE;
					if (getSquareType(player2Square) == PASS_GO) {
					}
				}
				else if (getSquareType(player1Square) == PASS_GO) {
					player1Money += PASS_GO_PRIZE;
					endTurn();
				}
				else if (getSquareType(player1Square) == CYCLONE) {
					player1Square = player2Square;
					endTurn();
				}
					
				else if (getSquareType(player1Square) == PAY_PLAYER) {
					player1Money -= PAYMENT_PER_UNIT * player2Units;
					player2Money += PAYMENT_PER_UNIT * player2Units;
					endTurn();
						
				}
				else if (getSquareType(player1Square) == EXTRA_TURN) {
					rollAgain = true;
					endTurn();
				}
				else if (getSquareType(player1Square) == STUCK) {
					is1Stuck = true; 
					endTurn();
				}
				else if (getSquareType(player1Square) == JUMP_FORWARD) {
					player1Square += 4; 
					roll(0);
				}
				else if (getSquareType(player1Square) == DO_NOTHING) {
					endTurn();
				}
			}
		}
		else  {
			if (is2Stuck == true && value % 2 != 0) {
				endTurn();
			}
			if (is2Stuck == false || value % 2 == 0) {
				player2Square += value;	
				rollAgain = false;
				doNothing2 = false;
				if (player2Square >= numOfSquares) {
					player2Square -= numOfSquares;
					player2Money += PASS_GO_PRIZE;
					if (getSquareType(player2Square) == PASS_GO) {
					}
				}
				else if (getSquareType(player2Square) == PASS_GO) {
					player2Money += PASS_GO_PRIZE;
					endTurn();
				}
				else if (getSquareType(player2Square) == CYCLONE) {
					player2Square = player1Square;
					endTurn();
				}
				else if (getSquareType(player2Square) == PAY_PLAYER) {
					player2Money -= (PAYMENT_PER_UNIT * player1Units);
					player1Money += (PAYMENT_PER_UNIT * player1Units);
					endTurn();
				}
				else if (getSquareType(player2Square) == EXTRA_TURN) {
					rollAgain = true;
					endTurn();
					}
				else if (getSquareType(player2Square) == STUCK) {
					is2Stuck = true;
					endTurn();
				}
				else if (getSquareType(player2Square) == JUMP_FORWARD) {
					player2Square += 4; 
					roll(0);
				}
				else if (getSquareType(player2Square) == DO_NOTHING) {
					endTurn();
				}
				else if(is2Stuck == true) {
					endTurn();
				}
			}
		}
		
		//endTurn();	
	}
	
			
	
		

	
	/**
	 * Method called to indicate the current player attempts to sell one unit.
	 */
	public void sellUnit() {
		if(isGameEnded() == false) {
			if (currentPlayer == 1 && player1Units > 0 && isGameEnded() == false) {
				player1Money += UNIT_COST;
				player1Units -= 1;
				endTurn();
			}
			else if (currentPlayer == 2 && player2Units > 0 && isGameEnded() == false) {
				player2Money += UNIT_COST;
				player2Units -= 1;
				endTurn();
		}
	}	
	}
/**
 * Returns a one-line string representation of the current game state. The
 * format is:
 * <p>
 * <tt>Player 1*: (0, 0, $0) Player 2: (0, 0, $0)</tt>
 * <p>
 * The asterisks next to the player's name indicates which players turn it
 * is. The numbers (0, 0, $0) indicate which square the player is on, how
 * many units the player has, and how much money the player has
 * respectively.
 * 
 * @return one-line string representation of the game state
 */
	public String toString() {
			String fmt = "Player 1%s: (%d, %d, $%d) Player 2%s: (%d, %d, $%d)";
			String player1Turn = "";
			String player2Turn = "";
			if (getCurrentPlayer() == 1) {
				player1Turn = "*";
			} else {
				player2Turn = "*";
			}
			return String.format(fmt,
					player1Turn, getPlayer1Square(), getPlayer1Units(), 
					getPlayer1Money(),
					player2Turn, getPlayer2Square(), getPlayer2Units(), 
					getPlayer2Money());
	}
}