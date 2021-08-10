package Week1.Day1;

public class Calculater {
/*
	public int add() {
	int x=2;int y=1;int z=1;
	int sum=x+y+z;
	return sum;
	}
*/
	public int sub() {
	int x=2;int y=1;
	int sub=x-y;
	return sub;
}
public static void main(String[] args){

Calculater obj = new Calculater();
int result = obj.sub();
System.out.println(" "+result);
}
}