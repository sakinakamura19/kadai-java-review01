package baseball;

public class Review03 {

	public static void main(String[] args) {
		BaseBallTeam team1 = new BaseBallTeam();
		team1.setName("東京ヤクルトスワローズ");
		team1.setWin(80);
		team1.setLose(59);
		team1.setDraw(4);
		team1.report();

		BaseBallTeam team2 = new BaseBallTeam();
		team2.setName("横浜DeNAベイスターズ");
		team2.setWin(73);
		team2.setLose(68);
		team2.setDraw(2);
		team2.report();

		BaseBallTeam team3 = new BaseBallTeam();
		team3.setName("阪神タイガース");
		team3.setWin(68);
		team3.setLose(71);
		team3.setDraw(4);
		team3.report();

		BaseBallTeam team4 = new BaseBallTeam();
		team4.setName("読売ジャイアンツ");
		team4.setWin(68);
		team4.setLose(72);
		team4.setDraw(3);
		team4.report();

		BaseBallTeam team5 = new BaseBallTeam();
		team5.setName("広島東洋カープ");
		team5.setWin(66);
		team5.setLose(74);
		team5.setDraw(3);
		team5.report();

		BaseBallTeam team6 = new BaseBallTeam();
		team6.setName("中日ドラゴンズ");
		team6.setWin(66);
		team6.setLose(75);
		team6.setDraw(2);
		team6.report();

	}

}
