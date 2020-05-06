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

For TomEE we need also (in the pom.xml):
```
-Dorg.apache.el.parser.COERCE_TO_ZERO=false
```

For further info see: https://balusc.omnifaces.org/2015/10/the-empty-string-madness.html

