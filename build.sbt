organization := "com.guizmaii"
name         := "scala-nimbus-jose-jwt"

scalafmtOnCompile := true
scalafmtCheck     := true
scalafmtSbtCheck  := true

lazy val scala212 = "2.12.17"
lazy val scala213 = "2.13.10"

scalaVersion       := scala213
crossScalaVersions := Seq(scala212, scala213)

val nimbusJwt             = "com.nimbusds"            % "nimbus-jose-jwt"         % "9.31"
val scalaCollectionCompat = "org.scala-lang.modules" %% "scala-collection-compat" % "2.11.0"
val scalaCheck            = "org.scalacheck"         %% "scalacheck"              % "1.17.0"   % Test
val scalatest             = "org.scalatest"          %% "scalatest"               % "3.2.16"   % Test
val scalatestPlus         = "org.scalatestplus"      %% "scalacheck-1-16"         % "3.2.14.0" % Test
val catsScalatest         = "com.ironcorelabs"       %% "cats-scalatest"          % "3.1.1"    % Test

libraryDependencies ++= Seq(
  nimbusJwt,
  scalaCollectionCompat,
  scalaCheck,
  scalatest,
  scalatestPlus,
  catsScalatest
)

inThisBuild(
  List(
    organization := "com.guizmaii",
    homepage     := Some(url("https://github.com/guizmaii/scala-nimbus-jose-jwt")),
    licenses     := List("MIT" -> url("http://opensource.org/licenses/MIT")),
    developers := List(
      Developer(
        "guizmaii",
        "Jules Ivanic",
        "jules.ivanic@gmail.com",
        url("https://blog.jules-ivanic.com/#/")
      )
    )
  )
)
