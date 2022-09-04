package Tests;

import base.BaseTests;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Tests extends BaseTests {

    @Test
    public void testCase() {
        HomePage.ClickOnHamburgerMenu();
        HomePage.SelectTvAppliances();
        var Televisions = HomePage.SelectTelevisions();
        var SamsungTvs = Televisions.Filter_With_Samsung_Brand();
        SamsungTvs.SortHighToLow();
        var SecondTv = SamsungTvs.GetAllAvailableTvs();
        Assert.assertTrue(SecondTv.AboutThisItemSection().isDisplayed());
        Assert.assertTrue(SecondTv.GetSectionInfoText().contains("About this item"));
        System.out.println(SecondTv.GetSectionInfoText());
    }

}