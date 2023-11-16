package hw2;

public class GameTest {
	public static void main(String args[]) {

	
//	CyGame game = new CyGame(38, 200);
//	System.out.println(game.getSquareType(0));
//	System.out.println(game.getSquareType(1));
//	System.out.println(game.getSquareType(2));
//	System.out.println(game.getSquareType(3));
//	System.out.println(game.getSquareType(4));
//	System.out.println(game.getSquareType(5));
//	System.out.println(game.getSquareType(6));
//	System.out.println(game.getSquareType(7));
//	System.out.println(game.getSquareType(8));
//	System.out.println(game.getSquareType(9));
//	System.out.println(game.getSquareType(10));
//	System.out.println(game.getSquareType(11));
//	System.out.println(game.getSquareType(12));
//	System.out.println(game.getSquareType(13));
//	System.out.println(game.getSquareType(14));
//	System.out.println(game.getSquareType(15));
//	System.out.println(game.getSquareType(16));
//	System.out.println(game.getSquareType(17));
//	System.out.println(game.getSquareType(18));
//	System.out.println(game.getSquareType(19));
//	System.out.println(game.getSquareType(20));
//	System.out.println(game.getSquareType(21));
//	System.out.println(game.getSquareType(22));
//	System.out.println(game.getSquareType(23));
//	System.out.println(game.getSquareType(24));
//	System.out.println(game.getSquareType(25));
//	System.out.println(game.getSquareType(26));
//	System.out.println(game.getSquareType(27));
//	System.out.println(game.getSquareType(28));
//	System.out.println(game.getSquareType(29));
//	System.out.println(game.getSquareType(30));
//	System.out.println(game.getSquareType(31));
//	System.out.println(game.getSquareType(32));
//	System.out.println(game.getSquareType(33));
//	System.out.println(game.getSquareType(34));
//	System.out.println(game.getSquareType(35));
//	System.out.println(game.getSquareType(36));
//	System.out.println(game.getSquareType(37));
//	
//	
////	
//	CyGame game = new CyGame (16, 200);
//	System.out.println(game);
//	game.endTurn();
//	System.out.println(game);
//	game.endTurn();
//	System.out.println(game);
	
	
	
//	CyGame game = new CyGame(16, 200);
//	System.out.println(game);
//	// Player 1 to JUMP_FORWARD square
//	game.roll(2);
//	System.out.println("Expect Player 1 on sqaure 2 + 4 = 6.");
//	System.out.println(game);
//	// Player 2 to PAY_PLAYER square
//	game.roll(5);
//	System.out.println("Expect Player 1 money 220.");
//	System.out.println("Expect Player 2 money 180.");
//	System.out.println(game);
//	// Player 1 is now on STUCK, roll an odd value
//	game.roll(5);
//	System.out.println("Expect Player 1 on sqaure 6 (not)moved).");
//	System.out.println(game);
//	// Player 2 to EXTRA_TURN
//	game.roll(2);
//	System.out.println("Expect Player 2 is still currentplayer.");
//	System.out.println(game);
//	game.roll(6);
//	System.out.println("Expect Player 1 is now currentplayer.");
//	System.out.println(game);
//	// Player 1 passes turn
//	game.endTurn();
//	System.out.println("Expect Player 1 has not changed.");
//	System.out.println(game);
//	// Player 2 buys property unit
//	game.buyUnit();
//	System.out.println("Expect Player 2 has 2 units and it is now Player 1's turn.");
//	System.out.println(game);
//	// Player 1 passes turn and Player 2 to CYCLONE
//	game.endTurn();
//	game.roll(2);
//	System.out.println("Expect Player 2 is in same location as Player 1.");
//	System.out.println(game);
//	// Player 1 passing though PASS_GO
//	game.roll(2);
//	System.out.println(game);
//	game.roll(2);
//	System.out.println(game);
//	game.roll(6);
//	System.out.println(game);
//	System.out.println("Expect Player 1 has $420");
//	System.out.println(game);
//	// Player 1 has over $400, the game is over
//	System.out.println("Expect game over.");
//	System.out.println("Is game ended: " + game.isGameEnded());
//	
	CyGame game2 = new CyGame(16, 200);
	System.out.println(game2);
	game2.roll(2);
	System.out.println("Player 1 on tile 6");
	System.out.println(game2);
	
	game2.roll(1);
	System.out.println("player 1 should be on DO_NOTHING");
	System.out.println(game2);
	
	game2.roll(1);
	System.out.println("player 2 should be on 6 cuz still stuck");
	System.out.println(game2);
	
	game2.buyUnit();
	
	System.out.println("player 2 should be have 2 units");
	System.out.println(game2);
	
	game2.roll(5);
	
	System.out.println("player 1 should be on PAY_PLAYER");
	System.out.println(game2);
	
	
//	CyGame game = new CyGame(5, 200);
//	System.out.println(game);
//	// Player 1 to JUMP_FORWARD square
//	game.endTurn();
//	game.roll(5);
//	System.out.println("Expect Player 1 gets prize.");
//	System.out.println(game);
	
//	CyGame game2 = new CyGame(16, 200);
//	System.out.println(game2);
//	
	
	
	
	
	}

}

