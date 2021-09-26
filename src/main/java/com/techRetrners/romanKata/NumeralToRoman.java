package com.techRetrners.romanKata;

public class NumeralToRoman {

    public String convertToRoman(int number)
    {
        if(number > 3000)
        {
            try
            {
                throw new Exception("Number should not be grater than 3000");
            }
            catch(Exception ex)
            {
                return ex.getMessage();
            }
        }
        String result="";
       String[] oneToTenArray={"","I","II","III","IV","V","VI","VII","VIII","IX"};
       String[] tenToHundredArray = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] hundredsToThousandArray = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] thousandsArray = {"","M","MM","MMM"};

        result+=thousandsArray[(number/1000)%10];
        result+=hundredsToThousandArray[(number/100)%10];
       result+=tenToHundredArray[(number/10)%10];
       result+=oneToTenArray[number%10];

       return result;
    }
}
