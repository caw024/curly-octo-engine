public class QuickSortTester2{
    public static void main(String args[]){
	
	/*	for(int i=6; i<20; i++){
	    double totalTime = 0;*/
	/*for(int k=100; k<100000; k+=50){
		int[] test = QuickSort.buildArray(k, 50*k);
		double start = System.nanoTime();
		QuickSort.qsort(test);
		double ellapsed = System.nanoTime() - start;
		System.out.println(k+","+ellapsed);
	    }*/
	for (int i = 64; i<Math.pow(2,20); i+=64){
	    double time=0;
	for(int k=0; k<1000; k++){
	    
	    int[] test = QuickSort.buildArray(i, 2*i);
	    double start = System.nanoTime();
	    QuickSort.qsort(test);
	    time += System.nanoTime() - start;
	}
	System.out.println(i+","+ time); 
	}}


}


