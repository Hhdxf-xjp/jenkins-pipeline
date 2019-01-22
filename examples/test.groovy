pipeline {
    /* insert Declarative Pipeline here */
    agent any
    stages {
        stage('Example') {
            steps {
                echo 'Hello World'
            }
        }
    }
}