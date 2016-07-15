node {

  //stage 'Git Update'
    //git credentialsId: 'b9be8bf2-3e2b-4f18-bb75-c2ad3664b4f7', url: 'https://github.com/xuefengwork/automationtest.git'

  stage 'TEST execute sh file'
      println 'hello fxue, this is checkout.'
      sh './hello.sh'
      //env["WORKSPACE"]=pwd()
      // def properties_pipeline_general = readProperties file: './pipeline.properties'
      // for ( e in properties_pipeline_general ) {
      //     env[e.key] = e.value
      // }

      //println env

  stage 'Post Test'
    println 'this is post test task.'

  stage 'test env'
    sh 'env'



}
