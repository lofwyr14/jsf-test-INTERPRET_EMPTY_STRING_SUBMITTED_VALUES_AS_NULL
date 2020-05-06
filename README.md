# testing jsf parameter: javax.faces.INTERPRET_EMPTY_STRING_SUBMITTED_VALUES_AS_NULL

Look at web.xml

```
  <context-param>
    <param-name>javax.faces.INTERPRET_EMPTY_STRING_SUBMITTED_VALUES_AS_NULL</param-name>
    <param-value>true</param-value>
  </context-param>
```

Run:
```
$ mvn clean package tomee:run
```

Browse this URL: [http://localhost:8080/]()

If you have no Websphere, but have Docker use this command:

```
echo "password" >PASSWORD
docker run --name was -h was -v $(pwd)/PASSWORD:/tmp/PASSWORD -p 9043:9043 -p 9443:9443 -d ibmcom/websphere-traditional:8.5.5.13-profile
```
 
(For more information see [https://hub.docker.com/r/ibmcom/websphere-traditional/]()) 
 
browse this URL: [https://localhost:9443/demo/]()
