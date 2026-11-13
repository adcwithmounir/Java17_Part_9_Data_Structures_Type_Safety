<div align="center">

# ☕ Java SE 17 — Part 9: Data Structures & Type Safety

### Master lists, sets, queues, maps, sorting & generics and prepare for the OCP 1Z0-829 certification

**Source code for the video course by _ADC with Mounir_**

[![Java](https://img.shields.io/badge/Java-SE%2017-58A6FF?style=for-the-badge&logo=openjdk&logoColor=white)](https://openjdk.org/projects/jdk/17/)
[![YouTube](https://img.shields.io/badge/Watch%20on-YouTube-FF0000?style=for-the-badge&logo=youtube&logoColor=white)](https://tinyurl.com/java17fundamental)

</div>

---

## 📖 About this repository

This repository contains **all the code examples** shown in **Part 9 — Data Structures & Type Safety** of the *Java SE 17 Full Course* on the **ADC with Mounir** YouTube channel.

Every folder matches one video. Open the folder, follow along with the video, run the code, break it, fix it — that is the fastest way to really learn Java.

All examples are built around the same **streaming-platform project** as the previous parts (`Content`, `Movie`, `Series`, `Episode`, `User`, `Subscription`, `ContentType`…), so every collection has a real, meaningful job: watchlists kept in order, genres that must stay unique, queues of episodes to play next, maps from titles to ratings, catalogs sorted by any criteria, and generic types that keep all of it type-safe.

---

## 🎯 Who is this for?

| | Profile | How to use this repo |
|---|---|---|
| 🟢 | **Learners who finished Part 8** — comfortable with classes, interfaces and lambdas | Follow the folders in order, one video at a time |
| 🔵 | **Developers coming from JavaScript, Python, C# or Kotlin** | Jump to the topics you need — Java's collections and generics have their own rules and quirks |
| 🟠 | **OCP 1Z0-829 candidates** | Focus on the 🎓 exam traps and practice questions in each video — collection methods, sorting with `Comparable` / `Comparator` and generics are heavily tested |

---

## 🗂️ Course content

| # | Folder | Video topic | What you'll learn | Status |
|:-:|---|---|---|:-:|
| 1 | `Part_9_1_Data_Structures_Type_Safety` | **The methods every collection shares** | The four families of collections, generics and the diamond operator, `add`, `remove`, `size`, `isEmpty`, `clear`, `contains`, `removeIf`, `forEach`, `equals` | ✅ |
| 2 | `Part_9_2_Data_Structures_Type_Safety` | **Keeping things in order with lists** | `ArrayList` or `LinkedList`, `Arrays.asList`, `List.of`, `List.copyOf`, `add`/`get`/`set`/`remove` by index, `replaceAll`, `toArray` | ✅ |
| 3 | `Part_9_3_Data_Structures_Type_Safety` | **Sets never hold the same thing twice** | `HashSet` or `TreeSet`, `add` returning `false` on a duplicate, `hashCode` and `equals`, `Set.of`, `Set.copyOf`, `null` and `Comparable` rules, `contains`, `remove`, `removeIf` | ✅ |
| 4 | `Part_9_4_Data_Structures_Type_Safety` | **Lining up data with queues and stacks** | `Queue` and `Deque`, `ArrayDeque` or `LinkedList`, `offer`/`peek`/`poll` vs `add`/`element`/`remove`, `offerFirst`/`offerLast`, `push`/`pop` as a stack | ✅ |
| 5 | `Part_9_5_Data_Structures_Type_Safety` | **Maps** | Keys and values: `HashMap`, `TreeMap` and the `Map` methods | 🔜 |
| 6 | `Part_9_6_Data_Structures_Type_Safety` | **Choosing the right collection** | Comparing the collection types and their behavior | 🔜 |
| 7 | `Part_9_7_Data_Structures_Type_Safety` | **Sorting** | `Comparable`, `Comparator` and sorting your data | 🔜 |
| 8 | `Part_9_8_Data_Structures_Type_Safety` | **Generics** | Generic classes, interfaces and methods, bounds and wildcards | 🔜 |
| 9 | NO LABS (see the video) | **Chapter Review & Practice Questions** | Summary, exam essentials and OCP-style practice questions | 🔜 |

> ✅ Available · 🔜 Coming soon — the repo is updated as new videos are released.

---

## 🎓 OCP 1Z0-829 objectives covered

- **Working with Arrays and Collections**
  - Create Java arrays, `List`, `Set`, `Map`, and `Deque` collections, and add, remove, update, retrieve and sort their elements

---

## 🛠️ Prerequisites

- **JDK 17** installed ([Eclipse Temurin](https://adoptium.net/) or [Oracle JDK](https://www.oracle.com/java/technologies/downloads/#java17))
- A code editor — the course uses **VS Code** with the *Extension Pack for Java*, but any IDE works (IntelliJ IDEA, Eclipse…)
- Comfort with **interfaces and lambdas** (covered in [Part 7](https://github.com/adcwithmounir/Java17_Part_7_Interfaces_Abstract_Types) and [Part 8](https://github.com/adcwithmounir/Java17_Part_8_Functional_Programming))

Check your installation:

```bash
javac -version   # should print 17.x
java  -version   # should print 17.x
```

---

## 🚀 Getting started

```bash
# 1. Clone the repository
git clone https://github.com/adcwithmounir/Java17_Part_9_Data_Structures_Type_Safety.git
cd Java17_Part_9_Data_Structures_Type_Safety

# 2. Open the folder of the video you are watching
cd Part_9_1_Data_Structures_Type_Safety
```

Each folder is independent. You can open it directly in VS Code, or compile and run from the terminal:

```bash
# Compile all the classes of the folder
javac *.java

# Run the class that has the main method (no .class extension!)
java Watchlist
```

---

## 📺 Watch the course

| Resource | Link |
|---|---|
| 📃 Part 1 playlist (start here if you're new) | [tinyurl.com/java17fundamental](https://tinyurl.com/java17fundamental) |
| 📃 All the course playlists | [youtube.com/@ADCWithMounir/playlists](https://www.youtube.com/@ADCWithMounir/playlists) |
| 💻 Source code (this repo) | [github.com/adcwithmounir/Java17_Part_9_Data_Structures_Type_Safety](https://github.com/adcwithmounir/Java17_Part_9_Data_Structures_Type_Safety) |

---

## 🧭 Course roadmap

This repository is **Part 9** of a complete Java SE 17 course. Each part has its own repository.

| Part | Topic | Status |
|:-:|---|:-:|
| 1 | [Java Fundamentals / Core Syntax](https://github.com/adcwithmounir/Java17_Part_1_Fundamentals_Core_Syntax) | ✅ |
| 2 | Expressions & Computations | 🔜 |
| 3 | Control Flow & Conditionals | 🔜 |
| 4 | Essential Java Libraries | 🔜 |
| 5 | Functions & Parameters | 🔜 |
| 6 | [Object-Oriented Basics](https://github.com/adcwithmounir/Java17_Part_6_Object_Oriented_Basics) | ✅ |
| 7 | [Interfaces & Abstract Types](https://github.com/adcwithmounir/Java17_Part_7_Interfaces_Abstract_Types) | ✅ |
| 8 | [Functional Programming](https://github.com/adcwithmounir/Java17_Part_8_Functional_Programming) | ✅ |
| 9 | [Data Structures & Type Safety](https://github.com/adcwithmounir/Java17_Part_9_Data_Structures_Type_Safety) | 🚧 |
| 10 | Data Processing Pipelines | 🔜 |
| 11 | Error Handling & i18n | 🔜 |
| 12 | Java Module System (JPMS) | 🔜 |
| 13 | Multithreading & Parallelism | 🔜 |
| 14 | File & Stream Operations | 🔜 |
| 15 | Database Connectivity | 🔜 |

> ✅ Available · 🚧 In progress · 🔜 Coming soon

---

## 📚 Recommended reading

This course is inspired by, and complements, the official study guide:

> **OCP Oracle Certified Professional Java SE 17 Developer Study Guide: Exam 1Z0-829**
> Scott Selikoff & Jeanne Boyarsky — Sybex

The course does not replace the book. All code, explanations and practice questions in this repository are original.

---

## 🤝 Contributing

Found a typo, a bug, or have an idea for a better example?
Feel free to [open an issue](https://github.com/adcwithmounir/Java17_Part_9_Data_Structures_Type_Safety/issues) or submit a pull request. Questions about the videos are welcome in the YouTube comments too.

---

## 📄 License

This project is licensed under the [MIT License](./LICENSE) — use the code freely to learn and practice.

---

<div align="center">

**⭐ If this repository helps you learn Java, give it a star — it helps other learners find it!**

Made with ☕ by **ADC with Mounir**

</div>
