package flow;

import java.util.Scanner;


public class Bmi1 {
	public static void main(String[] args) {
		System.out.println("�����������ߣ���m��");
		Scanner s = new Scanner(System.in);
		double a = s.nextDouble();
		System.out.println("������������أ���kg��");
		double b = s.nextDouble();
		Double bmi = b/(a*a);
		System.out.println("BMIֵ��"+bmi);
		
		if(bmi<18.5)
			System.out.println("̫��");
		else if(bmi>=18.5&&bmi<24)
			System.out.println("����");
		else if(bmi>=24&&bmi<27)
			System.out.println("����");
		else if(bmi>=27&&bmi<30)
			System.out.println("����");
		else if(bmi>=30&&bmi<35)
			System.out.println("�жȷ���");
		else if(bmi>=35)
			System.out.println("�ضȷ���");
	}

}
