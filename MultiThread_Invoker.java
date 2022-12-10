import java.io.IOException;

/*
    Called applications should be like:

    // default values of parameters
    int a = 1;

    public static void main(String[] args) throws IOException {
        if(!args[0].isEmpty){
            a = args[0];
        }

        final_result = Functions to call

        System.out.println(result0);
        System.out.println(result1);
        System.out.println(result2);
    }
 */
/**
 * Incoming Arguments Layout
 * args[0] Invoked Program Name  ( +Path, if not in the same directory)
 *     [1] Param1 range or constant Integer    e.g.  30-50(inclusive)  5-50  292
 *     [2] Param2 range or constant Integer
 *     .... so on......
 */
public class MultiThread_Invoker {
    public static void main(String args[]) throws IOException {
        
        int maxNumberOfThreads = 10;

        if (args[0].isEmpty()) return;
        if (args.length>1) {
            int[] base = new int[args.length - 1];
            int[] range = new int[args.length - 1];
            for (int i = 1; i < args.length; i++) {
                if (args[i].contains("-")) {
                    String[] subs = args[i].split("-");
                    base[i - 1] = Integer.parseInt(subs[0]);
                    range[i - 1] = Integer.parseInt(subs[1]) - base[i - 1];
                } else {
                    base[i - 1] = Integer.parseInt(args[i]);
                    range[i - 1] = 0;
                }
            }
        }


        ProcessBuilder builder = new ProcessBuilder(args[0]);
        builder.redirectOutput();
        //System.out.println(builder.directory());
        Process process = builder.start();

//
//          ProcessCreationInterval = 100; // Millisecond
//          if a process is not alive, create a new
//
//
//        // WriteFile Thread
//        new Thread(() -> {
//            try{
//                double onChange = 0.1;
//                while (true) {
//                    Thread.sleep(1000 * 10); //TODO param, thread creation speed
//
//                    if (TopFit_Features.accuracy > onChange) {
//
//                        double accuracySum = 0;         // get the average of 10 times run, to make sure valid
//                        for (int i=0; i<10; i++)
//                            accuracySum += getAccuracy(TopFit_Features.best_sol);
//                        double averageAccuracy = accuracySum/10;
//
//                        if (onChange < averageAccuracy){
//                            onChange = averageAccuracy;
//
//                            PrintWriter writer = new PrintWriter("topParameters.txt", "UTF-8");
//                            writer.println("10 times AverageAccuracy: " + averageAccuracy);
//                            writer.close();
//                        }
//
//                    }
//                }
//            }
//            catch(Exception e) {
//                System.out.println(e);
//            }
//        }).start();
//
//
//
//        // Thread Maker
//        while (true) {
//            int count = Thread.activeCount();
//            //System.out.println(count + " threads are running");
//            if (count < maxNumberOfThreads) {
//                new Thread(
//                        (Runnable) Runtime.getRuntime().exec(params.toString())
//                ).start();
//            }
//            Thread.sleep(ThreadMakerInterval);
//        }





    }
}
