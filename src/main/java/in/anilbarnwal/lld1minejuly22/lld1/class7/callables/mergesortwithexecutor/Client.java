package in.anilbarnwal.lld1minejuly22.lld1.class7.callables.mergesortwithexecutor;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) {
        demoMergeSort();
    }

    private static void demoMergeSort() {
        try {
            ExecutorService executorService = Executors.newCachedThreadPool();

            MergeSorter mergeSorter = new MergeSorter(List.of(12,45,11,0,4,1,155), executorService);
//            List<Integer> sortedList =  mergeSorter.call();
//            System.out.println(sortedList);
            Future<List<Integer>> futureList = executorService.submit(mergeSorter);

            // get on Future is blocking
            // more business logic here ...
            System.out.println("Waiting1....");
            System.out.println("Waiting2....");
            System.out.println("Waiting3....");
            System.out.println(futureList.get());
            System.out.println("Waiting4....");
            System.out.println("Waiting5....");

        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
