package com.automation.Tests.OutpostTest;

public class OutpostTestFile extends AbstractTest {
    private OutpostTestData testData;

    @BeforeTest
    @Parameters({"testDataPath"})
    public void setParameters(String testDataPath) {
        this.testData = JsonUtil.getTestData(testDataPath);
    }

    @Test
    public void loginPage() {

    }
}