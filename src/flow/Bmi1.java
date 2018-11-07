package flow;

import java.util.Scanner;


public class Bmi1 {
	public static void main(String[] args) {
		System.out.println("请输入你的身高：（m）");
		Scanner s = new Scanner(System.in);
		double a = s.nextDouble();
		System.out.println("请输入你的体重：（kg）");
		double b = s.nextDouble();
		Double bmi = b/(a*a);
		System.out.println("BMI值："+bmi);
		
		if(bmi<18.5)
			System.out.println("太瘦");
		else if(bmi>=18.5&&bmi<24)
			System.out.println("正常");
		else if(bmi>=24&&bmi<27)
			System.out.println("过重");
		else if(bmi>=27&&bmi<30)
			System.out.println("肥胖");
		else if(bmi>=30&&bmi<35)
			System.out.println("中度肥胖");
		else if(bmi>=35)
			System.out.println("重度肥胖");
	}

}
