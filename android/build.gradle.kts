allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

val newBuildDir: Directory =
    rootProject.layout.buildDirectory
        .dir("../../build")
        .get()
rootProject.layout.buildDirectory.value(newBuildDir)

subprojects {
    val newSubprojectBuildDir: Directory = newBuildDir.dir(project.name)
    project.layout.buildDirectory.value(newSubprojectBuildDir)
}
subprojects {
    project.evaluationDependsOn(":app")
}

tasks.register<Delete>("clean") {
    delete(rootProject.layout.buildDirectory)
}





//allprojects {
//    repositories {
//        // 使用阿里云镜像替换原来的 google() 和 mavenCentral()
//        maven { url = uri("https://maven.aliyun.com/repository/google") }
//        maven { url = uri("https://maven.aliyun.com/repository/public") }
//        maven { url = uri("https://maven.aliyun.com/repository/gradle-plugin") }
//
//        // 如果需要，可以保留一些其他仓库
//        mavenCentral()
//        // 如果需要 JitPack
//        maven { url = uri("https://jitpack.io") }
//    }
//}
//
//val newBuildDir: Directory =
//    rootProject.layout.buildDirectory
//        .dir("../../build")
//        .get()
//rootProject.layout.buildDirectory.value(newBuildDir)
//
//subprojects {
//    val newSubprojectBuildDir: Directory = newBuildDir.dir(project.name)
//    project.layout.buildDirectory.value(newSubprojectBuildDir)
//}
//subprojects {
//    project.evaluationDependsOn(":app")
//}
//
//tasks.register<Delete>("clean") {
//    delete(rootProject.layout.buildDirectory)
//}