//10416005ªL«Ø¦t
import java.util.ArrayList;

public class BigIntPlus{
	private ArrayList<Integer> sum = new ArrayList();
	private ArrayList<Integer> number1 = new ArrayList();
	private ArrayList<Integer> number2 = new ArrayList();
	private String first;
	private String second;
	
	public BigIntPlus(String first,String second){
		this.first = first;
		this.second = second;
		firstToString();
		secondToString();
		checkSize();
	}
	public void firstToString(){
		for(int i = first.length();i>=0;i--){
			number1.add(Integer.valueOf(String.valueOf(first.charAt(i))));
		}
	}
	public void secondToString(){
		for(int i = second.length();i>=0;i--){
			number2.add(Integer.valueOf(String.valueOf(second.charAt(i))));
		}
	}
	public void checkSize(){
		if(first.length()>second.length()){
			for(int i = 0;i<(first.length()-second.length());i++){
				number2.add(0);
			}
		}
		else if(first.length()<second.length()){
			for(int i = 0;i<(second.length()-first.length());i++){
				number1.add(0);
			}
		}
    }
	public void sumPlus(){
		for(int i = 0;i<number1.size();i++){
			sum.add(number1.get(i)+number2.get(i));
		}
		for(int i = 0;i<sum.size();i++){
			if(sum.get(i)>=10){
				sum.set(i+1,sum.get(i+1)+1);
				sum.set(i,sum.get(i)%10);
			}
		}
	}
	public void printSum(){
		for(int i = sum.size();i>=0;i--){
			System.out.print(sum.get(i));
		}
	}
}