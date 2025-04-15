
public class test02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//Java_08
		 int a = 20;
		 if(a > 10){
		 if(a < 30){
		 System.out.println( "A" );
		 }
		 }
		 //もし、”ある数”(a)が10より大きい場合で、かつ、”ある数”(a)が30未満の場合、Aと表示する。
		 int b = 10;
		 if( b > 0)
		 if( b == 2 ){
		 System.out.println( "B" );
		 }else if( a == 3 ){
		 System.out.println( "C" );
		 }else{
		 System.out.println( "D" );
		 }
		 //もし”ある数”(a)が0より大きいとき、
		 //”ある数”(a)が2と等しければ、Aと表示する。
		 //そうでない場合で、”ある数”(a)が3と等しいとき、Bと表示する。
		 //それ以外の場合は、Cと表示する。
		 int number= 88;
		 if(number <= 100){
		 if(number < 20){
		 System.out.println("未成年");
		 }else if(number == 77){
		 System.out.println("喜寿");
		 }else if(number == 88){
		 System.out.println("米寿");
		 }else{
		 System.out.println("成人");
		 }
		 }
		 int number1= 36;
		 if(number1 <= 100){
		 if(number1< 20){
		 System.out.println("未成年");
		 }else if(number1 == 77){
		 System.out.println("喜寿");
		 }else if(number1== 88){
		 System.out.println("米寿");
		 }else{
		 System.out.println("成人");
		 }
		 }
		 //Java_09
		 int c = 1;
		 switch(c){
		 case 0:
		 System.out.println("aは0に等しい");
		 break;
		 case 1:
		 System.out.println("aは1に等しい");
		 break;
		 }
		 //もし、”ある数”(a)が0の場合、“aは0に等しい“と表示。
		 //もしくは、”ある数”(a)が1の場合、”aは1に等しい”と表示する。
		 int d = 5;
		 switch(d){
		 case 0:
		 System.out.println("aは0に等しい");
		 break;
		 case 1:
		 System.out.println("aは1に等しい");
		 break;
		 default:
		 System.out.println("aは0でも1でもない");
		 }
		 //もし、”ある数”(a)が0の場合、“aは0に等しい“と表示。
         //もしくは、”ある数”(a)が1の場合、”aは1に等しい”と表示。
		 //それ以外の場合は、”aは0でも1でもない”と表示する。
		 String e = "赤";
		 switch(e){
		 case "赤":
		 System.out.println("赤組です");
		 break;
		 case "白":
		 System.out.println("白組です");
		 break;
		 }
		 //もし、”ある変数”(a)が”赤”の場合、“赤組です“と表示。
		 //もしくは、”ある変数”(a)が”白”の場合、”白組です”と表示する。
		 
		 //Java_10
		 String[] name = new String[3];
		 name[0]="田中";
		 name[1]="高橋";
		 name[2]="斉藤";
		 System.out.println(name[0]);

		 char[] f= {'x', 'y', 'z'};
		 System.out.println(f[0]);
		 
		 String[] name01 = {"田中", "高橋", "斉藤"};
		 name01[0]="加藤";
		 System.out.println(name01[0]);
		 //一度、配列に格納した「田中」を「加藤」へ更新する
	 }
}
