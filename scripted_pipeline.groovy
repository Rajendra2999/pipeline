node {  
    stage('Pull') { 
        git credentialsId: 'gitproject', url: 'https://github.com/Rajendra2999/pipeline.git'
    }
    stage('Test') { 
        echo "Test Complete"
    }
}