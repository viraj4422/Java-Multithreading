CS542 Design Patterns
Spring 2016
PROJECT 2 README FILE

Due Date: Monday, February 29, 2016
Submission Date: Monday, February 29, 2016
Grace Period Used This Project: 0 Days
Grace Period Remaining: N/A Days
Author(s): VIRAJ DILIP NIMBALKAR
e-mail(s): vnimbal1@binghamton.edu


PURPOSE:

To apply design principles for a simple multi-threaded application.

PERCENT COMPLETE:

As per my understanding, all the requirements for this assignment are getting completed. So 100% complete.

PARTS THAT ARE NOT COMPLETE:

I believe all the parts are completed.

BUGS:

None.

FILES:

Included with this project are 5 files:

Driver.java, the main file associated with the program also contains main
ResultInterface.java , interface for adding element to data Struture
Results.java which implements an interface
StdoutDisplayInterface.java java interface for printing element from data struture 
CreateWorkers.java which create workers.
WorkerThread.java which include run method for threads
FileProcessor.java which reads line by line from file.
FileProcessorInterface.java
IsPrime.java which test for prime numbers
Logger.java which uses debugValue to print appropriate messages.
README, the text file you are presently reading


SAMPLE OUTPUT:

remote06:~/cs542/viraj_nimbalkar_assign2> ant -buildfile src/build.xml all
Buildfile: /import/linux/home/vnimbal1/cs542/viraj_nimbalkar_assign2/src/build.xml

prepare:

primeThreads:
    [javac] Compiling 10 source files to /import/linux/home/vnimbal1/cs542/viraj_nimbalkar_assign2/BUILD/classes

compile_all:

all:

BUILD SUCCESSFUL
Total time: 4 seconds
remote06:~/cs542/viraj_nimbalkar_assign2>

remote06:~/cs542/viraj_nimbalkar_assign2> ant -buildfile src/build.xml run -Darg0=input.txt -Darg1=5 -Darg2=0
Buildfile: /import/linux/home/vnimbal1/cs542/viraj_nimbalkar_assign2/src/build.xml

jar:
      [jar] Building jar: /import/linux/home/vnimbal1/cs542/viraj_nimbalkar_assign2/BUILD/jar/primeThreads.jar

run:
     [java] The sum of all the prime numbers is: 25

BUILD SUCCESSFUL
Total time: 1 second
remote06:~/cs542/viraj_nimbalkar_assign2>
remote06:~/cs542/viraj_nimbalkar_assign2> ant -buildfile src/build.xml run -Darg0=input.txt -Darg1=5 -Darg2=10
Buildfile: /import/linux/home/vnimbal1/cs542/viraj_nimbalkar_assign2/src/build.xml

jar:

run:
     [java] Please provide DEBUG_VALUE between 0 and 4

BUILD SUCCESSFUL
Total time: 2 seconds
remote06:~/cs542/viraj_nimbalkar_assign2>

remote06:~/cs542/viraj_nimbalkar_assign2> ant -buildfile src/build.xml run -Darg0=input.txt -Darg1=15 -Darg2=1
Buildfile: /import/linux/home/vnimbal1/cs542/viraj_nimbalkar_assign2/src/build.xml

jar:

run:
     [java] Please provide number of threads in between 1 and 5

BUILD SUCCESSFUL
Total time: 2 seconds
remote06:~/cs542/viraj_nimbalkar_assign2>

remote06:~/cs542/viraj_nimbalkar_assign2> ant -buildfile src/build.xml run -Darg0=inpust.txt -Darg1=1 -Darg2=1
Buildfile: /import/linux/home/vnimbal1/cs542/viraj_nimbalkar_assign2/src/build.xml

jar:

run:
     [java] Unfortunately file 'inpust.txt'could not be opened !!
     [java] Java Result: 1

BUILD SUCCESSFUL
Total time: 2 seconds
remote06:~/cs542/viraj_nimbalkar_assign2>
remote06:~/cs542/viraj_nimbalkar_assign2> ant -buildfile src/build.xml run -Darg0=inpust.txt -Darg1=1 -Darg2=a
Buildfile: /import/linux/home/vnimbal1/cs542/viraj_nimbalkar_assign2/src/build.xml

jar:

run:
     [java] Debug Value should be integer!!

BUILD SUCCESSFUL
Total time: 2 seconds
remote06:~/cs542/viraj_nimbalkar_assign2>




TO COMPILE:

[
  Extract.
  Follow Path: viraj_nimbalkar_assign2/primeThreads/
  Assuming you are in the directory containing this README

  ## To compile: 
  ant -buildfile src/build.xml all
]

Extract 

TO RUN:

[
ant -buildfile src/build.xml run -Darg0=input.txt -Darg1=5 -Darg2=3
]

EXTRA CREDIT:

"N/A"

BIBLIOGRAPHY:
I have used CopyOnWriteArrayList to store the prime elements . This data structure is synchronized and has a load factor of 
50% as opposed to other data structure like Vectors (load factor of 75%.)

This serves as evidence that we are in no way intending Academic Dishonesty.
Viraj Nimbalkar

