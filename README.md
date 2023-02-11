# Java Fundamental

---
### Intro

In this repo we'll discuss about java as a tools for explaining computational thinking. I think we should start by how to form think procedural like computer does. Today, computer "seems" like most powerful tools that human have. But, its opposite, computer is the most dumbest thing ever we should teach them to do something for us. by speak like they do.

So, in this repo we will summarize how to speak with computer to do what we ask for. Start from learn how they think.

---
### General Rules

I will try to make this repo as a discussion forum. This repo would accomondate us all of your question about the lecturer, provide problem set, and about updating the references.


1. **Q&A** <br/>

First, if you have any question about the lecturer then start the discussion by opening issue. Issue is on your left-top screen under this repo name ```fandikaikhsan/java``` then you click **Create new issue**

<img width="1150" alt="image" src="https://user-images.githubusercontent.com/27040077/218235441-8f8f6f3c-0cf9-49b3-a6e9-0353e8d27b10.png">

Mark it with tags ```[QA]``` before your questions and select label as a ```question``` (the purple one). More about creating an issues please refer to this example: https://github.com/fandikaikhsan/java/issues/1.

I will check the forum periodicly any anwers will be provided on the comment section. Of course you can help your friends too by providing on the comment section and right answers should be marked by give an emoji on it.

<img width="836" alt="image" src="https://user-images.githubusercontent.com/27040077/218235975-c504c125-85c0-4c50-804c-155a9dc096a5.png">


2. **Problem set** <br/>

Also I will update the exercise problems in ```/problems/sets```  or you simply take a look on table below for each content there will be sets of problem. Then after you made your answer, you should put your answer by commiting and pushing your answer to Github and write it on a single branch called:

```answer/{sets}-{problem_num}-{your_name}```

So for example if I want to answer problem no 5 in sets 2, then I will create a branch called:

```answer/2-5-fandikaikhsan```

Then you should open pull request to branch called ```problem/answers``` with PR title: ```{[SETS_NUM]}: {Your_PR_messages}``` and peers will comment to your PR to discuss about the topics or to assess your answer.

<img width="287" alt="image" src="https://user-images.githubusercontent.com/27040077/218236471-11d3741d-2c7b-4101-b02b-30b5da1e4be9.png">


3. **Updating references** <br/>

And I also realy encourage you to also refine our documents here by writing your understanding in with your own terms. If you have any input or your own version revision, just open the issue and tag-it with ```docs```.

For references I also always update this docs if theres is any good references or good problem to resolve, I also write our TLDR as a summary to next lecturer.

---
### Contents


Content | Topics | Problem | Day
:-- | :--: | :--: | :--:
Introduction | Intro, Computational thinking, and Try it with Scratch app | [Scratch games](https://github.com/fandikaikhsan/java/blob/main/problems/sets/0/prob.md) | 1 |
Preparing our tools: Intro to Java | What is Java, Install Java on your machine, Hello world, Versioning, Using Github as versioning tools | [Versioning](https://github.com/fandikaikhsan/java/blob/main/problems/sets/1/prob.md) | 2 |
Basic functionality | Defining variable, Data types, Conditional, Looping | [Logical](https://github.com/fandikaikhsan/java/blob/main/problems/sets/2/prob.md) | 3-4 |
More functionality... | Function, Solving problem | [Logical](https://github.com/fandikaikhsan/java/blob/main/problems/sets/2/prob.md) | 4-5
Deeper OOP | OOP with analogies, OOP concepts, Class, Object | [OOP concepts](https://github.com/fandikaikhsan/java/blob/main/problems/sets/3/prob.md) | 6 |
More OOP | Interfaces, Package, More OOP | OOP handson problem | 7 |
Deeper concepts | Algorithm, Data structure, Memory | ... | 7 or 8 |
Hello world | How internet works?, Start with HTML | HTML problem, API Spec | 8 or 9 |
Create your first project | Intro to Springboot, Design your API, Hands on your API | API Code | conditional |
Show us your project | Presentation! | ... | conditional |

---
### Resources

I provide several reverences for your futher reading. Our main referances comes from University of Massachusetts Amherst: https://people.cs.umass.edu/~elm/Teaching/121_S12/syllabus.html then I also refer to Harvard courses to provide algorithm concepts here: https://cs50.harvard.edu/x/2023/weeks/3/, for syntax references comes from this article: https://www.geeksforgeeks.org/java-basic-syntax/

If you have any good references, please open an issue and also set as ```docs``` tags. If there is any slides uses in the sync activities will be provided here in the future.

---

# TLDR

### What is Java

Java is a high-level programming language that is widely used for developing applications for desktop, web, and mobile devices. Java is object-oriented, meaning it allows programmers to define objects and classes that can be used to represent real-world entities and their properties and behaviors.

One of the main benefits of Java is that it can run on a wide variety of platforms, including Windows, MacOS, and Linux. This is made possible by the Java Virtual Machine (JVM), which interprets compiled Java code and executes it on the underlying hardware. The JVM also provides security features that prevent malicious code from compromising the system.

Another key tool for Java developers is the Java Development Kit (JDK), which includes the JVM and a set of tools for compiling and debugging Java code. The most popular Integrated Development Environment (IDE) for Java is Eclipse, which provides a comprehensive set of tools for coding, testing, and deploying Java applications.

To get started with Java, you need to first install the JDK on your computer. The installation process is straightforward, and there are versions available for Windows, MacOS, and Linux. Here are the steps to install the JDK on a Windows machine:

Download the latest JDK from the official Oracle website (https://www.oracle.com/java/technologies/javase-downloads.html).
Run the downloaded setup file.
Follow the on-screen instructions to complete the installation process.
Verify that the JDK has been installed correctly by opening a command prompt and typing "java -version". You should see the version of Java that you have installed.
Once you have installed the JDK, you are ready to start coding in Java! You can use an IDE like Eclipse, or a simple text editor, to write your code. Java code is saved with a ".java" file extension, and must be compiled into bytecode before it can be executed by the JVM.

In conclusion, Java is a powerful and versatile programming language that is widely used for developing applications. With the JVM, JDK, and Eclipse, you have all the tools you need to start coding in Java and building your own applications.

### 
