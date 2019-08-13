import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

/*
 * Date: 2019/08/12
 * Author: Sean Hsu
 * Version: 1.0.0
 * Describe: 
 * 
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Random r = new Random();
		
		System.out.print("請輸入陣列大小：");
		
		int lottoSize = 0;
		
		try {
			
			try {
				
				lottoSize = Integer.parseInt(bf.readLine());
			} 
			
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(lottoSize > 48 || lottoSize < 6)
				
				throw new CmyException1();
		
		} 
		
		catch(NumberFormatException e) {
			// TODO: handle exception
			System.out.println("球數不為數字，將被設定為6球");
		}
		
		catch(CmyException1 e) {
			
			e.showMessage();
			lottoSize = e.changeSize();
		}
		
		finally {
			
			System.out.println("樂透開獎球數為" + lottoSize);
		}
		
		int lottoAry[] = new int[lottoSize];
		System.out.println("存放樂透開獎的陣列實體產生完畢");
		
		for(int i = 0 ; i < lottoSize ; i++) {
			
			lottoAry[i] = r.nextInt(48) + 1;
			
			for(int j = 0 ; j < i ;) {
				
				if(lottoAry[j] == lottoAry[i]) {
					
					lottoAry[i] = r.nextInt(48) + 1;
					j = 0;
				}
			
				else {
					
					j++;
				}
			}
		}
		
		Arrays.sort(lottoAry);
		
		System.out.println("樂透號碼為：");
		
		for(int i = 0 ; i < lottoSize ; i++) {
			
			System.out.print(lottoAry[i] + " ");
		}
	}
}
