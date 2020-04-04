# CoolCompiler
THis repository is for 4th grade CE shoubra compiler  project


# Cool syntax
  

 - syntax image

     ![](https://i.ibb.co/3YDbcv0/image.png)
     
# Tools needed
  1. JAVA IDE (neatbeans, eclipse or intillIJ)
    ![IDE screenshoot](https://i.ibb.co/NChwWRR/image.png)
    
  2. ANTLAR4 (plugin for IDE) 
    [website](https://www.antlr.org/)
    use [regex](https://regexr.com/) to generte tokens 
    ![Antlar](https://i.ibb.co/k4ZRsYn/image.png)
    
  
# Testing
There are two tests
1. **Free error file**
  -  go to `src/Main.java` in line 3 change line to 
  ```java
    String inputFile = "good.cl";
  ```
 the output will be file in `./good.cl-lex` which contains Tokens
 
 ![sample](https://i.ibb.co/sP4TFtf/image.png)
 
 
 2. **File contain syntax error**
 
 -  go to `src/Main.java` in line 3 change line to 
  ```java
    String inputFile = "bad.cl";
  ```
  
  JVM will throw exeption to output console 
  ![exeption](https://i.ibb.co/7KH1tTB/image.png)
  
    

