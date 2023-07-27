public class passarraytomethod {
    public static void main(String[]args){
        int a[]={2,5,8,1,5};
        min(a);
    }
    static void min(int a[]){
        int min1=a[0];
        for(int i=1;i<=4;i++){
            if(a[i]>min1){
                min1=a[i];
            }
        }
        System.out.println(min1);
    }
}
