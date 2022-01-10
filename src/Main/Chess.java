package Main;
import java.util.*;

public class Chess{
	public static void main(String[] args){
		
		HashMap<String, String> pieces = new HashMap<String, String>();
		pieces.put("a1", "wR"); pieces.put("b1", "wN"); pieces.put("c1", "wB"); pieces.put("d1", "wQ"); pieces.put("e1", "wK"); pieces.put("f1", "wB"); pieces.put("g1", "wN"); pieces.put("h1", "wR");
		pieces.put("a2", "wp"); pieces.put("b2", "wp"); pieces.put("c2", "wp"); pieces.put("d2", "wp"); pieces.put("e2", "wp"); pieces.put("f2", "wp"); pieces.put("g2", "wp"); pieces.put("h2", "wp");
		pieces.put("a3", "--"); pieces.put("b3", "--"); pieces.put("c3", "--"); pieces.put("d3", "--"); pieces.put("e3", "--"); pieces.put("f3", "--"); pieces.put("g3", "--"); pieces.put("h3", "--");
		pieces.put("a4", "--"); pieces.put("b4", "--"); pieces.put("c4", "--"); pieces.put("d4", "--"); pieces.put("e4", "--"); pieces.put("f4", "--"); pieces.put("g4", "--"); pieces.put("h4", "--");
		pieces.put("a5", "--"); pieces.put("b5", "--"); pieces.put("c5", "--"); pieces.put("d5", "--"); pieces.put("e5", "--"); pieces.put("f5", "--"); pieces.put("g5", "--"); pieces.put("h5", "--");
		pieces.put("a6", "--"); pieces.put("b6", "--"); pieces.put("c6", "--"); pieces.put("d6", "--"); pieces.put("e6", "--"); pieces.put("f6", "--"); pieces.put("g6", "--"); pieces.put("h6", "--");
		pieces.put("a7", "bp"); pieces.put("b7", "bp"); pieces.put("c7", "bp"); pieces.put("d7", "bp"); pieces.put("e7", "bp"); pieces.put("f7", "bp"); pieces.put("g7", "bp"); pieces.put("h7", "bp");
		pieces.put("a8", "bR"); pieces.put("b8", "bN"); pieces.put("c8", "bB"); pieces.put("d8", "bQ"); pieces.put("e8", "bK"); pieces.put("f8", "bB"); pieces.put("g8", "bN"); pieces.put("h8", "bR");
	
		
		System.out.println("Welcome to 2 player Terminal Chess!");
		System.out.println("Play your moves by using chess board coordinates");
		System.out.println("Ex: e2e4 (e2 to e4)");
		System.out.println("To end the game, press \"q\" then enter\n");

		
		int t = 0;
		
		Scanner sc = new Scanner(System.in);
		String move = "";
		String quit = "q";
		while(!move.equalsIgnoreCase(quit)){
		
			move(move,pieces);
			board(pieces, t);
			System.out.print(turn(t)+" to move: ");
			move = sc.nextLine();
			String old = move.substring(0, (move.length()/2));
			String now = move.substring((move.length()/2));
			if(move == quit){
				break;
			}
			else if(!pieces.containsKey(old) && !pieces.containsKey(now) || move == ""){
				System.out.println("Invalid move. Please Try again.");
			}
			else{
				t++;
			}
		}
		
		sc.close();
		System.out.println("Game Ended.\nThanks for playing!");
	}
		
		
	public static void board(HashMap<String, String> pieces, int t){
		
		if(t%2 == 0){
		System.out.println("-------------------------" + "\n" + 
			     "|" + pieces.get("a8") + " " + pieces.get("b8") + " " + pieces.get("c8") + " " + pieces.get("d8") + " " + pieces.get("e8") + " " + pieces.get("f8") + " " + pieces.get("g8") + " " + pieces.get("h8") + "|" + ("\n") +
			     "|" + pieces.get("a7") + " " + pieces.get("b7") + " " + pieces.get("c7") + " " + pieces.get("d7") + " " + pieces.get("e7") + " " + pieces.get("f7") + " " + pieces.get("g7") + " " + pieces.get("h7") + "|" + ("\n") +
			     "|" + pieces.get("a6") + " " + pieces.get("b6") + " " + pieces.get("c6") + " " + pieces.get("d6") + " " + pieces.get("e6") + " " + pieces.get("f6") + " " + pieces.get("g6") + " " + pieces.get("h6") + "|" + ("\n") +
			     "|" + pieces.get("a5") + " " + pieces.get("b5") + " " + pieces.get("c5") + " " + pieces.get("d5") + " " + pieces.get("e5") + " " + pieces.get("f5") + " " + pieces.get("g5") + " " + pieces.get("h5") + "|" +("\n") +
			     "|" + pieces.get("a4") + " " + pieces.get("b4") + " " + pieces.get("c4") + " " + pieces.get("d4") + " " + pieces.get("e4") + " " + pieces.get("f4") + " " + pieces.get("g4") + " " + pieces.get("h4") + "|" + ("\n") +
			     "|" + pieces.get("a3") + " " + pieces.get("b3") + " " + pieces.get("c3") + " " + pieces.get("d3") + " " + pieces.get("e3") + " " + pieces.get("f3") + " " + pieces.get("g3") + " " + pieces.get("h3") + "|" + ("\n") +
			     "|" + pieces.get("a2") + " " + pieces.get("b2") + " " + pieces.get("c2") + " " + pieces.get("d2") + " " + pieces.get("e2") + " " + pieces.get("f2") + " " + pieces.get("g2") + " " + pieces.get("h2") + "|" + ("\n") +
			     "|" + pieces.get("a1") + " " + pieces.get("b1") + " " + pieces.get("c1") + " " + pieces.get("d1") + " " + pieces.get("e1") + " " + pieces.get("f1") + " " + pieces.get("g1") + " " + pieces.get("h1") + "|" + "\n" +
			   "-------------------------");	
		}
		else{
			System.out.println("-------------------------" + "\n" + 
				     "|" + pieces.get("h1") + " " + pieces.get("g1") + " " + pieces.get("f1") + " " + pieces.get("e1") + " " + pieces.get("d1") + " " + pieces.get("c1") + " " + pieces.get("b1") + " " + pieces.get("a1") + "|" + ("\n") +
				     "|" + pieces.get("h2") + " " + pieces.get("g2") + " " + pieces.get("f2") + " " + pieces.get("e2") + " " + pieces.get("d2") + " " + pieces.get("c2") + " " + pieces.get("b2") + " " + pieces.get("a2") + "|" + ("\n") +
				     "|" + pieces.get("h3") + " " + pieces.get("g3") + " " + pieces.get("f3") + " " + pieces.get("e3") + " " + pieces.get("d3") + " " + pieces.get("c3") + " " + pieces.get("b3") + " " + pieces.get("a3") + "|" + ("\n") +
				     "|" + pieces.get("h4") + " " + pieces.get("g4") + " " + pieces.get("f4") + " " + pieces.get("e4") + " " + pieces.get("d4") + " " + pieces.get("c4") + " " + pieces.get("b4") + " " + pieces.get("a4") + "|" +("\n") +
				     "|" + pieces.get("h5") + " " + pieces.get("g5") + " " + pieces.get("f5") + " " + pieces.get("e5") + " " + pieces.get("d5") + " " + pieces.get("c5") + " " + pieces.get("b5") + " " + pieces.get("a5") + "|" + ("\n") +
				     "|" + pieces.get("h6") + " " + pieces.get("g6") + " " + pieces.get("f6") + " " + pieces.get("e6") + " " + pieces.get("d6") + " " + pieces.get("c6") + " " + pieces.get("b6") + " " + pieces.get("a6") + "|" + ("\n") +
				     "|" + pieces.get("h7") + " " + pieces.get("g7") + " " + pieces.get("f7") + " " + pieces.get("e7") + " " + pieces.get("d7") + " " + pieces.get("c7") + " " + pieces.get("b7") + " " + pieces.get("a7") + "|" + ("\n") +
				     "|" + pieces.get("h8") + " " + pieces.get("g8") + " " + pieces.get("f8") + " " + pieces.get("e8") + " " + pieces.get("d8") + " " + pieces.get("c8") + " " + pieces.get("b8") + " " + pieces.get("a8") + "|" + "\n" +
				   "-------------------------");	
		}
	}
	
	public static void move(String move, HashMap<String, String> pieces){
		
		String old = move.substring(0, (move.length()/2));
		String now = move.substring((move.length()/2));
	
			pieces.replace(now, pieces.get(old));
			pieces.replace(old,"--");
//			board(pieces, t);
	}
	
	
	public static String turn(int t){
		String player;
		if(t%2==0){
			player = "White";
		}
		else{
			player = "Black";
		}
		return player;
	}
	
	}

