package stepdefinitions;

import com.mongodb.DB;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import utilities.DBUtils;

import java.sql.SQLException;
import java.util.List;

public class DBStepDefs {

    @Given("user connects to application database")
    public void user_connects_to_application_database(){
        DBUtils.createConnection();


    }

    @Given("user gets the column {string} from the table {string}")
    public void user_gets_the_column_from_the_table(String columnName, String tableName) {
    //    DBUtils.executeQuery("Select * FROM jhi_user");  // HARD CODED
        DBUtils.executeQuery("Select" +columnName+" FROM "+tableName);


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


    }
}
