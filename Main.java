class Main {
  public static void main(String[] args) {
   // kindly use appropriate data types for your declaration
   //declare an array variable and assign the days of the month debtor defaulted,
    byte daysOfTheMonthDebtorDefaulted[]= {1,2,3,4,5,6,7};
   // declare variables of amount the debtor is to pay per day, and amount the debtor paid and assign values to them
    float amountPayPerDay= 500f;
    float amountPaid= 1700f;
   // declare all the variables needed for your calculations
    float totalAmount= 0f;
    byte actualElement= 0;
    float temp=amountPaid;
    byte daysDebtorPaidFor= 0;
    float leftToPay;
    float extra;
   // calculate and print total amount the debtor is to pay using for each loop
    for(byte i: daysOfTheMonthDebtorDefaulted)
    {
      totalAmount+=amountPayPerDay;
      actualElement++;
    }
    System.out.println("The total amount thedebtor is to pay is #" + totalAmount);
   // calculate the days the debtor paid for and print the days in which was paid for starting from the left to the right of the array. Also check if there was a day that the debtor did not pay the complete amount for that day, if yes, print the day and the amount left to pay for that day. 
    for(int i=0; i<actualElement;i++) {
            if (temp >= amountPayPerDay) {
                temp = temp - amountPayPerDay;
                //temp-=amountPayPerDay
                daysDebtorPaidFor++;
            } else if (temp < amountPayPerDay) {
                break;
            }
        }
        for(int i=0;i<daysDebtorPaidFor;i++)
        {
            System.out.println("The debtor paid for day" + daysOfTheMonthDebtorDefaulted[i]);
        }
        if(amountPaid%amountPayPerDay>0 && amountPaid<totalAmount)
        {
            System.out.println("The day that was not completely paid for is day " + daysOfTheMonthDebtorDefaulted[daysDebtorPaidFor]);
            System.out.println("The amount left to complete the payment for day " + daysOfTheMonthDebtorDefaulted[daysDebtorPaidFor] +" is #" + (amountPayPerDay-(amountPaid%amountPayPerDay)));
        }
   // calculate amount the debtor is left to pay if he did not pay complete fees and the days not paid for or  check if the debtor paid extra and the extra amount he paid for, or if he paid the exact amount needed to be paid and print likewise
    if(amountPaid<totalAmount)
        {
            leftToPay= totalAmount-amountPaid;
            System.out.println("The amount that is left to pay is #" + leftToPay);
        }
        else if(amountPaid>totalAmount)
        {
            extra= amountPaid-totalAmount;
            System.out.println("The amount you are being owed is #" + extra);
        }
        else if(amountPaid==totalAmount)
        {
            System.out.println("You have paid the exact amount!!");
        }

  }