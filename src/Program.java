import java.util.concurrent.TimeUnit;

class Thread_finch extends Thread{

    Finch finch2 = new Finch("B");

    @Override
    public void run(){

        for(int i=0;i<10000;i++){

            long start = System.currentTimeMillis();

            finch2.setMove("F",10,50);
            finch2.setTurn("R",90,75);
            finch2.setMove("F",20,50);
            finch2.setTurn("L",90,75);
            finch2.setMove("F",10,50);
            finch2.setTurn("L",90,75);


            finch2.setMove("F",10,50);
            finch2.setTurn("L",90,75);

            for (int j = 0; j<20; j++){
                finch2.setMove("F",1,50);
                if(finch2.getDistance()<5){
                    finch2.setBeak(100,0,0);
                    finch2.setTail("all",100,0,0);
                    finch2.setMotors(0,0);
                    finch2.pause(0.5);
                    finch2.setBeak(0,0,0);
                    finch2.setTail("all",0,0,0);
                    //TimeUnit.MINUTES.sleep(1);
                }
            }
            finch2.setTurn("R",90,75);
            finch2.setMove("F",10,50);
            finch2.setTurn("R",90,75);
            finch2.setMotors(0,0);
            while(System.currentTimeMillis()-start<10000 )
            {
//                try {
//                    wait(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                try {
                    TimeUnit.MILLISECONDS.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }


        finch2.stopAll();
        finch2.disconnect();
    }

}


public class Program {

    public static void main(String[] args) throws InterruptedException {

        Finch finch = new Finch("A");

//        Thread_finch thread_finch = new Thread_finch();
//        thread_finch.start();

        for(int k=0;k<10000;k++){
            long start = System.currentTimeMillis();

            finch.setMove("F",10,100);
            finch.setTurn("L",90,75);

            for (int i = 0; i<20; i++){
                finch.setMove("F",1,100);
                if(finch.getDistance()<5){
                    finch.setBeak(100,0,0);
                    finch.setTail("all",100,0,0);
                    finch.setMotors(0,0);
                    finch.pause(0.5);
                    finch.setBeak(0,0,0);
                    finch.setTail("all",0,0,0);
                    //TimeUnit.MINUTES.sleep(1);
                }
            }
            finch.setTurn("R",90,75);
            finch.setMove("F",10,100);
            finch.setTurn("R",90,75);
            finch.setMotors(0,0);


            finch.setMove("F",10,100);
            finch.setTurn("R",90,75);
            finch.setMove("F",20,50);
            finch.setTurn("L",90,75);
            finch.setMove("F",10,100);
            finch.setTurn("R",90,75);

            while(System.currentTimeMillis()-start<10000)
            {
                TimeUnit.MILLISECONDS.sleep(100);
            }

//            finch.setMove("L",1,50);
//            finch1.setMove("F",1,50);
//            finch1.setMove("R",1,50);
        }
        finch.stopAll();
        finch.disconnect();
//        finch1.stopAll();
//        finch1.disconnect();

    }
}
