package com.edgewords;

import com.hp.lft.sdk.web.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.hp.lft.sdk.*;
import com.hp.lft.verifications.*;

import unittesting.*;

public class LeanFtTest extends UnitTestClassBase {

    Browser browser;  //our browser instance
    public LeanFtTest() {
        //Change this constructor to private if you supply your own public constructor
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        instance = new LeanFtTest();
        globalSetup(LeanFtTest.class);
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        globalTearDown();
    }

    @Before
    public void setUp() throws Exception {
        browser = BrowserFactory.launch(BrowserType.CHROME);
        browser.navigate("https://www.edgewordstraining.co.uk/training-site");
    }

    @After
    public void tearDown() throws Exception {
        browser.closeAllTabs();
    }

    @Test
    public void test() throws GeneralLeanFtException {
        Link homeLink = browser.describe(Link.class, new LinkDescription.Builder()
                .innerText("Home ")
                .tagName("A").build());
        homeLink.click();

        Link basicHTMLLink = browser.describe(Link.class, new LinkDescription.Builder()
                .innerText("Basic HTML ")
                .tagName("A").build());
        basicHTMLLink.click();

        Link cSSXPathLink = browser.describe(Link.class, new LinkDescription.Builder()
                .innerText("CSS/XPath ")
                .tagName("A").build());
        cSSXPathLink.click();

        homeLink.click();

    }

}