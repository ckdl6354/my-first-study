// 부모 클래스
class ParentNumber {
    int num;

    // [생성자] : 숫자를 받아서 저장함
    public ParentNumber(int num) {
        this.num = num;
    }
}

// 자식 클래스 (상속)
class ChildNumber extends ParentNumber {
    public ChildNumber(int num) {
        super(num); // 부모에게 숫자 전달
    }
}

public class LoopAndInherit {
    public static void main(String[] args) {
        
        // [반복문] : 1부터 5까지 숫자를 넣어서 객체를 만듦
        for (int i = 1; i <= 5; i++) {
            ChildNumber c = new ChildNumber(i);
            System.out.println("상속받은 숫자: " + c.num);
        }
        
    }
}
