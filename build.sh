#!/bin/bash

readonly ServerName="SgridJavaServer"

rm -r $ServerName.tar.gz

#mvn compile
#mvn deploy

tar -czvf $ServerName.tar.gz ./target
