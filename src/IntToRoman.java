/*
14 - XIV
124

29 - XXIX
2(index- 1)             9(index-0) 
2*10= 20                9*1=9

319 	- CCCXIX
3(index- 2)               1(index- 1)             9(index-0) 
100*3= 300                10*1= 10                1*9=9
CCC						  X						  IX
*/
class IntToRoman {
	public static void main(String[] args) {
		IntToRoman solution = new IntToRoman();
		System.out.println(solution.intToRoman(319));//CCCXIX
		System.out.println(solution.intToRoman(29));//XXIX
		System.out.println(solution.intToRoman(1994));//MDMLXXXIV
		System.out.println(solution.intToRoman(9));//IX
		System.out.println(solution.intToRoman(0));//""
	}
    public String intToRoman(int num) {
    	String units[]     = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
    	String tens []     = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
    	String hundreds [] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
    	String thousand [] = {"","M","MM","MMM"};
    	
    	return thousand[(num%10000)/1000]+""
				+hundreds[(num%1000)/100]+""
				+tens[(num%100)/10]+""
				+units[num%10];
    }
}
