import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.6.18:501/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/11111/Page_ERP/input_Login_LoginName'), username)

WebUI.setText(findTestObject('Object Repository/11111/Page_ERP/input_Login_Password'), password)

WebUI.setText(findTestObject('Object Repository/11111/Page_ERP/input__submit__input'), '4')

WebUI.click(findTestObject('Object Repository/11111/Page_ERP/button_Sign in'))

WebUI.click(findTestObject('Object Repository/11111/Page_iERP Suite/a_Employee Self Service'))

WebUI.click(findTestObject('Object Repository/11111/Page_iERP Suite/a_Leave Request'))

WebUI.click(findTestObject('Object Repository/11111/Page_iERP Suite/input_Leave Request Details_New Leave Request'))

WebUI.click(findTestObject('Object Repository/11111/Page_iERP Suite/span_000851  DIPAK  DEBNATH'))

WebUI.click(findTestObject('Object Repository/11111/Page_iERP Suite/li_000851  DIPAK  DEBNATH'))

WebUI.click(findTestObject('Object Repository/11111/Page_iERP Suite/a_-Select-'))

WebUI.click(findTestObject('Object Repository/11111/Page_iERP Suite/li_LEAVE REQUEST'))

WebUI.click(findTestObject('Object Repository/11111/Page_iERP Suite/span_-Select-'))

//Casual Leave
//WebUI.click(findTestObject('Object Repository/CasualLEAVE_Gopi_LeaveRequest_Apply/Page_iERP Suite/li_CASUAL LEAVE'))
//Earned Leave
WebUI.click(findTestObject('Object Repository/ERP_LeaveRequest_EarnedLeave_Apply/Page_iERP Suite/li_EARNED LEAVE'))
//Half Pay Leave
//WebUI.click(findTestObject('Object Repository/HALF_PAY_LEAVE_Depak_LeaveRequest_Apply/Page_iERP Suite/li_HALF PAY LEAVE'))
//FULL PAY
//WebUI.click(findTestObject('RAKSHIT-FULLPAY/Page_iERP Suite/span_FULL PAY LEAVE'))
//WebUI.click(findTestObject('Object Repository/HALF_PAY_LEAVE_Depak_LeaveRequest_Apply/Page_iERP Suite/li__FULL PAY LEAVE'))


WebUI.click(findTestObject('datepicker/Page_iERP Suite/LeaveStartDate'))



String startDate = StartDate

println(startDate)

date = (startDate.split('/')[0])

mon = (startDate.split('/')[1])

year = (startDate.split('/')[2])

println(year)

//String cyear = WebUI.sendKeys(findTestObject('datepicker/Page_iERP Suite/year'), year)
String cmonth = WebUI.sendKeys(findTestObject('datepicker/Page_iERP Suite/month'), mon)

WebDriver driver = DriverFactory.getWebDriver()

dateEle = driver.findElements(By.xpath('//a[@class=\'ui-state-default\']'))

for (WebElement e : dateEle) {
    System.out.println(e.getText())

    if (e.getText().equals(date)) {
        e.click()

        break
    }
}

WebUI.click(findTestObject('datepicker/Page_iERP Suite/input__LeaveEndDate'))

String endDate = EndDate

date1 = (endDate.split('/')[0])

mon1 = (endDate.split('/')[1])

year1 = (endDate.split('/')[2])

println(year1)

//String cyear1 = WebUI.sendKeys(findTestObject('datepicker/Page_iERP Suite/year'), year1)
String cmonth1 = WebUI.sendKeys(findTestObject('datepicker/Page_iERP Suite/month'), mon1)

dateEle1 = driver.findElements(By.xpath('//a[@class=\'ui-state-default\']'))

for (WebElement e1 : dateEle1) {
    System.out.println(e1.getText())

    if (e1.getText().equals(date1)) {
        e1.click()

        break
    }
}

WebUI.setText(findTestObject('Object Repository/11111/Page_iERP Suite/textarea__LeaveReason'), 'reason')

//pdf
WebUI.uploadFile(findTestObject('ERP_LeaveRequest_EarnedLeave_Apply/Page_iERP Suite/input__file'), 'C:\\Users\\DevSys002\\Pictures\\Screenshots')

WebUI.scrollToPosition(0, 500)

WebUI.click(findTestObject('Object Repository/CasualLEAVE_Gopi_LeaveRequest_Apply/Page_iERP Suite/button_Choose Action'))

