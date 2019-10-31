##Draft Two of Project Proposal -- 3

---

####Environment:

​	System: Windows 10

​	IDE: Android Studio, VSCode and AVD Manger

​	Language: Dart

---

#### Outline Details

- First, initial a Flutter project. And in the 'pubspec.yaml' file, we add the libraries we need.

  ```charts_flutter: "^0.4.0"```

- Them, we define the data structure

  ```dart
  class Barsales {
    String day;
    int sale;
    Barsales(this.day, this.sale);
  }
  
  class Linesales {
    DateTime time;
    int sale;
    Linesales(this.time, this.sale);
  }
  ```

- Next, define the data sources

  ```dart
  List<Linesales> dataLine = [
        new Linesales(new DateTime(2019, 7, 2), 33),
        new Linesales(new DateTime(2019, 7, 3), 55),
        new Linesales(new DateTime(2019, 7, 4), 22),
        new Linesales(new DateTime(2019, 7, 5), 88),
        new Linesales(new DateTime(2019, 7, 6), 123),
        new Linesales(new DateTime(2019, 7, 7), 75),
      ];
  List<Barsales> dataBar = [
        new Barsales("1", 20),
        new Barsales("2", 50),
        new Barsales("3", 20),
        new Barsales("4", 80),
        new Barsales("5", 120),
        new Barsales("6", 30),
      ];
  ```

- Finally, start the Android virtual machine and run out project on it.

  