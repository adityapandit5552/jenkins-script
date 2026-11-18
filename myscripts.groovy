pipeline {
    agent any

    stages {
        stage('Pull') {
            steps {
            
               git branch: 'main', url: 'https://github.com/adityapandit5552/gitlab-practice.git'
            }
        }
         stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
