public class MultAdd{
public static double multadd(double a, double b, double c){	
	
	return(a*b+c);	
	
	}
	
	public static void main(String[] args){
		
		double simpleAdd=multadd(1.0,2.0,3.0);
		double trigResult=multadd(0.5,Math.cos(0.25*Math.PI),Math.sin(0.25*Math.PI));
		double logResult=multadd(Math.log10(10.0),1,Math.log10(20.0));
		double exponentResult=expSum(2);
		
		System.out.println(simpleAdd + "\n" + trigResult + "\n" + logResult+"\n" + exponentResult);
		
		}

public static double expSum(double x){
	
	return(multadd(x,Math.exp(-x),Math.sqrt(1-Math.exp(-x))));
	
	}

}
