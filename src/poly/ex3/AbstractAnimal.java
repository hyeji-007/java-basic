package poly.ex3;

public abstract class AbstractAnimal {

    public abstract void sound(); //자식이 오버라이딩 해야되는 목적

    public void move() { //자식이 기능을 상속받아 사용하는 목적
        System.out.println("동물이 움직입니다.");
    }
}
