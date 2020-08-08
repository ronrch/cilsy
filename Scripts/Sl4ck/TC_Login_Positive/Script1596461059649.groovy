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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('Sl4ck/Lnk_Sign_In'))

WebUI.verifyElementPresent(findTestObject('Sl4ck/Ttl_Sign_In'), 0)

WebUI.verifyMatch('https://slack.com/signin', 'https://slack.com/signin', false)

WebUI.setText(findTestObject('Sl4ck/Txt_Workspace'), GlobalVariable.workspace)

WebUI.click(findTestObject('Sl4ck/Btn_Continue'))

WebUI.setText(findTestObject('Sl4ck/Txt_Email'), 'ronnrch@gmail.com')

WebUI.setEncryptedText(findTestObject('Sl4ck/Txt_Password'), '5TQD45FPlIyFrrnhhWeK9Q==')

WebUI.click(findTestObject('Sl4ck/Btn_Sign_In'))

WebUI.verifyElementPresent(findTestObject('Sl4ck/Tlt_Sekolah'), 0)

