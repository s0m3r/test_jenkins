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
                echo %Parametro%
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

