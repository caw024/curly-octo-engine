public class QuickSortTester{
    public static void main(String args[]){
	double[] results = new double[14];
	for(int i=6; i<20; i++){
	    double totalTime = 0;
	    for(int k=0; k<1000; k++){
		int[] test = QuickSort.buildArray((int)Math.pow(2,i), 50);
		double start = System.currentTimeMillis();
		QuickSort.qsort(test);
		double end = System.currentTimeMillis();
		double elapsed = end-start;
		totalTime += elapsed;
		//System.out.println(totalTime);
	    }
	    results[i-6] = totalTime;
	    System.out.println(totalTime);
	}
	for(double d: results) System.out.println(d);
    }
   
}

