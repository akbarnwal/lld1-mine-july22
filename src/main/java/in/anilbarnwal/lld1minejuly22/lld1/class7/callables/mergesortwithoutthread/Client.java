package in.anilbarnwal.lld1minejuly22.lld1.class7.callables.mergesortwithoutthread;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        demoMergeSort();
    }

    private static void demoMergeSort() {
        try {
            MergeSorter mergeSorter = new MergeSorter(List.of(12,45,11,0,4,1,155));
            List<Integer> sortedList =  mergeSorter.call();
            System.out.println(sortedList);
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
