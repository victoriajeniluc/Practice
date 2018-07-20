# Importance of Test Driven Development 

**Test Driven Development(TDD)** 
	- emphasizes test-first development
	- GOAL: specification and not validation
		- AKA: one way to think through your requirements or design before you write your functional code (implying that TDD is both an important agile requirements and agil design technique)
	- ANOTHER GOAL: write clean code that works  
	- practice of writing a test for a piece of required functionality before writing any implementation code. 
		- Code should fail when first run, and then, you write code to get it to pass. It doens't have to be perfect.. just as long as it passes. Once it does, you can then safely refactor your code. 
	- it is a discipline, and as such you must try your best to not be tempted to write tests after you've written code. 

## Steps

	1. Add a test (basically enough test for your code to fail)
	2. Run your tests (often the complete test suite althrough for sake of speed you may decide to run only a subset to ensure that the new test does in fact fail)
	3. Update your functional code to make it pass the new tests.
	4. Run tests again.. if they fail, you need to update your functional code and retest until the tests pass

	SUMMARY: 
		- Write a test before you write just enough production code to fulfill that test 
		- Refactor the production code 
 
 [steps of writing tdd] (steps.png)

 ## Why should developers care of automated unit tests? 
 	* Keeps you out of the (time hungry) debugger!
 	* Reduces bugs in new features and in exisiting features 
 	* Reduces the cost of change 
 	* Improves design 
 	* Encourages refactoring 
 	* Builds a safety net to defend against other programmers 
 	* Is fun 
 	* Forces you to slow down to think 
 	* Speeds up development by eliminating waste 
 	* Reduces fear 

 ## How does TDD take development to the next level?
		Improves productivity by
			*minimizing time spent debugging
			*reduces the need for manual (monkey) checking by developers and tester
			*helping developers to maintain focus
			*reduce wastage: hand overs

				*Improves communication
				*Creating living, up-to-date specification
				*Communicate design decisions
				*Learning: listen to your code
				*Baby steps: slow down and think
				*Improves confidence
				*Testable code by design + safety net
				*Loosely-coupled design
				*Refactoring

		SUMMARY: 
			## TDD means less bugs, higher quality software, and a razor focus, but it can slow development down and the test suites can be tedious to manage and maintain.

## BENEFITS OF TDD
	1. Acceptance Criteria: 
		- Writing tests for required features... tests remind you of what work you have done and what you haven't done... so you won't miss any work needed 
 	2. Focus: 
 		- TDD helps keep that productivity high by narrowing your focus. You'll write one failing test, and focus solely on that to get it passing. 
 		- Forces you to think in smaller chunks of functionality at a time than the application as a whole 
 	3. Interfaces: 
 		- Writing a test first means you have to think about the public interface that other code in your application needs to integrate with. 
 	4. Tidier Code: 
 		- Making sure that your private methods are kept private and the public methods are made to be public 
 	5. Dependancies: 
 		- Writing tests.. you will be able to mock these out without really worrying about what they are really doing behind the scenes, which lets you focus on the logic within the class you're writing 
 	6. Safer Refactoring: 
 		- Once you got a test passing, it's then safe to refactor it, secure in the knowledge that the test cases have your back.... also it gives you confidence you won't break anything. 
 	7. Fewer Bugs: 
 		- With better code coverage, you save time down the line that would be spent on fixing bugs that have popped up and need time to figure out. Doesn't mean you'll get every bug.. but it prevents that bug from ever coming up when you write a test for it. 
 	8. Increasing Returns: 
 		- The cost to TDD is higher at first.. but it will cost more in the long run to fix the bugs. More time = more money which make sthe project more expensive overall. 
 	9. Living Documentation: 
 		- Tests can serve as documentation to a developer. With TDD, tests usually get written for different scenarios, one of which is probably how you want to use the class.   