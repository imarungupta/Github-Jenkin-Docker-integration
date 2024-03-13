pipeline{
    agent any
    tools{
        maven'3.9.6'
    }
    stages{
        stage('Build Maven'){
            steps{
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: 'dee171b7-dda6-4937-9644-c2e9af896d06', url: 'https://github.com/imarungupta/Github-Jenkin-Docker-integration']])
                bat 'mvn clean install'
            }
        }
        stage('Build Docker Image'){
            steps{
                script{
                    bat 'docker build -t github-jenkins-docker-integration .'
                }
            }
        }
        stage('Push image to hub'){
            steps{
                script{

                    bat 'docker login -u imarungupta -p Saraswati@786!'
                }
                bat 'docker push imarungupta/github-jenkins-docker-integration.jar'
            }
        }
    }
}