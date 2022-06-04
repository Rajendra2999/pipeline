node {  
    stage('Pull') { 
        git credentialsId: 'git-cred', url: 'https://github.com/Rajendra2999/pipeline.git'
    }
    stage('Test') { 
        echo "Test Complete"
    }
}