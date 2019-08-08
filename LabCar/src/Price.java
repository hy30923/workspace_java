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
		String option[] = {"歐洲", "日本", "美國"};
		String model = "", id = "";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("要賣什麼車(0: 歐洲車, 1: 日本車, 2: 美國車)=> ");
		String strType = br.readLine();
		type = Integer.parseInt(strType);
		
		System.out.print("請輸入該車車型(0: 房車, 1:跑車)=> ");
		String strModel = br.readLine();
		int intModel = Integer.parseInt(strModel);
		
		System.out.print("請輸入該車牌號碼=> ");
		id = br.readLine();
		
		System.out.print("原新車價是多少=> ");
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
				
				model = option[type] + "房車";
				break;
				
			case 1:
				
				model = option[type] + "跑車";
				break;
		}
	
		
		System.out.println("----------------------------------------------");
		System.out.print("您好，您的車子資料\n型式: " + model + "\n牌照: " + id + "\n原價: " + price + "\n估價為: " + estimate + "\n\t~謝謝~");
		
	}
}
