package expressions_Statements_CodeBlocks_Metadata;

public final class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean gameover = true;
		int score = 800;
		int levelcomplete = 70;
		int bonus = 90;
		
		CaluclateScore(gameover, score, levelcomplete, bonus);
		
		score = 600;
		levelcomplete = 600;
		bonus = 10;
		
		CaluclateScore(gameover, score, levelcomplete, bonus);
	}
	
	public static void CaluclateScore(boolean gameover, int score, int levelcomplete, int bonus) {
		
		if(gameover == true) {
			int finalscore = score + (levelcomplete + bonus);
			finalscore = finalscore + 2000;
			System.out.println("The final score is "+ finalscore);
		}
	}

}
