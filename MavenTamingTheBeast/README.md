******************************
Maven: Taming the Beast
******************************


## The Build LifeCycle
> COMPILE
> TEST
> JAR BUILDING PROCESS
> PUT THE JAR IN A LOCATION
```xml
<groupId>com.jenkov</groupId>
<artifactId>java-web-crawler</artifactId>
<version>1.0.0</version>
```

## Maven Commands

- will generate mvn bootstrap maven project
> mvn archetype:generate

- Accessing super pom
> mvn help:effective-pom > pom-effective.xml

> ``
> mvn clean
> mvn clean install

- build and creates a target folder
> mvn compile

- Analyze dependency in mvn
> mvn dependency:analyze

- Displau a tree of dependency
> mvn dependency:tree

- Display versions that need to be upgraded



