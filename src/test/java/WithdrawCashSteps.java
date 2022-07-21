import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

public class WithdrawCashSteps {
    int balance, requestAmount;
    @Given("I have a balance of ${int} in my account")
    public void iHaveABalanceOf$InMyAccount(int arg0) {
        balance = arg0;
    }

    @When("I request ${int}")
    public void iRequest$(int arg0) {
        requestAmount = arg0;
    }

    @Then("${int} should be dispensed")
    public void $ShouldBeDispensed(int arg0) {
        int remainingBalance = balance - requestAmount;
        System.out.println(remainingBalance);
        int dispensedAmount = arg0;
        assertEquals(dispensedAmount, requestAmount);
    }

}
