# CoolCompiler

THis repository is for 4th grade CE shoubra compiler project

# Cool syntax

-   syntax image
    
    [![](https://camo.githubusercontent.com/33aef7dcd2dc25a4d7537b53b5fbd08f7c1ff849/68747470733a2f2f692e6962622e636f2f335944626376302f696d6167652e706e67)](https://camo.githubusercontent.com/33aef7dcd2dc25a4d7537b53b5fbd08f7c1ff849/68747470733a2f2f692e6962622e636f2f335944626376302f696d6167652e706e67)
    

# Tools needed

1.  JAVA IDE (neatbeans, eclipse or intillIJ) [![IDE screenshoot](https://camo.githubusercontent.com/84d0fc2d0c7cd48e1153787600aef31d2c359bf3/68747470733a2f2f692e6962622e636f2f4e4368775752522f696d6167652e706e67)](https://camo.githubusercontent.com/84d0fc2d0c7cd48e1153787600aef31d2c359bf3/68747470733a2f2f692e6962622e636f2f4e4368775752522f696d6167652e706e67)
    
2.  ANTLAR4 (plugin for IDE) [website](https://www.antlr.org/) use [regex](https://regexr.com/) to generte tokens [![Antlar](https://camo.githubusercontent.com/cd84d44c43b017d522b9176ddbf9a072ba465b0b/68747470733a2f2f692e6962622e636f2f6b345a5273596e2f696d6167652e706e67)](https://camo.githubusercontent.com/cd84d44c43b017d522b9176ddbf9a072ba465b0b/68747470733a2f2f692e6962622e636f2f6b345a5273596e2f696d6167652e706e67)
    

# Testing

There are two tests

1.  **Free error file**

-   go to `src/Main.java` in line 3 change line to

  String inputFile = "good.cl";

the output will be file in `./good.cl-lex` which contains Tokens

[![sample](https://camo.githubusercontent.com/9bd64da9d77fa82a99e8e51a7c7f90e802259474/68747470733a2f2f692e6962622e636f2f735034544674662f696d6167652e706e67)](https://camo.githubusercontent.com/9bd64da9d77fa82a99e8e51a7c7f90e802259474/68747470733a2f2f692e6962622e636f2f735034544674662f696d6167652e706e67)

2.  **File contain syntax error**

-   go to `src/Main.java` in line 3 change line to

  String inputFile = "bad.cl";

JVM will throw exeption to output console [![exeption](https://camo.githubusercontent.com/dc89bc80b7f6d51b1a7c50d43511ca6d33b41ab9/68747470733a2f2f692e6962622e636f2f374b48317454422f696d6167652e706e67)](https://camo.githubusercontent.com/dc89bc80b7f6d51b1a7c50d43511ca6d33b41ab9/68747470733a2f2f692e6962622e636f2f374b48317454422f696d6167652e706e67)

## COOL Parser
we have two different files 
1. file contains syntax error and found in `testCases/badParser.cl`
![enter image description here](https://i.ibb.co/PFz4bcs/image.png)
To run this file in parser 
change file path in main class To ```java String srcFile = "TestCases/badParser.cl";```

2. file with no errors and found in `testCases/goodParser.cl`
![](https://i.ibb.co/TK2r5f1/image.png)To run this file in parser 
change file path in main class To ```java String srcFile = "TestCases/goodParser.cl";```
## Output
1. bad Parser file will throw an exception in console 
![](https://i.ibb.co/QYYMdSc/image.png)
and output file generated in `badParser.cl-lex`

2. good parser file will throw no exception
![](https://i.ibb.co/Bnsh50G/image.png)
and 2 output files will be generated
	1. 1st file is `TestCases/goodParser.cl-lex`
	2.  2nd file is `TestCases/goodParser.cl-cst`
	![](https://i.ibb.co/HVJhzWX/image.png)

