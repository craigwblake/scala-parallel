import sbt._

class ScalaParallelProject(info: ProjectInfo) extends DefaultProject(info) with AutoCompilerPlugins {

	override def managedStyle = ManagedStyle.Maven
	lazy val publishTo = "Local" at "file://"+Path.userHome+"/.m2/repository"

  val st = "org.scalatest" % "scalatest" % "1.0-for-scala-2.8.0-SNAPSHOT" % "test->default"

  val snapshotRepo = "Snapshot Repository" at "http://www.scala-tools.org/repo-snapshots"
}
