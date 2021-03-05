package $package$

import cats.effect._
import cats.effect.Console.io._

object Main extends IOApp {
  def run(args: List[String]): IO[ExitCode] = {
    putStrLn("Hello, Cats!").as(ExitCode.Success)
  }
}
