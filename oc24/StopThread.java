package train.oc24;
/**
 * 스레드 공부
 * 스레드 반복중에도 즉시 정지
 */
public class StopThread {
    static boolean stopped = false;
    public static void main(String[] args)
    {
        Thread5 th1 = new Thread5();
        th1.start();
        try {
            Thread.sleep(6*1000);
        } catch(Exception e) {}
        stopped = true; // 쓰레드를 정지시킨다.
        th1.interrupt(); // 일시정지 상태에 있는 쓰레드를 깨운다.
        System.out.println("stopped");
    }
}
class Thread5 extends Thread {
    public void run() {
        //stopped의 값이 false인 동안 반복한다.
        for(int i=0; !StopThread.stopped; i++) {
            System.out.println(i);
            try {
                Thread.sleep(3*1000);
            } catch(Exception e) {}
        }
    }
}