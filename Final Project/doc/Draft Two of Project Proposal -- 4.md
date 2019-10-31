## Draft Two of Project Proposal -- 4

---

### Results

##### Project Structure

<img src="https://github.com/SaberDa/CSCI-6221-Project-and-Assignment-/raw/master/Final%20Project/doc/images/1.png" alt="1" style="zoom:50%;" />



##### Running interface

<img src="https://github.com/SaberDa/CSCI-6221-Project-and-Assignment-/raw/master/Final%20Project/doc/images/2.jpg" alt="2" style="zoom:50%;" />

---

### Findings

#### Setup the Dart and Flutter environment

-  [Flutter official website to download the installation package Flutter SDK](https://flutter.io/docs/development/tools/sdk/archive?tab=windows#windows) 

  <img src="https://github.com/SaberDa/CSCI-6221-Project-and-Assignment-/raw/master/Final%20Project/doc/images/3.png" alt="3" style="zoom:50%;" />

  The Dart SDK is already bundled with the Flutter SDK, so there is no need to install the Dart SDK separately.

- Unzip the downloaded installation package to the path where you want to install the Flutter SDK (eg D:\flutter, be careful not to install flutter to a path that requires some high privileges such as C:\Program Files\)

- Locate flutter_console.bat under the flutter file in the Flutter installation directory. Double-click it to start the flutter command line automatically.

<img src="https://github.com/SaberDa/CSCI-6221-Project-and-Assignment-/raw/master/Final%20Project/doc/images/4.png" alt="4" style="zoom:50%;" />

##### Change system environment variables

- Open Control Panel > User Accounts > User Accounts > Change My Environment Variables

- Add Flutter to it.

  

##### Flutter doctor test

Terminal input: ```flutter doctor```

This command checks your environment and displays the report in a terminal window. This command may run very slowly for the first time. Flutter automatically installs the required dependencies and compiles them.

<img src="https://github.com/SaberDa/CSCI-6221-Project-and-Assignment-/raw/master/Final%20Project/doc/images/5.png" alt="5" style="zoom:50%;" />



##### Install Android Studio and create an emulator (AVD virtual machine)

 [Official website to download the installation package](https://developer.android.com/)  



##### Android Studio installs the Flatter plugin

Open Android Studio, menu bar File => Settings => Plugins, enter futtler in the search box, click install, after the installation is complete, restart Android Studio.

<img src="https://github.com/SaberDa/CSCI-6221-Project-and-Assignment-/raw/master/Final%20Project/doc/images/6.png" alt="6" style="zoom:50%;" />



##### Install Android certificate

Terminal input: ```flutter doctor --android-licenses```

Note: Tips are always entered ```y```



#### Running Flutter

1. Open Android Studio, menu bar File => New => New Flutter Project, select the first option Flutter Application (flutter application)

   <img src="https://github.com/SaberDa/CSCI-6221-Project-and-Assignment-/raw/master/Final%20Project/doc/images/7.png" alt="7" style="zoom:50%;" />

   Enter the project name (note: the project name must be lowercase, the words are separated by underscores), always click next, and finally finish, the system can automatically create a Flutter project.

   <img src="https://github.com/SaberDa/CSCI-6221-Project-and-Assignment-/raw/master/Final%20Project/doc/images/8.png" alt="8" style="zoom:50%;" />

2. In the open Android Studio you can see the Flutter project created in the previous step.

   <img src="https://github.com/SaberDa/CSCI-6221-Project-and-Assignment-/raw/master/Final%20Project/doc/images/9.png" alt="9" style="zoom:50%;" />

3. Turn on the emulator (ADV Manager icon button in the upper right corner)

   <img src="https://github.com/SaberDa/CSCI-6221-Project-and-Assignment-/raw/master/Final%20Project/doc/images/10.png" alt="10" style="zoom:50%;" />

4. Once the emulator is running, click the debug or run icon button in the top right corner of Android Studio. (This step takes a little time, pay attention to observe the console area information, as shown below, the compilation is successful)

   <img src="https://github.com/SaberDa/CSCI-6221-Project-and-Assignment-/raw/master/Final%20Project/doc/images/11.png" alt="11" style="zoom:50%;" />

5. After the previous step is successfully compiled, you can see the flutter application page in the emulator.

<img src="https://github.com/SaberDa/CSCI-6221-Project-and-Assignment-/raw/master/Final%20Project/doc/images/2.jpg" alt="2" style="zoom:50%;" />