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
