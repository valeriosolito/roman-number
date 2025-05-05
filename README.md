////////////////////////////////////////////////////////////////////

// Valerio Solito 2113178

// Bilal Sabic 2111022

////////////////////////////////////////////////////////////////////

# Processo di build:
## Eseguendo il comando Run mvn -B package --file pom.xml contenuto del github action, nel file maven.yml abbiamo

```bash

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

```

# Analisi statica del codice:
## Eseguiamo il comando mvn -B checkstyle:check che dà:
```bash
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
```
# Code coverage:
## Abbiamo usato il comando mvn clean test e andando nella cartella target/site/jacoco/jacoco.xml abbiamo questo:

![image](https://github.com/user-attachments/assets/b452b7e2-9696-4746-ad44-1f6c55a76b7f)

### In alternativa facendo mvn -B jacoco:report e poi usando WSL (windows subsistem for linux, per usare il comando grep) nella cartella roman-number posso eseguire il seguente comando 
### grep -oP 'Total.*?<td class="ctr2">.*?</td>' target/site/jacoco/index.html | sed -E 's/.*<td class="ctr2">([^<]+)<\/td>/ Code Coverage: \1/'
### che riuscirà ad estrarre dal file html la percentuale trovata e a mostrarla e infatti ci ritorna:

```bash

PS C:\Users\valer\OneDrive\Desktop\roman-number> mvn clean package jacoco:report
WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::load has been called by org.fusesource.jansi.internal.JansiLoader in an unnamed module (file:/C:/Users/valer/Downloads/apache-maven-3.9.9-bin/apache-maven-3.9.9/lib/jansi-2.4.1.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by com.google.common.util.concurrent.AbstractFuture$UnsafeAtomicHelper (file:/C:/Users/valer/Downloads/apache-maven-3.9.9-bin/apache-maven-3.9.9/lib/guava-33.2.1-jre.jar)
WARNING: Please consider reporting this to the maintainers of class com.google.common.util.concurrent.AbstractFuture$UnsafeAtomicHelper
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
[INFO] Scanning for projects...
[INFO]
[INFO] ---------------------< it.unipd.mtts:roman-number >---------------------
[INFO] Building roman-number 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- clean:3.1.0:clean (default-clean) @ roman-number ---
[INFO] Deleting C:\Users\valer\OneDrive\Desktop\roman-number\target
[INFO]
[INFO] --- jacoco:0.8.11:prepare-agent (default) @ roman-number ---
[INFO] argLine set to -javaagent:C:\\Users\\valer\\.m2\\repository\\org\\jacoco\\org.jacoco.agent\\0.8.11\\org.jacoco.agent-0.8.11-runtime.jar=destfile=C:\\Users\\valer\\OneDrive\\Desktop\\roman-number\\target\\jacoco.exec
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
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.043 s - in it.unipd.mtss.IntegerToRomanTest
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
[INFO]
[INFO] --- jacoco:0.8.11:report (default-cli) @ roman-number ---
[INFO] Loading execution data file C:\Users\valer\OneDrive\Desktop\roman-number\target\jacoco.exec
[INFO] Analyzed bundle 'roman-number' with 2 classes
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  4.521 s
[INFO] Finished at: 2025-05-05T14:06:44+02:00
[INFO] ------------------------------------------------------------------------


PS C:\Users\valer\OneDrive\Desktop\roman-number> wsl.exe -d Ubuntu
To run a command as administrator (user "root"), use "sudo <command>".
See "man sudo_root" for details.

valer@pc-di-vally:/mnt/c/Users/valer/OneDrive/Desktop/roman-number$ grep -oP 'Total.*?<td class="ctr2">.*?</td>' target/site/jacoco/index.html | sed -E 's/.*<td class="ctr2">([^<]+)<\/td>/ Code Coverage: \1/'
 Code Coverage: 98%

```
