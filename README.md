# Inheritance-and-Polymorphism-Assignment

A simple Java project demonstrating core Object-Oriented Programming (OOP) concepts using 2D and 3D geometry.

##  Project Structure

* **`Bentuk.java`**: The base class for all shapes.
* **`BujurSangkar.java`**: Square class extending `Bentuk`.
* **`Lingkaran.java`**: Circle class extending `Bentuk`.
* **`Silinder.java`**: Cylinder class extending `Lingkaran`.
* **`Main.java`**: The main runner to test the objects.

##  OOP Concepts Applied

### Encapsulation
Internal state is protected by making attributes like `sisi`, `radius`, and `tinggi` `private`. These are safely accessed and updated via public getter and setter methods.

### Inheritance
Code is reused using the `extends` keyword:
* `BujurSangkar` and `Lingkaran` inherit the `warna` (color) property from `Bentuk`. 
* `Silinder` inherits from `Lingkaran`. 
* Subclasses use `super()` in their constructors to pass data up the chain to parent classes.

### Polymorphism
The `printInfo()` method is overridden in the subclasses to provide specific behaviors. While the base `Bentuk` class simply prints the color, each subclass overrides it to call `super.printInfo()` and append its own custom calculation (Area or Volume).
