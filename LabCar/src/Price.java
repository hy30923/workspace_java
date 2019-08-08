import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Date: 2019/08/08
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

public class Price {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		int type = 1, price = 0;
		double estimate = 0.0;
		String option[] = {"�ڬw", "�饻", "����"};
		String model = "", id = "";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�n�椰��(0: �ڬw��, 1: �饻��, 2: ���ꨮ)=> ");
		String strType = br.readLine();
		type = Integer.parseInt(strType);
		
		System.out.print("�п�J�Ө�����(0: �Ш�, 1:�]��)=> ");
		String strModel = br.readLine();
		int intModel = Integer.parseInt(strModel);
		
		System.out.print("�п�J�Ө��P���X=> ");
		id = br.readLine();
		
		System.out.print("��s�����O�h��=> ");
		String strPrice = br.readLine();
		price = Integer.parseInt(strPrice);
		
		switch(type) {
		
			case 0:
				
				EuroCar e = new EuroCar(model, id, price);
				estimate = e.estimate();
				break;
				
			case 1:
				
				JapCar j = new JapCar(model, id, price);
				estimate = j.estimate();
				break;
				
			case 2:
				
				USACar a = new USACar(model, id, price);
				estimate = a.estimate();
				break;
		}
	
		switch(intModel) {
		
			case 0:
				
				model = option[type] + "�Ш�";
				break;
				
			case 1:
				
				model = option[type] + "�]��";
				break;
		}
	
		
		System.out.println("----------------------------------------------");
		System.out.print("�z�n�A�z�����l���\n����: " + model + "\n�P��: " + id + "\n���: " + price + "\n������: " + estimate + "\n\t~����~");
		
	}
}
