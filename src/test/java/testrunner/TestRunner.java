package testrunner;
WHEEL OF LIFE page 1111
Tie User click   "add  goal +" button  --> Tie User can add a goal and that goal should be   minimun of 2 main goal and max of 3 main goal but the condition is  weightage should be 100 . 
Each main goal have n no of sub goal but the condition is  weightage should be 100 .
 Goal has input like spoke drop down list box  , current  drop down list box , target drop down list box  , main goal 1(toggle), main goal 2(toggle) , and one add new main goal + button and last  ADD GOAL button and cancel button .


spoke drop down list box  has  input  --  family , Personal growth , Health, Business/career,personal finance,spirtual pursuits,Fun&hobbies,Giving Back ..  Tie User must select one fields manatorly .

 current  drop down list box input --> 1,2,3,4,5,6,7,8,9,10.  all fields manatory

 target drop down list box input --> 1,2,3,4,5,6,7,8,9,10.  all fields manatory  condition (current  drop down list box input <  target drop down list box input)

Tie User click main goal 1 toggle input --> main goal titile , weightahe (%) , description ,Add sub goal +. all 3 fields manatory except add subgoal+


Tie User can add sub goal later or can add in this page also .

sub Goal input is --> title , weightage , description , duration (in weeeks )  should be less than or equal to 52 , Days chek list like sunday to monday .   all fields manatory in Days check list Tie User can click on which day we sumbit the reports  like monday or wednesday , any 3 days or even all 7 days .  

after sumbit all details Tie User can click ADD GOAL button .  Then Goal is sucessfully added .

If Tie User wants to cancel the ADD GOAL page then click CANCEL button . 




WHEEL OF LIFE page   2222
Details tab --  Its shows Spoke name , no of Main Goal, Status, Action .

status has four option --> NOT STARTED,COMPLETED,PROGRESSED,NOT PROGRESSED.
By default it shows only NOT STARTED status.


If Tie User click the Year in filter box then remain all three status will be showed .


After creating the goal by Tie User then Admin need to start the Tie User goal .
Then status is changed from NOT STARTED to NOT PROGRESSED.

If Tie User  submint any  sub goal reports Then status is changed from NOT PROGRESSED to PROGRESSED.

If Tie User  submint all  sub goal reports Then status is changed from PROGRESSED to COMPLETED .

If Tie User click any action button , it navigate to GOAL DETAILS . In this window Tie User can add sub goals .



WHEEL OF LIFE page   33333
if Tie user click .
Graph  tab --  Its shows  Required graph in details .



WHEEL OF LIFE page  4444444
In Tie Admin  Log in .It will display Personal Board,Member,Goal,Status,Action


status has four option --> NOT STARTED,COMPLETED,PROGRESSED,NOT PROGRESSED.
By default it shows only NOT STARTED status.

If status = NOT STARTED ,  then Tie Admin can click action Icon button . it navigate to 
GOAL DETAILS page . Then select Details tab Check all the goal and click start button .
Then status is changed from NOT STARTED to NOT PROGRESSED.

if Tie Admin  click .
Graph  tab --  Its shows  Required graph in details of all User and groups  .

If Tie Admin click the Year in filter box then remain all three status will be showed .





 



import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.reports.JvmReports;

import cucumber.api.java.After;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( features="C:\\Users\\User\\eclipse-workspace\\cumcumberflipkart\\src\\test\\resources\\featurefile\\flipkart.feature",

plugin = {"html:C:\\Users\\User\\eclipse-workspace\\cumcumberflipkart\\Reports\\Html",
		
		"junit:C:\\Users\\User\\eclipse-workspace\\cumcumberflipkart\\Reports\\Junit\\junit.xml",
		"json:C:\\Users\\User\\eclipse-workspace\\cumcumberflipkart\\Reports\\Json\\json.son"
		
},
glue = "org.step")



public class TestRunner {
	
	@AfterClass
	public static void reports() {
		
		JvmReports.repotjvm("C:\\Users\\User\\eclipse-workspace\\cumcumberflipkart\\Reports\\Json\\json.son");

	}
	
	

}
