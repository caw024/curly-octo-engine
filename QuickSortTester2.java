public class QuickSortTester2{
    public static void main(String args[]){
	
	/*	for(int i=6; i<20; i++){
	    double totalTime = 0;*/
	    for(int k=100; k<100000; k+=50){
		int[] test = QuickSort.buildArray(k, 50*k);
		double start = System.nanoTime();
		QuickSort.qsort(test);
		double ellapsed = System.nanoTime() - start;
		System.out.println(k+","+ellapsed);
	    }
    }


}


