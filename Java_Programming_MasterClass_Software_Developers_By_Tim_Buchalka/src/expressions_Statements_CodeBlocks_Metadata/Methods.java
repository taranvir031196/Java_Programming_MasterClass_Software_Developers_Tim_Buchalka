package expressions_Statements_CodeBlocks_Metadata;

public final class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean gameover = true;
		int score = 800;
		int levelcomplete = 70;
		int bonus = 90;
		
		int highscore=CaluclateScore(gameover, score, levelcomplete, bonus);
		System.out.println("The final score is:"+ highscore);
		
		score = 600;
		levelcomplete = 600;
		bonus = 10;
		
		highscore=CaluclateScore(gameover, score, levelcomplete, bonus);
		System.out.println("The final score is:"+ highscore);
		
		int highscorepostion = high_score_position(highscore);
		print_highscore_positions("Tim", highscorepostion);
	}
	
	public static void print_highscore_positions(String playername, int position) {
 		System.out.println("The Highscore position for the "+playername+" is "+position);
	}
	
	public static int high_score_position(int playerscore) {
		if(playerscore >=1000) {
			return 1;
		}else if(playerscore>=500) {
			return 2;
		}else if(playerscore>=200) {
			return 3;
		}else
			return 4;
	}
		
	public static int CaluclateScore(boolean gameover, int score, int levelcomplete, int bonus) {
		int finalscore = 0;
		if(gameover == true) {
			finalscore = score + (levelcomplete + bonus);
			finalscore = finalscore + 2000;
		return finalscore;
		}
		
		return -1;
	}
}
