pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh "export JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64/"
                sh "mvn install"
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