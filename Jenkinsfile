pipeline {
    stages {
        stage('Git checkout'){
            git 'https://github.com/luisgabriel84/hola-mundo-maven.git'
        }
        
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
      
    }
}
