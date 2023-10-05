def call() {
    echo "This is the default function of the shared library 'Util.groovy'"
}

def ping(String host) {
    def cmd = "ping -c 3 " + host 
    sh cmd
}