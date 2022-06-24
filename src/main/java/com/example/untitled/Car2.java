package com.example.untitled;

// 문제 : 각각의 자동차가 서로 다른 최고속력으로 달리게 해주세요.

public class Car2 {
    public static void main(String[] args) {

        // 구현시작
        SpeedCar c1 = new SpeedCar();
        SpeedCar c2 = new SpeedCar();
        c1.maxSpeed = 100;
        c2.maxSpeed = 200;
        // 구현끝

        c1.run();
        // 출력 => 자동차가 최고속력 230km로 달립니다.

        c2.run();
        // 출력 => 자동차가 최고속력 210km로 달립니다.
    }
}

class SpeedCar {
    // 구현
    int maxSpeed;

    void run() {
        System.out.println("자동차가 최고속력 " + this.maxSpeed + "km로 달립니다.");
    }

}