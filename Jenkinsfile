pipeline {
    agent any

    stages {
        stage ('Compile Stage') {

            steps {
              
                    sh 'mvn clean compile'
                
            }
   withMaven(maven : 'maven_3.6') {
                    sh 'mvn test'
                }
            }
        }


        stage ('Deployment Stage') {
            steps {
                withMaven(maven : 'maven_3.6') {
                    sh 'mvn deploy'
                }
            }
        }
    }
}
