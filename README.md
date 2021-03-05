# Cats-Effect Seed

Minimal Giter8 template to get you set up with cats-effect (with console4cats)

Based on [scalawithcats/cats-seed.g8][origin]

Licensed [CC0 1.0][license].

## Getting Started

You'll need to [SBT][sbt] 0.13.13 or higher to use this template.

Run the following shell command:

~~~bash
$ sbt new scalawithcats/cats-seed.g8
~~~

You'll be prompted to enter a project and package name.
Press enter twice to accept the defaults:

~~~bash
name [Cats Sandbox]:
package [sandbox]:
~~~

The project will be created in a directory
based off of the `name` you specified.
If you accepted the defaults
the directory will be called `cats-sandbox`:

~~~bash
$ cd ./cats-sandbox
~~~

Follow the instructions in the generated `README.md` file
to download the necessary dependencies and launch a sample app.
If you see the message "Hello, Cats!", you're good to go!

[origin]: https://github.com/scalawithcats/cats-seed.g8
[license]: https://creativecommons.org/publicdomain/zero/1.0/
[sbt]: http://scala-sbt.org
