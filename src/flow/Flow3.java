package flow;

public class Flow3 {
    public static void main(String[] args) {
         
        //���ʹ��if else
        int day = 5;
        if (day==1)
            System.out.println("����һ");
              
        else if (day==2)
            System.out.println("���ڶ�");
        else if (day==3)
            System.out.println("������");
        else if (day==4)
            System.out.println("������");
        else if (day==5)
            System.out.println("������");
        else if (day==6)
            System.out.println("������");
        else if (day==7)
            System.out.println("������");
        else
            System.out.println("�����ʲô��");
         
        //���ʹ��switch
        switch(day){
            case 1:
                System.out.println("����һ");
                break;
            case 2:
                System.out.println("���ڶ�");
                break;
            case 3:
                System.out.println("������");
                break;
            case 4:
                System.out.println("������");
                break;
            case 5:
                System.out.println("������");
                break;
            case 6:
                System.out.println("������");
                break;
            case 7:
                System.out.println("������");
                break;
            default:
                System.out.println("�����ʲô��");
        }
         
    }
}