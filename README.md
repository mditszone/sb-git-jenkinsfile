post :  http://localhost:8080/save

{
"id":"1",
"name":"Sam",
"age":"25",
"address":"Hyderabad"

}

get : http://localhost:8080/getUsers


add dependency

<!-- https://mvnrepository.com/artifact/org.codehaus.sonar/sonar-maven-plugin -->
		<dependency>
		    <groupId>org.codehaus.sonar</groupId>
		    <artifactId>sonar-maven-plugin</artifactId>
		    <version>3.2-RC2</version>
		</dependency>


run as maven build, as in goal below commands pass

92ae5986365066c472f64c41d02657de6ce93744

clean verify sonar:sonar -Dsonar.login=c85627bc530b9bb3d3bee1fb6f76644fa7b42003

