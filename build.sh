#!/bin/bash

readonly ServerName="SgridJavaServer"

rm -r $ServerName.tar.gz

mvn compile
mvn deploy

tar -cvf $ServerName.tar.gz ./target
