package practice.oop1;

public class ValueObject {

    int value; //멤버 변수

    void add() { //메소드
        value++;
        System.out.println("숫자 증가 value=" + value);
    }
}
