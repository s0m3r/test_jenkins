pipeline {
    agent any

    parameters {
        choice(
            name: 'Parametro',
            choices: "Option1\nOption2",
            description: 'prueba de opciones' )
    }

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                if [ ${params.Parametro} == 'Option1' ]; then
                echo "Elegiste opcion 1"
                else
                echo "Eligiste opcion 2"
                fi
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

