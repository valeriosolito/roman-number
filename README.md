////////////////////////////////////////////////////////////////////

// Valerio Solito 2113178

// Bilal Sabic 2111022

////////////////////////////////////////////////////////////////////

Processo di build:
Eseguendo il comando Run mvn -B package --file pom.xml contenuto del github action, nel file maven.yml abbiamo
[INFO] Scanning for projects...

[INFO]

[INFO] ---------------------< it.unipd.mtts:roman-number >---------------------

[INFO] Building roman-number 1.0-SNAPSHOT

[INFO]   from pom.xml

[INFO] --------------------------------[ jar ]---------------------------------

[INFO]

[INFO] --- jacoco:0.8.11:prepare-agent (default) @ roman-number ---

[INFO] argLine set to -javaagent:C:\\Users\\valer\\.m2\\repository\\org\\jacoco\\org.jacoco.agent\\0.8.11\\org.jacoco.agent-0.8.11-runtime.jar=destfile=C:\\Users\\valer\\OneDrive\\Desktop\\roman-

number\\target\\jacoco.exec

[INFO]

[INFO] --- resources:3.0.2:resources (default-resources) @ roman-number ---

[INFO] Using 'UTF-8' encoding to copy filtered resources.

[INFO] skip non existing resourceDirectory C:\Users\valer\OneDrive\Desktop\roman-number\src\main\resources

[INFO]

[INFO] --- compiler:3.8.0:compile (default-compile) @ roman-number ---

[INFO] Changes detected - recompiling the module!

[INFO] Compiling 2 source files to C:\Users\valer\OneDrive\Desktop\roman-number\target\classes

[INFO]

[INFO] --- resources:3.0.2:testResources (default-testResources) @ roman-number ---

[INFO] Using 'UTF-8' encoding to copy filtered resources.


[INFO] skip non existing resourceDirectory C:\Users\valer\OneDrive\Desktop\roman-number\src\test\resources

[INFO]

[INFO] --- compiler:3.8.0:testCompile (default-testCompile) @ roman-number ---

[INFO] Changes detected - recompiling the module!

[INFO] Compiling 2 source files to C:\Users\valer\OneDrive\Desktop\roman-number\target\test-classes

[INFO]

[INFO] --- surefire:2.22.1:test (default-test) @ roman-number ---

[INFO]

[INFO] -------------------------------------------------------

[INFO]  T E S T S


[INFO] -------------------------------------------------------

[INFO] Running it.unipd.mtss.IntegerToRomanTest

[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.08 s - in it.unipd.mtss.IntegerToRomanTest

[INFO] Running it.unipd.mtss.RomanPrinterTest

[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 s - in it.unipd.mtss.RomanPrinterTest

[INFO]

[INFO] Results:

[INFO]

[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0

[INFO]

[INFO]

[INFO] --- jacoco:0.8.11:report (report) @ roman-number ---

[INFO] Loading execution data file C:\Users\valer\OneDrive\Desktop\roman-number\target\jacoco.exec

[INFO] Analyzed bundle 'roman-number' with 2 classes

[INFO]

[INFO] --- jar:3.0.2:jar (default-jar) @ roman-number ---

[INFO] Building jar: C:\Users\valer\OneDrive\Desktop\roman-number\target\roman-number-1.0-SNAPSHOT.jar

[INFO]

[INFO] --- checkstyle:3.3.1:check (checkstyle-validation) @ roman-number ---

[INFO] Starting audit...

Audit done.

[INFO] You have 0 Checkstyle violations.

[INFO] ------------------------------------------------------------------------

[INFO] BUILD SUCCESS

[INFO] ------------------------------------------------------------------------

[INFO] Total time:  8.094 s

[INFO] Finished at: 2025-05-04T21:15:22+02:00

[INFO] ------------------------------------------------------------------------


Poi per l'analisi statica del codice eseguo il comando mvn -B checkstyle:check che mi dà:

[INFO] Scanning for projects...

[INFO]

[INFO] ---------------------< it.unipd.mtts:roman-number >---------------------

[INFO] Building roman-number 1.0-SNAPSHOT

[INFO]   from pom.xml

[INFO] --------------------------------[ jar ]---------------------------------

[INFO]

[INFO] --- checkstyle:3.3.1:check (default-cli) @ roman-number ---

[INFO] Starting audit...

Audit done.

[INFO] You have 0 Checkstyle violations.

[INFO] ------------------------------------------------------------------------

[INFO] BUILD SUCCESS

[INFO] ------------------------------------------------------------------------

[INFO] Total time:  1.314 s

[INFO] Finished at: 2025-05-04T21:19:15+02:00

[INFO] ------------------------------------------------------------------------

Invece per il code coverage, ho usato il comando mvn clean test e sono andato nella cartella target/site/jacoco/jacoco.xml e mi ha fornito questo

[![Java CI with Maven]https://github.com/valeriosolito/roman-number/actions/workflows/maven.yml/badge.svg]

[![Coverage Status](https://coveralls.io/repos/github/valeriosolito/roman-number/badge.svg?branch=main)](https://coveralls.io/github/valeriosolito/roman-number?branch=main)

