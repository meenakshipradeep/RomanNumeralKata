package com.techReturners.kataTest;
import com.techRetrners.romanKata.NumeralToRoman;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NumeralToRomanTest {

     NumeralToRoman toRoman=null;

   @Before
   public void setUp()
   {
       //Arrange
        toRoman=new NumeralToRoman();

   }

    @Test
    public void CheckRomanBelowTen()
    {
        //Act
        String result=toRoman.convertToRoman(9);
        //Assert
        Assert.assertEquals("IX",result);
    }

    @Test
    public void CheckRomanBelowHundred()
    {
        //Act
        String result=toRoman.convertToRoman(99);
        //Assert

        Assert.assertEquals("L",result);
    }

    @Test
    public void CheckRomanBelowThousand()
    {
       //Act
        String result=toRoman.convertToRoman(900);
        //Assert

        Assert.assertEquals("CM",result);
    }

    @Test
    public void CheckRomanGreaterThanThreeThousand()
    {
        //Act
        String result=toRoman.convertToRoman(4000);
        //Assert
        Assert.assertEquals("MMMM",result);
    }
}
