@Library("shared-lib") _

import com.seneshore.Hello
def Hello = new Hello()

pipeline {
    agent any 
    options {
        timestamps ()
    }
    stages {
        stage("utill Default") {
            steps {
                script {
                    utils()
                }
            }
        }
        stage("util ping") {
            steps {
                script {
                    utils.ping("google.com")
                }
            }
        }
        stage("Hello") {
            steps {
                script {
                    Hello(this, "Prakritish")
                }
            }
        }
    }
}