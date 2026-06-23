public class Defeat_people {
    public static void main(String[] args) {
        int p=100;
        int i=1;
        while(true){
            p=p-(i*i);
            if(p<(i+1)*(i+1)){
                System.out.println(i);
                return;
            }
            i+=1;
        }
    }
}
