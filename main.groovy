node {

  stage 'Git Update'
  git credentialsId: 'b9be8bf2-3e2b-4f18-bb75-c2ad3664b4f7', url: 'https://github.com/xuefengwork/automationtest.git'

  stage 'TEST execute sh file'
      println 'hello fxue, this is checkout.'
      //sh './hello.sh'

  stage 'Post Test'
    println 'this is post test task.'



}
