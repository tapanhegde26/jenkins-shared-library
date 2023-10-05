/* 
Default function for the Groovy file. Use this function as below
from your pipeline i.e., use the file's basename as a function
while calling it from your script.

    script {
        utils()
    }

*/
def call() {
    echo "This is the default function of the shared library 'Util.groovy'"
}

/*
This function should be called as below:

    script {
        utils.ping("google.com")
    }

i.e., the function should be prefixed with the file's basename.
*/

def ping(String host) {
    def cmd = "ping -c 3 " + host 
    sh cmd
}