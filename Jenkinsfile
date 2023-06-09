pipeline {
  agent any
  tools {
    maven 'maven' 
  }
  triggers {
    pollSCM '* * * * *'
  }
  stages {
    stage ('Build') {
      steps {
        sh 'mvn clean package'
      }
    }
    stage ('Deploy') {
      steps {
        script {
          deploy adapters: [tomcat8(credentialsId: 'tomcat', path: '', url: 'http://13.48.57.179:8080/')], contextPath: '/spring1folder', onFailure: false, war: '**/*.war' 
        }
      }
    }
  }
}
