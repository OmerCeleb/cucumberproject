package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import utilities.DBUtils;

public class DBStepDefs {

    @Given("user connects to application database")
    public void user_connects_to_application_database(){
        DBUtils.createConnection();


    }

    @Given("user gets the column {string} from the table {string}")
    public void user_gets_the_column_from_the_table(String columnName, String tableName) {
    //    DBUtils.executeQuery("Select * FROM jhi_user");  // HARD CODED
        DBUtils.executeQuery("Select * FROM jhi_user");  // HARD CODED

    }

    @And("close the database")
    public void closeTheDatabase() {
        DBUtils.closeConnection();

    }


}
