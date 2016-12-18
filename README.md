# Teach-Programming

[![Join the chat at https://gitter.im/Programming-101/Lobby](https://badges.gitter.im/Programming-101/Lobby.svg)](https://gitter.im/Programming-101/Lobby?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)
Students look enthusiastic right now. Let's see how it pans out. Mostly but not limited to Java

#Getting Started
1. Install Ubuntu
2. Install Java,git and sublime-text on ubuntu
3. <i><b>Optional</b></i> Install Oh My Zsh on Ubuntu
4. Setup an account on github
5. Setup SSH key for github (password-less login)

#Read-Up (Brief)
1. About git - branch, branching, clone, fork, stash, commit, push, pull, etc.
2. What are environment variables? Where are they set in Ubuntu? bashrc/bash_profile? zsh/bash? Have you setup JAVA_HOME?
3. Compiler/Interpreter?
4. Data-Structures
5. OOP

Approach the problems when you can make programs like "Hello world". Print a series (1,3,5,7,9). Take input from user and do something with it. Print sum/product of a series based on user input.

#Guidelines for submission
1. When pushing your branch, make sure your personal branch is in sync with master. To do so commit your local changes in your personal branch, checkout to master, pull later master, checkout to your personal branch again and then merge master to your branch. There are obviously shorter ways to do it. I leave it you to figure that out. (Keeping your branch in sync with master is essential. Don't contaminate the master branch for any reason)
2. The Readme.md file in each problem directory is not there for nothing. Feel free to share in a few lines the approach/logic you used to solve the problem. It's not mandatory, but I would really appreciate your effort. If you end up adopting this practice though, make sure your english is proper.
3. Make sure you only commit your .java file and nothing else. Please don't include .class files in the problem directories. The problem directory should have nothing except your code and the updated Readme.md file. Dont add files to commit blindly. Check waht you want to add. You can always use the "git diff" feature to compare the edits and different versions of files. Feel free to explore about it.
4. With every "git fetch origin" the terminal will show the files where changes were reflected. Make it a habit to keep your local master in sync with remote.

#Problem 1
WAP in Java to input a number and test whether it's a palindrome or not.

#Problem 2
WAP in Java to input a string say - "BOND IS DEAD" and encode and print it as - 
`BID$OSE$N*A$DD$**$` </br>

<b>Hint</b> - 
<table>
<tr>
  <td>B</td>
  <td>I</td>
  <td>D</td>
  <td>$</td>
</tr>
<tr>
  <td>O</td>
  <td>S</td>
  <td>E</td>
  <td>$</td>
</tr>
<tr>
  <td>N</td>
  <td>*</td>
  <td>A</td>
  <td>$</td>
</tr>
<tr>
  <td>D</td>
  <td> </td>
  <td>D</td>
  <td>$</td>
</tr>
<tr>
  <td>*</td>
  <td> </td>
  <td>*</td>
  <td>$</td>
</tr>
</table>

#Problem 3
Given an encrypted string as in above, output the original string. Print error message if the string is faulty

#Primer
Change the code you wrote above. Use separation of concerns. Separate Repeated code in methods.

#Problem 4
WAP to define a class named "Student" which models a student with the following characterstics - 
1. Name
2. Marks in 5 subjects
3. Roll Number
4. Percentage

Input values for n number of students (given by user, both n and the individual values), and print the topper in each subject, and the overall topper.
Think about the methods you will implement to follow the Don't Repeat Yourself principle (DRY)

#Problem 5
WAP to model a class "Grade" which contains students which have a name and a gross percentage. Print the topper for the grade. All inputs related to the students should be user-driven.
