package com.myStudy.train;
/**
 * Instanceof 연산자를 사용해서 형변환
 * */
public class Robot {
         
            //action 매서드내에서 instance확인
            public static void action(Robot r) {
            if(r instanceof DanceRobot) {
                DanceRobot dr = (DanceRobot)r;
                dr.dance();
            } else if(r instanceof SingRobot) {
                SingRobot sr = (SingRobot)r;
                sr.sing();
            } else if(r instanceof DrawRobot) {
                DrawRobot dr = (DrawRobot)r;
                dr.draw();
            }
        }
        public static void main(String[] args) {
              //매개변수 지정
            Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()};
            for(int i=0; i< arr.length;i++)
                action(arr[i]);
        } // main
    }
    class Robotv {}
    class DanceRobot extends Robot {
        void dance() {
            System.out.println("춤을 춥니다.");
        }
    }
    class SingRobot extends Robot {
        void sing() {
            System.out.println("노래를 합니다.");
        }
    }
    class DrawRobot extends Robot {
        void draw() {
            System.out.println("그림을 그립니다.");
        }
    }