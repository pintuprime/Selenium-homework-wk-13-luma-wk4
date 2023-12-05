package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.WomensJacketsPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WomensJacketsTest extends BaseTest {
    HomePage homepage = new HomePage();
    WomensJacketsPage womenPage = new WomensJacketsPage();


    @Test
    public void verifyTheSortByProductNameFilter() {
        //Mouse Hover on Women Menu
        homepage.mouseHoverOnWomenMenu();
        //* Mouse Hover on Tops
        homepage.mouseHoverOnTops();
        //* Click on Jackets
        homepage.clickOnJackets();
        //* Select Sort By filter “Product Name
        womenPage.selectProductNameFilter(" Product Name ");
        //* Verify the products name display in
        //alphabetical order
        Assert.assertEquals(womenPage.getProductList1(), womenPage.getProductList2());
    }

    @Test
    public void verifyTheSortByPriceFilter() {
        // Mouse Hover on Women Menu
        homepage.mouseHoverOnWomenMenu();
        //Mouse Hover on Tops
        homepage.mouseHoverOnTops();
        //* Click on Jackets
        homepage.clickOnJackets();
        // Select Sort By filter “Price
        womenPage.selectProductNameFilter(" Price ");
        //* Verify the products price display in
        //Low to High
        Assert.assertEquals(womenPage.getPriceList1(), womenPage.getPriceList2());
    }
}
