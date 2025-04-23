# NumberToWords
## Java Library for converting Number to Words
### How to use
### Using Gradle
#### Add to settings.gradle.kts
<pre> 	
  dependencyResolutionManagement {
	  repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
	  repositories {
		  mavenCentral()
		  maven { url = uri("https://jitpack.io") }
	  }
  }
</pre>

### Add the dependency
<pre>
  dependencies {
      implementation("com.github.kennyrobert88:numberToWords:Tag")
  }
</pre>

### Using maven
#### Add to pom.xml
<pre>
  &lt;repositories&gt;
    &lt;repository&gt;
      &lt;id&gt;jitpack.io&lt;/id&gt;
      &lt;url&gt;https://jitpack.io&lt;/url&gt;
    &lt;/repository&gt;
  &lt;/repositories&gt;
</pre>

#### Add the dependency
<pre>
&lt;dependency&gt;
    &lt;groupId&gt;com.github.kennyrobert88&lt;/groupId&gt;
    &lt;artifactId&gt;numberToWords&lt;/artifactId&gt;
    &lt;version&gt;Tag&lt;/version&gt;
&lt;/dependency&gt;
</pre>
