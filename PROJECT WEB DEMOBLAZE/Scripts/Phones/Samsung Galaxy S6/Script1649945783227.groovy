import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.demoblaze.com/')

WebUI.click(findTestObject('DEMOBLAZE/Phones/Samsung Galaxy S6/Page_STORE/a_Log in'))

WebUI.setText(findTestObject('DEMOBLAZE/Phones/Samsung Galaxy S6/Page_STORE/input_Username_loginusername'), 'Ali12345')

WebUI.setEncryptedText(findTestObject('DEMOBLAZE/Phones/Samsung Galaxy S6/Page_STORE/input_Password_loginpassword'), 'T2f+EhbY9lxWCo62oSDqfg==')

WebUI.click(findTestObject('DEMOBLAZE/Phones/Samsung Galaxy S6/Page_STORE/button_Log in'))

WebUI.click(findTestObject('DEMOBLAZE/Phones/Samsung Galaxy S6/Page_STORE/a_Phones'))

WebUI.click(findTestObject('DEMOBLAZE/Phones/Samsung Galaxy S6/Page_STORE/a_Samsung galaxy s6'))

WebUI.click(findTestObject('DEMOBLAZE/Phones/Samsung Galaxy S6/Page_STORE/a_Add to cart'))

WebUI.click(findTestObject('DEMOBLAZE/Phones/Samsung Galaxy S6/Page_STORE/a_Cart'))

WebUI.click(findTestObject('DEMOBLAZE/Phones/Samsung Galaxy S6/Page_STORE/button_Place Order'))

WebUI.setText(findTestObject('DEMOBLAZE/Phones/Samsung Galaxy S6/Page_STORE/input_Name_name'), 'Ali')

WebUI.setText(findTestObject('DEMOBLAZE/Phones/Samsung Galaxy S6/Page_STORE/input_Country_country'), 'Malaysia')

WebUI.setText(findTestObject('DEMOBLAZE/Phones/Samsung Galaxy S6/Page_STORE/input_City_city'), 'Bayan Lepas')

WebUI.setText(findTestObject('DEMOBLAZE/Phones/Samsung Galaxy S6/Page_STORE/input_Credit card_card'), '123')

WebUI.setText(findTestObject('DEMOBLAZE/Phones/Samsung Galaxy S6/Page_STORE/input_Month_month'), '12')

WebUI.setText(findTestObject('DEMOBLAZE/Phones/Samsung Galaxy S6/Page_STORE/input_Year_year'), '2024')

WebUI.click(findTestObject('DEMOBLAZE/Phones/Samsung Galaxy S6/Page_STORE/button_Purchase'))

WebUI.click(findTestObject('DEMOBLAZE/Phones/Samsung Galaxy S6/Page_STORE/button_OK'))

