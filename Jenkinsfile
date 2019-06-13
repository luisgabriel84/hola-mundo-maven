node{   
        stage('Git checkout'){
            git 'https://github.com/luisgabriel84/hola-mundo-maven.git'
        }
        stage('Compile-Pakage'){
            sh 'mvn package'
        }
        stage('Test'){
          sh 'mvn test'
          post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
}
