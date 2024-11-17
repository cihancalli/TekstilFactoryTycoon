import org.gradle.api.artifacts.Dependency
import org.gradle.api.artifacts.dsl.DependencyHandler

fun DependencyHandler.testApi(vararg dependencyNotations: Any): List<Dependency?> =
    dependencyNotations.map {
        add("testApi", it)
    }

fun DependencyHandler.api(vararg dependencyNotations: Any): List<Dependency?> =
    dependencyNotations.map {
        add("api", it)
    }

fun DependencyHandler.testImplementation(vararg dependencyNotations: Any): List<Dependency?> =
    dependencyNotations.map {
        add("testImplementation", it)
    }

fun DependencyHandler.androidTestImplementation(vararg dependencyNotations: Any): List<Dependency?> =
    dependencyNotations.map {
        add("androidTestImplementation", it)
    }

fun DependencyHandler.debugImplementation(vararg dependencyNotations: Any): List<Dependency?> =
    dependencyNotations.map {
        add("debugImplementation", it)
    }

fun DependencyHandler.implementation(vararg dependencyNotations: Any): List<Dependency?> =
    dependencyNotations.map {
        add("implementation", it)
    }

fun DependencyHandler.runtimeOnly(vararg dependencyNotations: Any): List<Dependency?> =
    dependencyNotations.map {
        add("runtimeOnly", it)
    }

fun DependencyHandler.kapt(vararg dependencyNotations: Any): List<Dependency?> =
    dependencyNotations.map {
        add("kapt", it)
    }

fun DependencyHandler.ksp(vararg dependencyNotations: Any): List<Dependency?> =
    dependencyNotations.map {
        add("ksp", it)
    }

/*
fun DependencyHandler.implementation(dependency : String){
    add("implementation ",dependency)
}*/
