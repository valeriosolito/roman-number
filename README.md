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

<report name="roman-number">
<sessioninfo id="pc-di-vally-a94186ff" start="1746387183223" dump="1746387184977"/>
<package name="it/unipd/mtss">
<class name="it/unipd/mtss/IntegerToRoman" sourcefilename="IntegerToRoman.java">
<method name="<init>" desc="()V" line="7">
<counter type="INSTRUCTION" missed="3" covered="0"/>
<counter type="LINE" missed="1" covered="0"/>
<counter type="COMPLEXITY" missed="1" covered="0"/>
<counter type="METHOD" missed="1" covered="0"/>
</method>
<method name="convert" desc="(I)Ljava/lang/String;" line="9">
<counter type="INSTRUCTION" missed="0" covered="154"/>
<counter type="BRANCH" missed="0" covered="8"/>
<counter type="LINE" missed="0" covered="10"/>
<counter type="COMPLEXITY" missed="0" covered="5"/>
<counter type="METHOD" missed="0" covered="1"/>
</method>
<counter type="INSTRUCTION" missed="3" covered="154"/>
<counter type="BRANCH" missed="0" covered="8"/>
<counter type="LINE" missed="1" covered="10"/>
<counter type="COMPLEXITY" missed="1" covered="5"/>
<counter type="METHOD" missed="1" covered="1"/>
<counter type="CLASS" missed="0" covered="1"/>
</class>
<class name="it/unipd/mtss/RomanPrinter" sourcefilename="RomanPrinter.java">
<method name="<init>" desc="()V" line="8">
<counter type="INSTRUCTION" missed="3" covered="0"/>
<counter type="LINE" missed="1" covered="0"/>
<counter type="COMPLEXITY" missed="1" covered="0"/>
<counter type="METHOD" missed="1" covered="0"/>
</method>
<method name="print" desc="(I)Ljava/lang/String;" line="11">
<counter type="INSTRUCTION" missed="0" covered="4"/>
<counter type="LINE" missed="0" covered="1"/>
<counter type="COMPLEXITY" missed="0" covered="1"/>
<counter type="METHOD" missed="0" covered="1"/>
</method>
<method name="printAsciiArt" desc="(Ljava/lang/String;)Ljava/lang/String;" line="15">
<counter type="INSTRUCTION" missed="0" covered="246"/>
<counter type="BRANCH" missed="0" covered="4"/>
<counter type="LINE" missed="0" covered="7"/>
<counter type="COMPLEXITY" missed="0" covered="3"/>
<counter type="METHOD" missed="0" covered="1"/>
</method>
<counter type="INSTRUCTION" missed="3" covered="250"/>
<counter type="BRANCH" missed="0" covered="4"/>
<counter type="LINE" missed="1" covered="8"/>
<counter type="COMPLEXITY" missed="1" covered="4"/>
<counter type="METHOD" missed="1" covered="2"/>
<counter type="CLASS" missed="0" covered="1"/>
</class>
<sourcefile name="RomanPrinter.java">
<line nr="8" mi="3" ci="0" mb="0" cb="0"/>
<line nr="11" mi="0" ci="4" mb="0" cb="0"/>
<line nr="15" mi="0" ci="4" mb="0" cb="0"/>
<line nr="18" mi="0" ci="201" mb="0" cb="0"/>
<line nr="80" mi="0" ci="7" mb="0" cb="2"/>
<line nr="81" mi="0" ci="17" mb="0" cb="2"/>
<line nr="83" mi="0" ci="10" mb="0" cb="0"/>
<line nr="85" mi="0" ci="4" mb="0" cb="0"/>
<line nr="87" mi="0" ci="3" mb="0" cb="0"/>
<counter type="INSTRUCTION" missed="3" covered="250"/>
<counter type="BRANCH" missed="0" covered="4"/>
<counter type="LINE" missed="1" covered="8"/>
<counter type="COMPLEXITY" missed="1" covered="4"/>
<counter type="METHOD" missed="1" covered="2"/>
<counter type="CLASS" missed="0" covered="1"/>
</sourcefile>
<sourcefile name="IntegerToRoman.java">
<line nr="7" mi="3" ci="0" mb="0" cb="0"/>
<line nr="9" mi="0" ci="6" mb="0" cb="4"/>
<line nr="10" mi="0" ci="5" mb="0" cb="0"/>
<line nr="14" mi="0" ci="55" mb="0" cb="0"/>
<line nr="15" mi="0" ci="55" mb="0" cb="0"/>
<line nr="17" mi="0" ci="4" mb="0" cb="0"/>
<line nr="20" mi="0" ci="8" mb="0" cb="2"/>
<line nr="21" mi="0" ci="5" mb="0" cb="2"/>
<line nr="22" mi="0" ci="6" mb="0" cb="0"/>
<line nr="23" mi="0" ci="7" mb="0" cb="0"/>
<line nr="27" mi="0" ci="3" mb="0" cb="0"/>
<counter type="INSTRUCTION" missed="3" covered="154"/>
<counter type="BRANCH" missed="0" covered="8"/>
<counter type="LINE" missed="1" covered="10"/>
<counter type="COMPLEXITY" missed="1" covered="5"/>
<counter type="METHOD" missed="1" covered="1"/>
<counter type="CLASS" missed="0" covered="1"/>
</sourcefile>
<counter type="INSTRUCTION" missed="6" covered="404"/>
<counter type="BRANCH" missed="0" covered="12"/>
<counter type="LINE" missed="2" covered="18"/>
<counter type="COMPLEXITY" missed="2" covered="9"/>
<counter type="METHOD" missed="2" covered="3"/>
<counter type="CLASS" missed="0" covered="2"/>
</package>
<counter type="INSTRUCTION" missed="6" covered="404"/>
<counter type="BRANCH" missed="0" covered="12"/>
<counter type="LINE" missed="2" covered="18"/>
<counter type="COMPLEXITY" missed="2" covered="9"/>
<counter type="METHOD" missed="2" covered="3"/>
<counter type="CLASS" missed="0" covered="2"/>
</report>


