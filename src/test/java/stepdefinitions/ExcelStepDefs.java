package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.DataTable_HomePage;
import utilities.BrowserUtils;
import utilities.ExcelUtils;

import java.util.List;
import java.util.Map;

public class ExcelStepDefs {

    DataTable_HomePage dataTableHomePage;

    List<Map<String, String>> dataList;

    ExcelUtils excelUtils;

    @Given("user enters {string} from {string} excel sheet and verify the user is created")
    public void user_enters_from_excel_sheet_and_verify_the_user_is_created(String sheetName, String fileName) {

        excelUtils = new ExcelUtils(sheetName, fileName);

        dataList = excelUtils.getDataList();
        System.out.println("dataList = " + dataList);

        // Test STARTS NOW

        // In order to get the data one by one from dataList, we need to pass it through the loop and change its data type from
        //list to map, so we can manipulate it as through key:value
        for (Map<String, String> eachData : dataList) {
            System.out.println("eachData = " + eachData);

            BrowserUtils.clickWithTimeOut(dataTableHomePage.newButton, 1);
            BrowserUtils.sendKeysWithTimeout(dataTableHomePage.firstName, eachData.get("first_name"), 1);
            BrowserUtils.sendKeysWithTimeout(dataTableHomePage.lastName, eachData.get("last_name"), 1);
            BrowserUtils.sendKeysWithTimeout();

        }


    }

}