pipeline {
    agent any
    environment{
        PATH =   "C:/Program Files/Apache Software Foundation/apache-maven-3.8.4:$PATH" 
        AWS_ACCESS_KEY_ID = credentials('jenkins-aws-access-key')
        AWS_SECRET_ACCESS_KEY = credentials('jenkins-aws-secret-access-key')
    }
    stages {
        stage("git") {
            steps {
              git credentialsId: 'git_credentials', url: 'https://github.com/yagyesh-github/foodbox_payment.git'
            }
        }
        stage("build"){
            steps{
                bat  "mvn clean install"
            }
        }
         stage("deploy"){
            steps{
               bat  "./mvnw package"
            }
            post{
                success{
                    archiveArtifacts 'target/*.war'
                    bat 'aws configure set region us-east-1'
                    bat 'aws s3 cp ./target/General_Stores-0.0.1-SNAPSHOT.war s3://foodboxbuck/FOODBOX.war'
                }
            }
        }
    }
}
