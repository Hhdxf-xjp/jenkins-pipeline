pipeline {
    agent any
    stages {
        stage('echo java version') {
            steps {
                bat 'java -version'
            }
        }
    }
}