pipeline {
    agent any
    stages {
        stage('Preparation') {
            steps {
                git 'ssh://your_repository.git'
            }
        }
        stage('Download Feature Files'){
            steps {
                downloadFeatureFiles serverAddress: 'http://192.168.1.107:8081',
                    projectKey: 'TES',
                    targetPath:'src/test/resources/features'
            }
        }
        stage('Clean Work Space'){
            steps {
                sh 'mvn clean'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn test'
            }
        }
    }
    post {
        always {
            publishTestResults serverAddress: 'http://192.168.1.107:8081',
            projectKey: 'WEB',
            format: 'Cucumber',
            filePath: 'target/cucumber/*.json',
            autoCreateTestCases: false,
              customTestCycle: [
                name: 'Jenkins Build',
                description: 'Results from Jenkins Build',
                jiraProjectVersion: '10001',
                folderId: '3040527',
                customFields: '{"number":50,"single-choice":"option1","checkbox":true,"userpicker":"5f8b5cf2ddfdcb0b8d1028bb","single-line":"a text line","datepicker":"2020-01-25","decimal":10.55,"multi-choice":["choice1","choice3"],"multi-line":"first line<br />second line"}'
              ]
        }
    }
}