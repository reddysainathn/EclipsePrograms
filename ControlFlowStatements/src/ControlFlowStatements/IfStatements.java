package ControlFlowStatements;

public class IfStatements {

	public static void main(String[] args) {
int myInt = 20;
if(myInt <10){
	System.out.println("Yes,Its true");
	}
else if(myInt > 30) {
	System.out.println("No,Its false");
}
else{
	System.out.println("I dont know what to do");
}
int loop = 0;
while(loop <5)
{System.out.println("Looping "+loop);
if(loop ==5)
{
	break;}
	loop++;
	System.out.println("Running");} 

	}

}
