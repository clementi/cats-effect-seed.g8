# Cats-Effect Seed

Minimal Giter8 template to get you set up with [cats] and [cats-effect].

Based on [scalawithcats/cats-seed.g8][origin].

Licensed [CC0 1.0][license].

## Getting Started

You'll need to [SBT][sbt] 0.13.18 or higher to use this template.

Run the following shell command:

~~~sh
$ sbt new clementi/cats-effect-seed.g8
~~~

You'll be prompted to enter a project and package name.
Press enter twice to accept the defaults:

~~~sh
name [Cats Sandbox]:
package [sandbox]:
~~~

The project will be created in a directory
based off of the `name` you specified.
If you accepted the defaults
the directory will be called `cats-sandbox`:

~~~sh
$ cd ./cats-sandbox
~~~

Follow the instructions in the generated `README.md` file
to download the necessary dependencies and launch a sample app.
If you see the message "Hello, Cats!", you're good to go!

[cats]: https://typelevel.org/cats
[cats-effect]: https://typelevel.org/cats-effect
[origin]: https://github.com/scalawithcats/cats-seed.g8
[license]: https://creativecommons.org/publicdomain/zero/1.0
[sbt]: http://scala-sbt.org
