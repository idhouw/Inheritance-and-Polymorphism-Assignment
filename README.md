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
<img width="208" height="33" alt="image" src="https://github.com/user-attachments/assets/e20124ee-5fe5-47e1-b8b4-11f53e909a0c" />
<img width="193" height="26" alt="image" src="https://github.com/user-attachments/assets/d89e358c-2c06-4f53-9051-703d2802b4db" />
<img width="206" height="23" alt="image" src="https://github.com/user-attachments/assets/2d737651-d206-46c6-ab1e-1b6a4c840d42" />

### Inheritance
Code is reused using the `extends` keyword:
* `BujurSangkar` and `Lingkaran` inherit the `warna` (color) property from `Bentuk`. 
* `Silinder` inherits from `Lingkaran`. 
* Subclasses use `super()` in their constructors to pass data up the chain to parent classes.
<img width="228" height="14" alt="image" src="https://github.com/user-attachments/assets/bc61a95c-0f2e-43c1-aa03-d39ee966e0d8" />
<img width="215" height="14" alt="image" src="https://github.com/user-attachments/assets/2b36e616-602c-436f-8cab-71da7ac1cae5" />

### Polymorphism
The `printInfo()` method is overridden in the subclasses to provide specific behaviors. While the base `Bentuk` class simply prints the color, each subclass overrides it to call `super.printInfo()` and append its own custom calculation (Area or Volume).
<img width="231" height="55" alt="image" src="https://github.com/user-attachments/assets/4e31277e-2289-4495-8469-89ed51e01308" />
<img width="257" height="53" alt="image" src="https://github.com/user-attachments/assets/f5d602ed-bd2a-42cb-b0d4-6f9fde19b93a" />


