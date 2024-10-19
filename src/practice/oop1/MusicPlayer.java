package practice.oop1;

public class MusicPlayer {
    /*
    MusicPlayer 클래스에 속성(데이터,멤버변수)+ 기능(메서드)을 모두 정의함
    음악 플레이어를 사용하는데 필요한 모둔 속성과 기능이 하나의 클래스에
    포함되어 있디.
     */

    int volume = 0;
    boolean isOn = false;

    void on() {
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
    }

    void off() {
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다");
    }

    void volumeUp() {
        volume++;
        System.out.println("음악 플레이어 볼륨:" + volume);
    }

    void volumeDown() {
        volume--;
        System.out.println("음악 플레이어 볼륨:" + volume);
    }

    void showStatus() {
        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어 ON, 볼륨:" + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }

}
