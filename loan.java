
interface loan {
	int checkLoanAmt(double amt);
	
	int checkBalance(double amt,int choice);
	double calculateEmi(double p, double r, int t);
}
