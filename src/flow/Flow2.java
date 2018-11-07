package flow;

public class Flow2 {
    public static void main(String[] args) {
         
        //打印0到4    
        int i = 0;
        while(i<0){
            System.out.println(i);
            i++;
        }
        
        //打印0到4
        //与while的区别是，无论是否成立，先执行一次，再进行判断
        int j = 0;
        do{
            System.out.println(j);
            j++;           
        } while(j<0);
    }
}
