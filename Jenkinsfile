
pipeline {

  agent any

  tools {
    maven 'jenkins-maven' 
  }

  stages {
  
    stage('Build') {
      steps {
        sh 'mvn clean package'            
      }
    }
    
    stage('Test') {
      steps {
        sh 'mvn test'            
      }
    }
    
    stage('Dummy') {
      steps {
        echo 'Dummy statement'
        }
    }    
    
    stage('Deploy') {
      steps {
        sh 'java -jar target/my-app-1.0-SNAPSHOT.jar'
      }
    }

    stage('Archive') {
      steps {
        archiveArtifacts artifacts: 'target/*.jar', followSymlinks: false, onlyIfSuccessful: true
      }
    }
    
  }
    
  post {
    always {
      junit(
        allowEmptyResults: true,
        testResults: 'target/surefire-reports/*.xml'
      )
    }
  }     
    

}


