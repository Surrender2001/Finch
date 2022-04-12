import java.util.concurrent.TimeUnit;

public class FinchTest {
    public static void main(String[] args) throws InterruptedException {

        Finch finch = new Finch("A");
        finch.setBeak(0,100,0);
        while(finch.getDistance()>25){
            continue;
        }
        finch.setBeak(0,0,0);

//        int black = finch.getLine("R");
//        int white = finch.getLine("L");
//        double threshold = (black+white)/2.0;
//        System.out.println(black);
//        System.out.println(white);
//        System.out.println(threshold);
//        long start = System.currentTimeMillis();
//        TimeUnit.MILLISECONDS.sleep(2400);
//        System.out.println(finch.getSound());
//        finch.setMove("F",5,100);

        //면화
//        int loud = 0;
//        while(loud<100)
//        {
//            loud = finch.getSound();
//            continue;
//        }
//        System.out.println("Loud clap = "+loud);


//        loud = 0;
//        while(loud<200){
//            loud = finch.getSound();
//            if(finch.getLine("R")<threshold){
//                finch.setMotors(30,2);
//            }else{
//                finch.setMotors(2,30);
//            }
//        }
//        finch.setMotors(0,0);
//        System.out.println(loud);
//        System.out.println(System.currentTimeMillis()-start);
    }
}
