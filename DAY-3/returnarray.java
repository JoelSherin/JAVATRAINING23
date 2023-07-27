public class returnarray {
    public static void main(String[]args){
        int a[]=get();
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    static int[] get(){
        return new int[]{2,4,6,7,8};
    }
}
