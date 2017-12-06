#!groovy
node {

    stage ('Checkout') 
    checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'github-credentials', url: 'https://github.com/danielamaia/LES1718_ForumFEUP.git']]])
    //checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'github-credentials', url: 'https://github.com/danielamaia/LES1718_ForumFEUP.git']]])
        
    stage ('Build Jars')
    if(!isUnix()){
        bat 'cd FEUPOverflow@tmp && gradlew jar'
    }else{
        sh 'cd FEUPOverflow && ./gradlew jar'
    }

    stage ('Unit Tests')
    if(!isUnix()){
        bat 'cd FEUPOverflow && gradlew test'
        //bat 'cd ofbiz\\build\\test-results && for %%f in (*.xml) do type nul > %%f'
    }else{
        sh 'cd FEUPOverflow && ./gradlew test'
        //sh 'cd ofbiz/build/test-results && touch *.xml'
    }
            
    stage ('Unit Tests Report')
    if(!isUnix()){
        bat 'cd FEUPOverflow && gradlew jacocoTestReport'
    }else{
        sh 'cd FEUPOverflow && ./gradlew jacocoTestReport'
    }
    publishHTML([allowMissing: false, alwaysLinkToLastBuild: true, keepAll: true, reportDir: 'FEUPOverflow/reports', reportFiles: 'index.html', reportName: 'Jacoco Coverage Report'])
}