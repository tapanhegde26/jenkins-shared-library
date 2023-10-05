package com.seneshore

class Hello implements Serializable {
    def call(def pipeline, String name) {
        return exec(pipeline, name)
    }

    def exec(def pipeline, String name) {
        pipeline.echo "Hello ${name}!"
    }
}