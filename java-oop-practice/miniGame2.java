import java.util.Scanner;

class Hero { // 모양과 기능을 가진 설계도 (변수)
	String name;
	int hp;
	int attackPower;

	public Hero(String name, int hp, int attackPower) {
		this.name = name;
		this.hp = hp;
		this.attackPower = attackPower;
	}

	public void attack(Monster target) {
		System.out.println(this.name + "이(가)" + target.name + "을 공격합니다! (데미지:" + this.attackPower + ")");
		target.hp -= this.attackPower;
        int chance = (int) (Math.random() * 10);
		if (chance < 3) {
			int criticalDamage = this.attackPower * 2;
			target.hp -= criticalDamage;
			System.out.println("크리티컬 히트!! :" + criticalDamage);
		} else {
			target.hp -= this.attackPower;
		}
	}
}

	class Monster {
		String name;
		int hp;
		int attackPower;

		public Monster(String name, int hp, int attackPower) {
			this.name = name;
			this.hp = hp;
			this.attackPower = attackPower;
		}

		public void attack(Hero target) {
			System.out.println(this.name + "이(가)" + target.name + "을 반격합니다! (데미지:" + this.attackPower + ")");
			target.hp -= this.attackPower;
		}

	}

	public class miniGame2 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			Hero myHero = new Hero("마검사", 120, 35);
			Monster boss = new Monster("대왕지네", 200, 20);

			while (myHero.hp > 0 && boss.hp > 0) {
				System.out.println("사냥 : 1 정비 : 2");
				int num = sc.nextInt();
				sc.nextLine();
				if(num == 1){
					System.out.println("몬스터를 발견했습니다!);
				}
				if(num==2) {
				System.out.println("체력(20)이 회복되었습니다.");
				myHero.hp+= 20;
				System.out.println(myHero.name+"의 체력: "+myHero.hp);
				continue;
			}
				myHero.attack(boss);
				if (boss.hp <= 0) {
					System.out.println(boss.name + "를 물리쳤습니다.");
					break;
				}
				System.out.println(boss.name + "의 남은 체력: " + boss.hp);

				boss.attack(myHero);
				if (myHero.hp <= 0) {
					System.out.println(myHero.name + "이(가) 쓰러졌습니다. 게임 오버");
					break;

				}
			    System.out.println(myHero.name+"의 남은 체력: "+myHero.hp);

			}
		}
	}
