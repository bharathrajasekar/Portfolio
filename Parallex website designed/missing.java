public class missing {

    public static void main(String[] args) {
        int a[]={1,2,4,5};  
        int l=a.length;
        int sum1=0,sum2=0;
        for(int i=1;i<=5;i++){
            sum1=sum1+i;

        }
        System.out.println(sum1);
        for(int j=0;j<a.length;j++){
            sum2=sum2+a[j];
        }
        System.out.println(sum2);
int sum;
sum=sum1-sum2;
System.out.println(sum);
    }
}