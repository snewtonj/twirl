import sbt._

object Dependencies {
  val commonsLang = "commons-lang"                  %  "commons-lang"   % "2.6"
  val scalaIO     = "com.github.scala-incubator.io" %% "scala-io-file"  % "0.3.0"

  object Test {
    val specs = "org.specs2" %% "specs2" % "1.7.1" % "test"
  }

  def scalaCompiler(version: String) = "org.scala-lang" % "scala-compiler" % version
}
