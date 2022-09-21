pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'helllo'
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