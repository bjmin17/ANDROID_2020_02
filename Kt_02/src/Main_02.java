public class Main_02 {
    public static void main(String[] args) {
        int start = 0;
        int end = 100;
        int sum =0;

        for(int i = start; i <= end; i++) {

            if(i % 2 == 0) {
                sum += i;
            }

        }
        System.out.println(sum);
        sum = 0;
        for(int i = start; i <=end ;  i+=2 ) {
            sum += i;
        }
        System.out.println(sum);
    }
}
