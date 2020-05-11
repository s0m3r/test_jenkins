pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                print "DEBUG: parameter foo = ${Parametro}"
                script {
                    if (${Parametro} == 'Option1') {
                        echo 'Se a selecionado la primera opcion'
                    } else {
                        echo 'Se a selecionado la segunda opcion'
                    }
                }
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}

