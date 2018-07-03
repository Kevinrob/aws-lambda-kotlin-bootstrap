# How to use this?

- Fork/Clone/Download this project
- In `settings.gradle`, change the `rootProject.name`
- In `build.gradle.kts`, change `group = "..."`
- In `src/main/java/com/example/main.kt`, change `package com.example`

# How to build JAR?

- Run Gradle task `shadowJar` with `gradlew shadowJar`
- The JAR will be in `build/libs/...-all.jar`

# ... and after?

You can upload the JAR to AWS Lambda and starting playing with it! Enjoy! 😉
