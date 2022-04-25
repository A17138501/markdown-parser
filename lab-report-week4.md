# Lab Report Week4 #

## First Code Change
1. a screenshot of the code change diff from Github

![image](https://user-images.githubusercontent.com/97008935/165000464-0f15d2b5-562a-4f30-9e30-d4c0e06390cb.png)

2. Link to the test file for a failure-inducing input that prompted you to make that
change

[link](https://github.com/A17138501/markdown-parser/edit/main/test-file.md)

3. Show the symptom of that failure-inducing input by showing the output of
running the file at the command line for the version where it was failing


![image](https://user-images.githubusercontent.com/97008935/165002034-8f03252d-fba6-44f4-9e9e-9cb6b22924e1.png)

4. Description for the bug, failiur input and symptom.

The reason why i have this bug is that in my test file which is my failur input, my file have an empty line, which open Bracket can not be found so that if we use markdown.indexOf("[", currentindex) it will return -1 and current index will always be less than mark.length(),the while loop can not stop and links will not be print out either. what i did to solve this problem is that i use a if statement taht if open bracket equal to -1, whcih means open bracket can not be found. I will forece the while loop to break. 


## Second Code Change

1. a screenshot of the code change diff from Github

2. Link to the test file for a failure-inducing input that prompted you to make that
change

3. Show the symptom of that failure-inducing input by showing the output of
running the file at the command line for the version where it was failing

4. Description for the bug, failiur input and symptom.


## Third Code Change

1. a screenshot of the code change diff from Github

2. Link to the test file for a failure-inducing input that prompted you to make that
change

3. Show the symptom of that failure-inducing input by showing the output of
running the file at the command line for the version where it was failing

4. Description for the bug, failiur input and symptom.


