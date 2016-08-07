public class candies {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of children:");
		int num=in.nextInt();
		if(num>0){
			int arr[]=new int[num];
		System.out.println("Enter the rating value:");
		for(int i=0;i<num;i++){
			arr[i]=in.nextInt();}
		int temp=0;
		for(int i=0;i<num;i++){
			for(int j=i+1;j<num;j++){
				if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;}}}
		
		int rem=0;int count=0;
		for(int i=1;i<=num;i++){
			rem+=i;}
		for(int i=0;i<num;i++){
			for(int j=i+1;j<num;j++){
				if(arr[i]==arr[j]){
					count++;}}}
		if(count!=0){
		if(count<rem){
			rem=rem-count;}
		else{
			rem=count-rem;}
		
		System.out.println("The Minimum number of candies is "+rem);}
		else{
			System.out.println("The minimum number of candies is " +rem);
			
		}
		}
		else{ System.out.println("output:0");
		}}
}