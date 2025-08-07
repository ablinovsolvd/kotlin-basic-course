# Beginner's Guide: Setting Up GitHub, Git, OpenJDK, and IntelliJ IDEA

This guide will help you (or your students) get started from scratch, even if you have never used GitHub, Git, or programming tools before. Just follow each step, and you’ll be ready to write your first Kotlin program!

---

## 1. Creating a GitHub Account

1. Go to [github.com](https://github.com).
2. Click **Sign Up** in the top-right corner.
3. Enter your email, create a password, and choose a username.
4. Follow the instructions on the screen to finish creating your account.
5. After registration, open your email and confirm your address.

---

## 2. Installing Git

Git is a tool that helps you manage and track changes in your code.

### For Windows:
- Go to [git-scm.com](https://git-scm.com/download/win) and download the installer.
- Open the downloaded file and follow the installation steps (you can use all default options).

### For Mac:
- Open the Terminal app and type:
  ```
  xcode-select --install
  ```
  This will install Git and related tools.

### For Linux:
- Open Terminal and type:
  ```
  sudo apt update
  sudo apt install git
  ```

### Check your installation:
- Open Terminal (or Command Prompt) and type:
  ```
  git --version
  ```
  If you see a version number, Git is installed!

---

## 3. Installing OpenJDK (Java Development Kit)

Kotlin needs Java to work, so we install OpenJDK.

### For Windows and Mac:
- Go to [Adoptium.net](https://adoptium.net/temurin/releases) (Eclipse Temurin is recommended).
- Download the installer for your system (choose Java 17 or 21).
- Run the installer and follow the steps.

### For Linux:
- In Terminal, type:
  ```
  sudo apt update
  sudo apt install openjdk-17-jdk
  ```
  (Replace `17` with another version if needed.)

### Check your installation:
- In Terminal or Command Prompt, type:
  ```
  java -version
  ```
  You should see the installed version printed.

---

## 4. Installing IntelliJ IDEA (IDE)

This is a program where you will write and run your Kotlin code.

1. Go to [jetbrains.com/idea/download](https://www.jetbrains.com/idea/download/).
2. Download the **Community Edition** (it’s free).
3. Run the installer and follow the steps.
4. Open IntelliJ IDEA after installing.

---

## 5. Setting Up Your First Kotlin Project

1. Open IntelliJ IDEA.
2. Click **"New Project"**.
3. Select **Kotlin** on the left.
4. Choose **JVM | IDEA** (not JavaScript or Native).
5. Name your project (for example, `kotlin-practice`).
6. Choose the JDK you installed earlier (if prompted).
7. Click **Create**.

---

## 6. Cloning a Repository from GitHub

If you want to download code from GitHub:

1. Go to the desired repository page on GitHub.
2. Click the green **Code** button, then **Copy** the URL.
3. In IntelliJ IDEA, go to **File → New → Project from Version Control**.
4. Paste the URL and click **Clone**.

---

## 7. Writing and Running Your First Kotlin Program

1. In your project, right-click the `src` folder, select **New → Kotlin File/Class**.
2. Name it `Main`.
3. Paste this code:
   ```kotlin
   fun main() {
       println("Hello, World!")
   }
   ```
4. Right-click anywhere in the code and choose **Run 'MainKt'**.

You should see "Hello, World!" appear at the bottom of your screen.

---

## 8. Where to Get Help

- Ask your instructor or classmates.
- Visit [docs.github.com](https://docs.github.com) or [kotlinlang.org](https://kotlinlang.org).
- Search on Google or Stack Overflow if you get stuck.

---

**Congratulations!**  
You are now ready to start coding with Kotlin and GitHub.