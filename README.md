Read Me
====================
This is program evaluate the sorted minimal cover given sets of pair of dates. Everything seems to be working in order 
although its implementation is not exactly as instructed. Also note that it will only works if the dates overlap, otherwise the output will be false. Nonetheless, the output should be correct, no logical error
is present as far as I can tell. To test the program, simply enter the appropriate inputs in the TimeArray under the start() method. 


What is the time complexity of the algorithm? N is the number of pair of dates (Start and end). Min number for N is 2 and 
it has to be a multiple of 2 (Due to pairing). Time complexity = 9 + (N(3(number between 1 to 4 inclusive)), N is the number 
of pair of dates (Start and end). Min number for N is 2 and it has to be a multiple of 2 (Due to pairing).

Best case scenario = Earliest time and latest time is the first pair. = 9(N(3(1))) = 27N (linear)

Worst case scenario = the start date gets earlier and the end date gets later one after another = 9(N(3(4))) = 108N (linear)

What data format checks should you implement to make the code robust? 

Robust code = Code that can take wide scope of input. 
In this case, a function that checks whether the validity of the date. For example the function should accept 12/3/2004 and 
should reject -33/15/911104. If the month is passed on to the function as a string, a function that checks whether the string 
input is a valid month should be included. Furthermore, the converion of the string input to lowercase characters to avoid
confusion may increase the robustness of the code. The test function should also include if the two pair of dates are entered and the first has to be earlier and the second has to be the latter. 

