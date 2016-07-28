Smallest Circle Project

Based on Ruby Quiz Smallest Circle #157

This project uses an ant build file.
There are Unit tests in this build.  Insure that some version of junit.jar and hamcrest-core.jar are on the classpath.

    junit-4.10.jar http://bit.ly/My9IXz
    hamcrest-core-1.3.jar http://bit.ly/1gbl25b

Run the build command: 
```
>ant 
```

To run the project the main method in the Main class takes an integer argument to specify the size of array points.
e.
In the build directory:

Sample Call:
```
>java -cp dist/lib/Shapes-20160727.jar com.etechtips.Main 3
```

Options added:

  --js  javascript canvas output

  -o offset

