package Tests;

import base.BaseTests;

import org.testng.annotations.Test;


public class Tests extends BaseTests {

    @Test
    public void testCase() {
        HomePage.ClickOnHamburgerMenu();
        HomePage.SelectTvAppliances();
        var Televisions = HomePage.SelectTelevisions();
        var SamsungTvs = Televisions.Filter_With_Samsung_Brand();
        SamsungTvs.SortHighToLow();




    }
}