package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

import java.sql.SQLException;
import java.util.List;


public class DBStepDefs {

    @Given("user connects to application database")
    public void user_connects_to_application_database() {
        DBUtils.createConnection();


    }

    @Given("user gets the column {string} from the table {string}")
    public void user_gets_the_column_from_the_table(String columnName, String tableName) {
        //    DBUtils.executeQuery("Select * FROM jhi_user");  // HARD CODED
        DBUtils.executeQuery("Select" + columnName + " FROM " + tableName);


    }

    @And("close the database")
    public void closeTheDatabase() {
        DBUtils.closeConnection();

    }


    @And("user read all column {string} data")
    public void user_read_all_column_data(String columnName) throws SQLException {
        DBUtils.getResultset().next(); // cheking if the data exists or not

        // Get the data
        Object obj1 = DBUtils.getResultset().getObject(columnName);
        System.out.println("obj1 = " + obj1);
        // -----------------------------------------------------------
        DBUtils.getResultset().next(); // to move to the next data from the database, you must use next() method
        Object obj2 = DBUtils.getResultset().getObject(columnName);
        System.out.println(obj2);

        // -----------------------------------------------------------
        DBUtils.getResultset().next(); // to move to the next data from the database, you must use next() method
        Object obj3 = DBUtils.getResultset().getObject(columnName);
        System.out.println(obj3);
        // -----------------------------------------------------------
        // To go to a specific row
        DBUtils.getResultset().absolute(4); //
        Object obj4 = DBUtils.getResultset().getObject(columnName);
        System.out.println(obj4);
        // -----------------------------------------------------------
        // Using while loop
        int rowNum = 8;
        while (DBUtils.getResultset().next()) {
            Object currentRowData = DBUtils.getResultset().getObject(columnName);
            System.out.println(rowNum + " : " +currentRowData);
            rowNum++;
        }

        System.out.println("There are " + rowNum + " data in the" + columnName + " column");



    }

    @Then("verify table {string} and column {string} contains {string}")
    public void verify_table_and_column_contains(String tableName, String columnName, String data) {

    List<Object> allColumnData =  DBUtils.getColumnData("SELECT "+columnName +" FROM" + tableName , "login");
        System.out.println("allColumnData = " + allColumnData);

        Assert.assertTrue(allColumnData.contains(data));


    }
}
