package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utills.MethodHandels;
import java.util.List;

public class HomePage extends MethodHandels {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    private final By adminLink = By.linkText("Admin");
    private final By totalRows = By.cssSelector(".oxd-table-row.oxd-table-row--with-border");
    private final By addButton = By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]");
    private final By userRoleField = By.xpath("(//div[@class=\"oxd-select-text--after\"])[1]");
    private final By chooseFromOption = By.xpath("//div[@role='listbox']//span[text()='Admin']");
    private final By employeeNameInput = By.xpath("//label[text()='Employee Name']/following::input[1]");
    private final By chooseFromEmployeeName = By.xpath("//div[@role='option']//span[text()='Ranga  Akunuri']");
    private final By status = By.xpath("(//div[@class=\"oxd-select-text--after\"])[2]");
    private final By chooseFromStatusOptions = By.xpath("//div[@role='listbox']//span[text()='Enabled']");
    private final By userName = By.xpath("//label[text()='Username']/following::input[1]");
    private final By passwordField = By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[2]");
    private final By confirmPasswordField = By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[3]");
    private final By saveButton = By.xpath("//button[@type=\"submit\"]");
    private final By deleteButton = By.xpath("(//div[@class=\"oxd-table-body\"] //button[@type=\"button\"])[1]");
    private final By confirmDelete = By.cssSelector(".orangehrm-modal-footer button:nth-child(2)");

    public void clickOnAdminLink() {
        click(adminLink);
    }

    public void addEmployee() {
        click(addButton);
    }
    private void enterEmployeeName() {
        sendKey(employeeNameInput, "a");
        click(chooseFromEmployeeName);
    }
    private void enterStatus() {
        click(status);
        click(chooseFromStatusOptions);
    }
    private void enterUserRole() {
        click(userRoleField);
        click(chooseFromOption);
    }

    public void fillRequireData() {
        enterUserRole();
        enterStatus();
        enterEmployeeName();
        sendKey(userName, "adeyousff");
        sendKey(passwordField, "Aa@100100");
        sendKey(confirmPasswordField,"Aa@100100");
        click(saveButton);
    }

    public void searchWithName() {
        sendKey(userName,"adeyousff");
        click(saveButton);
        click(deleteButton);
        click(confirmDelete);
    }


    public void numberOfRecords() {
        waitElements(totalRows,10);
        List<WebElement> countOfRows = driver.findElements(totalRows);
        int numberOfRecords = countOfRows.size() - 1;
        System.out.println("Number of records found: " + numberOfRecords);
    }
}
