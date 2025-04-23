# NumberToWords
## Java Library for converting Number to Words
### Import Dependency
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

### How to use?
#### Initiate Class 
<pre> var numberToWords = new NumberToWordsID(); </pre>
#### Converting by Long or by Integer to String
<pre> var result = numberToWords.convertToWords((Long) 10L); </pre>
<pre> var result = numberToWords.convertToWords((Integer) 10); </pre>
