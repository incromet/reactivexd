# ReactiveXD tests

  This are some test using the ReactiveXD compiler, to deploy, you must have locally installed with maven the ReactiveXD project.

  You must have maven installed

  Inside the parent project (../co.edu.escuelaing.reactivexd.parent-master/) run:

```
export MAVEN_OPTS="-Xmx512m -XX:MaxPermSize=256m"
```

```bash
mvn clean install
```

Or skipping the test from the compiler as follows:
```bash
mvn clean install -DskipTests=true
```

There are 3 examples.
