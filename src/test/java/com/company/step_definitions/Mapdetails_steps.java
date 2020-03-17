package com.company.step_definitions;

import com.company.pages.MapRoom;
import com.company.pages.Sign_In;
import com.company.utilities.BrowserUtils;
import com.company.utilities.DBUtils;
import com.company.utilities.DriverUtil;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Mapdetails_steps {
    WebDriver driver;
    ResultSet resultset;

    @Given("User is in the login page")
    public void user_is_in_the_login_page() {
        driver = DriverUtil.getDriver();
        driver.get("https://cybertek-reservation-qa.herokuapp.com/sign-in");
    }

    @When("User logs in with username {string} and password {string}")
    public void user_logs_in_with_username_and_password(String string, String string2) {
        Sign_In sign_in = new Sign_In();
        sign_in.login(string, string2);
    }

    @Then("User should be able to see {string} room")
    public void user_should_be_able_to_see_room(String string) {
        MapRoom mapRoom = new MapRoom();
        BrowserUtils.waitForVisibility(mapRoom.pingPongRoom);
        Assert.assertTrue(mapRoom.pingPongRoom.isDisplayed());
        Assert.assertEquals(mapRoom.pingPongRoom.getText(), string);
    }

    @Then("In DB I should see the {string} room")
    public void in_DB_I_should_see_the_room(String string) throws Exception {
        ResultSet res = DBUtils.runSQLQuery("Select *from room");
        List<String> allRoomName = new ArrayList<>();
        while (res.next()) {
            allRoomName.add(res.getString("name"));
        }
        System.out.println(allRoomName);
        Assert.assertTrue(allRoomName.contains(string));
        DBUtils.destroy();
    }


}

















