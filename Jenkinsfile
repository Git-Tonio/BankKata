pipeline {
    agent any
    
    stages {
        stage('Build') {
            steps {
                sh './gradlew assemble'
            } 
        }

        stage('Test') {
            steps {
                sh './gradlew test'
            } 
        }

     
        stage('Scan') {
            steps {
                withSonarQubeEnv(installationName: 'sonarqube-jenkins') { 
                    sh './gradlew sonarqube'
                }
            } 
        }

        stage("Quality Gate") {
            steps {
                timeout(time: 5, unit: 'MINUTES') {
                    waitForQualityGate abortPipeline: true
                }
            }
        }

        stage('Upload') {
            steps {
                sh './gradlew publish --console verbose'
            } 
        }
        
    }
}
