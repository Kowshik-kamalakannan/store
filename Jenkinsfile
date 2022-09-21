pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh "mvn build"
            }
        }
        stage('Test') {
            steps {
                sh "mvn test"
            }
        }
        stage('Deploy') {
            steps {
                sh "mvn deploy"
            }
        }
    }
}