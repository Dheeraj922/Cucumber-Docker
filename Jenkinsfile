pipeline {

    agent any
    tools {
        maven 'maven3.6.3'
        docker 'docker'
    }

    environment {
        COMPOSE_FILE = ${env.WORKSPACE}'/docker-compose/docker-compose-v3_file2.yml'
    }

    stages {

        stage('grid setup') {
            sh 'docker-compose -f '${COMPOSE_FILE}' build'
            sh 'docker-compose -f '${COMPOSE_FILE}' up'
        }

        stage('Checkout') {
            steps {
                checkout([$class: 'GitSCM',
                          branches: [[name: '*/master']],
                          doGenerateSubmoduleConfigurations: false,
                          extensions: [],
                          submoduleCfg: [],
                          userRemoteConfigs: [[credentialsId: '8bc75d8c-ee65-4f6e-9d8d-5cdca8bdd437', url: 'https://github.com/nitink007/CucumberE2EFW.git']]])
            }
        }

        stage('build') {
            steps {
                echo 'building app...'
                sh 'mvn test -Dcucumber.filter.tags=@flightFeature'
            }
        }

        stage('test') {
            steps {
                echo 'testing app...'
            }
        }
    }
    post {
        always {
            echo 'Post task -- always'
            sh 'docker-compose -f '${COMPOSE_FILE}' down'
        }
        failure {
            echo 'build is failed'
        }
    }

}