pipeline {
    agent any

    parameters {
        choice(name: 'VERSION', choices: ['1.1.0', '1.2.0'], description: 'Elige la version')
    }

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
                echo "version = ${VERSION}"
                script {
                    if ("${VERSION}" == '1.1.0') {
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
                sh  """./test.sh"""
            }
        }
    }
}

