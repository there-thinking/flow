package flow;

public class Flow {
    public static void main(String[] args) {
         
        boolean b = false;
        //����ж�����ʽ�������ô�������������
        if(b){
            System.out.println("yes1");
            System.out.println("yes2");
            System.out.println("yes3");
        }
         
        //������ʽ2 3 ����b�Ƿ�Ϊtrue����ִ��
         
        if(b)
            System.out.println("yes1");
            System.out.println("yes2");
            System.out.println("yes3");
             
        //���ֻ��һ�����ʽ���Բ���д����������ȥ���ԼһЩ
        if(b){
            System.out.println("yes1");
        }
         
        if(b)
            System.out.println("yes1");
         
    }
}