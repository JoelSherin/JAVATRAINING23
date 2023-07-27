public class decimaltobinary {
    public static void main(String[]args){
        int a=27;
        int b[]=new int[10];
        for(int i=0;i<10;i++){
            if((a>=1)&&((a%2)==0)){
                b[i]=0;
                a=a/2;
            }
            else if(a>=1){
                b[i]=1;
                a=a/2;
            }
        }
        for(int i=0;i<10;i++){
            System.out.print(b[i]);
        }
    }
}
