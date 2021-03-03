pipeline {
    agent any

    triggers {
     pollSCM ' * * * * * '   
    }
    stages {
        stage ('Compile Stage') {

            steps {
                
                    bat 'mvn clean verify'
                
            }
        }

        stage ('Testing Stage') {

            steps {
               
                    bat 'mvn test'
                
            }
        }


        stage ('Deployment Stage') {
            steps {
                
                    bat 'mvn deploy'
                
            }
        }
    }
}
