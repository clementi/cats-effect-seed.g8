package $package$

import cats.effect._

object Main extends IOApp {
  def run(args: List[String]): IO[ExitCode] = {
    IO.println("Hello, Cats!").as(ExitCode.Success)
  }
}
