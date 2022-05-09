//Q5. Calculate the income tax on the basis of following table. 
//
//              Note:-Assume slab is consider for Male, Female as well as Senior citizen
//
//                             Slab                                   Income Range                             Tax payable in Percentage
//
//                             Slab A                               0-1,80,000                                                                  Nil
//
//                             Slab B                               1,81,001-3,00,000                                                    10%
//
//                             Slab C                               3,00,001-5,00,000                                                    20%
//
//                             Slab D                               5,00,001-10,00,000                                                 30%     
//
//              Accept CTC from user and display tax amount           

class TaxAmount{
    public void calculateTaxAmount(int ctc){
    	double tax;
    	if (ctc<=180000)
    		tax=0;
    	else  if(ctc<=300000)
    		tax=0.1*(ctc-180000);
    	else if(ctc<=500000)
    		tax=0.2*(ctc-300000);
    	else
    		tax=0.3*(ctc-500000);
    	System.out.println("Income tax amount will be "+tax);
    }
}
    public class Assignment1Q5 {

	public static void main(String[] args) {
		System.out.println("Income of the person");
		TaxAmount taxes=new TaxAmount();
		taxes.calculateTaxAmount(543234);
	}

}
