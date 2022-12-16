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

        // stage('Report') {
        //     steps {
        //         //allure includeProperties: false, jdk: '', results: [[path: 'allure-report']]
        //         script {
        //             allure([
        //                     includeProperties: false,
        //                     jdk: '',
        //                     properties: [],
        //                     reportBuildPolicy: 'ALWAYS',
        //                     results: [[path: 'allure-report']]
        //             ])
        //         }
        //     } 
        // }

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
