# Q10-student-grade: Calculate student grade

## Objective
Map marks from 0–100 to a grade using the documented boundaries.

## Files
- `pom.xml` — Maven build configuration and JUnit 5 dependency.
- `src/main/java/com/example/App.java` — Java program.
- `src/test/java/com/example/AppTest.java` — JUnit 5 tests.
- `Jenkinsfile` — Jenkins Declarative Pipeline to run `mvn clean verify` and publish JUnit results.

## Run locally
Open a terminal in this folder and run:

```bash
mvn clean verify
```

To run only the Java program after compiling, run:

```bash
mvn -q -DskipTests package
java -cp target/classes com.example.App
```

## Expected sample output
Run the `App` class; it prints a sample result for this exercise. Test expectations are in `AppTest.java`.

## Notes
Grade policy used here: A = 90–100, B = 80–89, C = 70–79, D = 60–69, F = 0–59. Change boundaries if your college specifies another scheme.
