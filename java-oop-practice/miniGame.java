class Warrior { // 모양과 기능을 가진 설계도 (변수)
	String name;
	int hp;
	int attackPower;
	int MagePower;

	public void attack() { // 행동을 지정(메서드)
		System.out.println(name + "이 (가) " + attackPower + "의 데미지로 공격합니다!");
	}

	void MagePower() {
		System.out.println(name + "이 (가) " + MagePower + "의 데미지로 공격합니다!");
	}
}
	public class miniGame {

		public static void main(String[] args) {
			Warrior w1 = new Warrior(); // 실제로 만들어진 진짜물건
			w1.name = "전사";
			w1.hp = 200;
			w1.attackPower = 30;

			Warrior w2 = new Warrior();
			w2.name = "용기사";
			w2.hp = 300;
			w2.attackPower = 60;

			Warrior w3 = new Warrior();
			w3.name = "대마법사";
			w3.hp = 250;
			w3.MagePower = 60;

			w1.attack();
			w2.attack();
			w3.MagePower();

		}
	}
