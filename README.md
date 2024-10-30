# Devoteam Robot-Assignment-Backend
This is my implementation of Devoteam's test Robot-Assignment-Backend. 

After learning that I had more time than I first thought, I've made two development iterations. 

The first iteration, to get everything working along with unit tests. I made an improvement list after this iteration, below called "Improvement to be done after first iteration".

The second iteration, I focused on fixing some things from "Improvements to be done after first iteration", please find the description of the changes under "Changelog".
## Usage
The controller is set to run once. If you like it to run continuously, comment out line 28 of the class Main.

Either run the Application or the tests. In IntelliJ, right-clicking the folder or class you would like to run and click "Run '..."
## Improvements to be done after first iteration
1. I would like to conduct more refactoring and clean up of the source code. The OOP could be improved. 
2. I have made 10 Unit Tests, some for each logic class but this should be extended to test all scenarios. In RobotTest class I made three negative tests, the other Unit Tests are positives.
3. I would also like to set up E2E test to test the complete flow. 
4. I would need to spend more time on the ErrorHandling and probably redo it. It could have been a lot better. 
## Changelog
1. I've not done too much refactoring, so this remains.
2. The 3 negative tests, I intentionally failed by adding System.exit(1) in the source code and where thereby needed to rewrite them to assert on the System.exit(1) without ending the program. 
I also created tests for the ReadAndSet class.
3. I also made an E2E test from main containing simulated Scanner input. 
4. All together I would say I have improved the ErrorHandling and in some cases redone it. 
## Improvement to be done after second iteration 
1. Refactor and improve OOP.
2. More unit tests could be done to cover all functions. Other types of tests could also be implemented. 
3. Thinking back to the assignment describing that this is a controller for a robot (part of something bigger), this perhaps should have been a Micro Service instead of Monolithic Architecture.
