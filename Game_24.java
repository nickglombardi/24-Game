
public class Game_24 {
	private static int counterTotal = 1;
	private static boolean printed = false;
	public static void compute2Nums(double[] numbers){
		double[] thirdChoices = new double[2];
		double total = 0;
		for(int i = 0,j=0;i<4;i++){
			if((0!=i) && (1!=i)){
				thirdChoices[j]=numbers[i];
				j++;
			}
		}
		
		String s = "("+numbers[0]+ " + " +numbers[1]+")";
		total = numbers[0]+numbers[1];
		computeDoublePar(thirdChoices,s,0,total);
		computeThirdNum(thirdChoices,s,0,total);
		total = 0;
		s = "("+numbers[0]+ " - " +numbers[1]+")";
		total = numbers[0]-numbers[1];
		computeDoublePar(thirdChoices,s,0,total);
		computeThirdNum(thirdChoices,s,0,total);
		total = 0;
		s = "("+numbers[0]+ " / " +numbers[1]+")";
		if(numbers[1]!=0){total = numbers[0]/numbers[1];
			computeDoublePar(thirdChoices,s,0,total);
			computeThirdNum(thirdChoices,s,0,total);
		}
		total = 0;
		s = "("+numbers[0]+ " * " +numbers[1]+")";
		total = numbers[0]*numbers[1];
		computeDoublePar(thirdChoices,s,0,total);
		computeThirdNum(thirdChoices,s,0,total);
		total= 0;
		compute2Nums(numbers,0,2);
	}
	public static void compute2Nums(double[] numbers,int counterOne,int counterTwo){
		double[] thirdChoices = new double[2];
		
		String s = "";
		double total = 0;
		if(counterOne<4){
			if(counterTwo<4){
				for(int i = 0,j=0;i<4;i++){
					if((counterOne!=i) && (counterTwo!=i)){
						thirdChoices[j]=numbers[i];
						j++;
					}
				}
				s ="("+numbers[counterOne]+ " + " +numbers[counterTwo]+")";
				total = numbers[counterOne]+numbers[counterTwo];
				computeDoublePar(thirdChoices,s,0,total);
				computeThirdNum(thirdChoices,s,0,total);
				total = 0;
				s ="("+numbers[counterOne]+ " - " +numbers[counterTwo]+")";
				total = numbers[counterOne]-numbers[counterTwo];
				computeDoublePar(thirdChoices,s,0,total);
				computeThirdNum(thirdChoices,s,0,total);
				total = 0;
				s ="("+numbers[counterOne]+ " / " +numbers[counterTwo]+")";
				if(numbers[counterTwo]!=0){total = numbers[counterOne]/numbers[counterTwo];
					computeDoublePar(thirdChoices,s,0,total);
					computeThirdNum(thirdChoices,s,0,total);
				}
				total = 0;
				s ="("+numbers[counterOne]+ " * " +numbers[counterTwo]+")";
				total = numbers[counterOne]*numbers[counterTwo];
				computeDoublePar(thirdChoices,s,0,total);
				computeThirdNum(thirdChoices,s,0,total);
				total = 0;
				counterTwo++;
				if(counterTwo==counterOne){
					counterTwo++;
				}
			}
			if(counterTwo==4){
				counterTwo=0;
				counterOne++;
			}
			compute2Nums(numbers,counterOne,counterTwo);
		}
		else if(printed==false){
			System.out.println("There are no possible solutions!");
		}
	}
	public static void computeDoublePar(double[] numbers, String s,int counter,double total){
		double fourthChoice = 0;
		if(counter<2){
			for(int i = 0;i<numbers.length;i++){
				if(counter!=i){
					fourthChoice = numbers[i];
				}
			}
			if((numbers[counter]+fourthChoice) + total==24){System.out.println((counterTotal++)+":    "+"("+numbers[counter]+ " + " + fourthChoice +") + " + s + "= 24");printed = true;}
			if((numbers[counter]-fourthChoice) + total==24){System.out.println((counterTotal++)+":    "+"("+numbers[counter]+ " - " + fourthChoice +") + " + s + "= 24");printed = true;}
			if(fourthChoice!=0){if((numbers[counter]/fourthChoice) + total==24){System.out.println((counterTotal++)+":    "+"("+numbers[counter]+ " / " + fourthChoice +") + " + s + "= 24");printed = true;}}
			if((numbers[counter]*fourthChoice) + total==24){System.out.println((counterTotal++)+":    "+"("+numbers[counter]+ " * " + fourthChoice +") + " + s + "= 24");printed = true;}

			if((numbers[counter]+fourthChoice) - total==24){System.out.println((counterTotal++)+":    "+"("+numbers[counter]+ " + " + fourthChoice +") - " + s + "= 24");printed = true;}
			if((numbers[counter]-fourthChoice) - total==24){System.out.println((counterTotal++)+":    "+"("+numbers[counter]+ " - " + fourthChoice +") - " + s + "= 24");printed = true;}
			if(fourthChoice!=0){if((numbers[counter]/fourthChoice) - total==24){System.out.println((counterTotal++)+":    "+"("+numbers[counter]+ " / " + fourthChoice +") - " + s + "= 24");printed = true;}}
			if((numbers[counter]*fourthChoice) - total==24){System.out.println((counterTotal++)+":    "+"("+numbers[counter]+ " * " + fourthChoice +") - " + s + "= 24");printed = true;}
			
			if(total!=0){
				if((numbers[counter]+fourthChoice) / total==24){System.out.println((counterTotal++)+":    "+"("+numbers[counter]+ " + " + fourthChoice +") / " + s + "= 24");printed = true;}
				if((numbers[counter]-fourthChoice) / total==24){System.out.println((counterTotal++)+":    "+"("+numbers[counter]+ " - " + fourthChoice +") / " + s + "= 24");printed = true;}
				if(fourthChoice!=0){if((numbers[counter]/fourthChoice) / total==24){System.out.println((counterTotal++)+":    "+"("+numbers[counter]+ " / " + fourthChoice +") / " + s + "= 24");printed = true;}}
				if((numbers[counter]*fourthChoice) / total==24){System.out.println((counterTotal++)+":    "+"("+numbers[counter]+ " * " + fourthChoice +") / " + s + "= 24");printed = true;}
			}
			if((numbers[counter]+fourthChoice) * total==24){System.out.println((counterTotal++)+":    "+"("+numbers[counter]+ " + " + fourthChoice +") * " + s + "= 24");printed = true;}
			if((numbers[counter]-fourthChoice) * total==24){System.out.println((counterTotal++)+":    "+"("+numbers[counter]+ " - " + fourthChoice +") * " + s + "= 24");printed = true;}
			if(fourthChoice!=0){if((numbers[counter]/fourthChoice) * total==24){System.out.println((counterTotal++)+":    "+"("+numbers[counter]+ " / " + fourthChoice +") * " + s + "= 24");printed = true;}}
			if((numbers[counter]*fourthChoice) * total==24){System.out.println((counterTotal++)+":    "+"("+numbers[counter]+ " * " + fourthChoice +") * " + s + "= 24");printed = true;}
						
			counter++;
			computeDoublePar(numbers,s,counter,total);
		}
	}
	public static void computeThirdNum(double[] choices,String s,int counter,double total){
		double fourthChoice = 0;
		String t = "";
		double newTotal = 0;
		if(counter<2){
			for(int i = 0;i<choices.length;i++){
				if(counter!=i){
					fourthChoice = choices[i];
				}
			}
			t = ("("+choices[counter]+" + " + s+")");
			newTotal =choices[counter]+total;
			computeFourthNum(fourthChoice,t,newTotal);
			newTotal = 0;
			t = ("("+choices[counter]+" - " + s+")");
			newTotal =choices[counter]-total;
			computeFourthNum(fourthChoice,t,newTotal);
			newTotal = 0;
			t = ("("+choices[counter]+" / " + s+")");
			if(total!=0){newTotal =choices[counter]/total;
			computeFourthNum(fourthChoice,t,newTotal);
			}
			newTotal = 0;
			t = ("("+choices[counter]+" * " + s+")");
			newTotal =choices[counter]*total;
			computeFourthNum(fourthChoice,t,newTotal);
			newTotal = 0;
			t = ("("+s + "/" + choices[counter]+")");
			if(choices[counter]!=0){newTotal = total/choices[counter];
			computeFourthNum(fourthChoice,t,newTotal);
			}
			newTotal = 0;
			t = ("("+s +" - " + choices[counter]+")");
			newTotal = total-choices[counter];
			computeFourthNum(fourthChoice,t,newTotal);
			newTotal = 0;
			t = ("("+s +" + " + choices[counter]+")");
			newTotal = total+choices[counter];
			computeFourthNum(fourthChoice,t,newTotal);
			newTotal = 0;
			t = ("("+s +" * " + choices[counter]+")");
			newTotal = total*choices[counter];
			computeFourthNum(fourthChoice,t,newTotal);
			newTotal = 0;
			counter++;
			computeThirdNum(choices,s,counter,total);
		}
	}
	public static void computeFourthNum(double choice,String s,double total){
		if(choice+total==24){System.out.println((counterTotal++)+":    "+choice+" + " + s + "= 24");printed=true;}
		if(choice-total==24){System.out.println((counterTotal++)+":    "+choice+" - " + s + "= 24");printed=true;}
		if(total!=0){if(choice/total==24){System.out.println((counterTotal++)+":    "+choice+" / " + s + "= 24");printed=true;}}
		if(choice*total==24){System.out.println((counterTotal++)+":    "+choice+" * " + s + "= 24");printed=true;}
		if(total-choice==24){System.out.println((counterTotal++)+":    "+s +" - " + choice + "= 24");}
		if(choice!=0){if(total/choice==24){System.out.println((counterTotal++)+":    "+s +" / " + choice + "= 24");printed=true;}}
		if(total+choice==24){System.out.println((counterTotal++)+":    "+s +" + " + choice + "= 24");printed=true;}
		if(total*choice==24){System.out.println((counterTotal++)+":    "+s +" * " + choice + "= 24");printed=true;}
		
	}
	public static void main(String[] args) {
		double[] numbers = {1,2,3,4};
		compute2Nums(numbers);
	}
}
