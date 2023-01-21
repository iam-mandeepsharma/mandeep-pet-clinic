plugins{
    base
    idea
    java
    id("org.springframework.boot") version "3.0.2" apply false
    id("io.spring.dependency-management") version "1.1.0"
    id("io.freefair.lombok") version "6.6.1" apply false
}

allprojects {
    group = "mandeep.springlearning"
}

subprojects {

    apply {
        plugin("org.springframework.boot")
        plugin("io.spring.dependency-management")
        plugin("io.freefair.lombok")
    }

    afterEvaluate {
        dependencyManagement{
            imports {
                mavenBom("org.springframework.boot:spring-boot-dependencies:3.0.2")
            }

            dependencies {

            }
        }
    }
}