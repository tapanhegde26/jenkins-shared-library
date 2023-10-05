package com.seneshore
/*
See the package name structure. This file is under
    /src/com/seneshore
and the package is named 'com.seneshore'
*/

/*
The class name and file's basename should be the same.
Here the file name is Hello.groovy, so we are using the
class name as 'Hello'. 
*/
class Hello implements Serializable {
    def call(def pipeline, String name) {
        return exec(pipeline, name)
    }

    def exec(def pipeline, String name) {
        pipeline.echo "Hello ${name}!"
    }
}