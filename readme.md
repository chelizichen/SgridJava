# SgridJava

## RUN

````sh
mvn spring-boot:run
````

或者使用 sgrid-cli 脚手架

````sh
sgrid run:springboot 
````

## BUILD

````sh
#!/bin/bash
readonly ServerName="SgridJavaServer"
rm -r $ServerName.tar.gz
mvn compile
mvn deploy
tar -cvf $ServerName.tar.gz ./target
````

或者使用 sgrid-cli 脚手架

````sh
sgrid release:springboot -s SgridJavaDemoServer
````

## DEPLOY

参照 [文档](http://150.158.120.244/docs/) 进行部署

## TIPS

如果想做非侵入式改动，加上 @EnabSgridJavaServer 后，在配置中心配置下即可完成发布
