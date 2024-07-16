# File system

## Listing a current working directory

There is a method within the `File` Class that allows to `list` the current directory:

```Java
Path filePath = Path.of("/");
try{
    File f = new File(filePath.toString());
    for(File file : f.listFiles()){
        System.out.println(file.getName());
    }
} catch (IOException ex){
    ex.printStackTrade();
}
```

or we can just use:

```Java
public static void main(String[] args){
    Files.list(Paths.get(".")).forEach(System.out::println);
}
```

## List and Filter all files

### Listing

We can do the listing operations from the specified directory and deeper.

```Java
Files.walk(Paths.get("."), 1).forEach(System.out::println);
// Print current directory
Files.walk(Paths.get("."), 2).forEach(System.out::println);
// Print directories that are 1 level deeper
```

### Filtering

We can filter using `Collections` methods or use the native `find()` method.

`Collections`:

```Java
Files.walk(Paths.get("."), 4).filter(path -> String.valueOf(path).contains(".java"));

// Or
Predicate<? super Path> javaMatcher = path -> String.valueOf(path);
Files.walk(Paths.get("."), 4).filter(javaMatcher).contains(".java");
```

`Native`:

```Java
BiPredicate<Path, BasicFileAttributes> javaMatcher = (path, attributes) -> String.valueOf(path).contains(".java");

Files.find(Paths.get("."), 4, javaMatcher);

// Or
BiPredicate<Path, BasicFileAttributes> directoryMatcher = (path, attributes) -> attributes.isDirectory();

Files.find(Paths.get("."), 4, directoryMatcher);
```
