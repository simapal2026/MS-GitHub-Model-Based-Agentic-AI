# Java Code Review Checklist

This checklist is a guide for conducting effective code reviews in a Java project. It helps ensure code quality, maintainability, and adherence to team standards.

## 1. Functionality & Correctness

*   [ ] Does the code work as intended and meet all the requirements described in the ticket/task?
*   [ ] Are all edge cases and potential failure scenarios handled appropriately?
*   [ ] Is the logic sound, and are there any logical errors or bugs?
*   [ ] Have the changes been covered by unit tests (e.g., using JUnit or Mockito), and do all tests pass?
*   [ ] Are the assertions in the unit tests meaningful and do they test the functionality correctly?

## 2. Code Readability & Style

*   [ ] Are the variable, method, and class names clear, meaningful, and self-explanatory?
*   [ ] Does the code adhere to the team's agreed-upon coding style and formatting conventions (indentation, spacing, etc.)?
*   [ ] Are comments used appropriately to explain "why" the code does something, rather than "what" it does? (Redundant comments should be removed.)
*   [ ] Are "magic numbers" or strings replaced with named constants or enums?
*   [ ] Are there any unused imports or dead code that should be removed?

## 3. Design & Structure

*   [ ] Does the code follow the Single Responsibility Principle (SRP)? Methods and classes should be small and focused on a single task.
*   [ ] Are other SOLID principles applied where applicable (e.g., Open/Closed, Liskov Substitution)?
*   [ ] Is code duplication avoided (DRY principle), and are existing libraries/utility functions reused where possible?
*   [ ] Is the code modular and well-organized in terms of package/layer placement (e.g., separating UI, business logic, data access)?
*   [ ] Is the appropriate use of interfaces and abstractions evident (e.g., coding to interfaces rather than implementations)?

## 4. Error Handling & Security

*   [ ] Are exceptions handled properly using specific exception types instead of general `Exception` catches?
*   [ ] Are meaningful error messages provided to aid debugging?
*   [ ] Are resources (like database connections, streams) closed properly in a `finally` block or using try-with-resources?
*   [ ] Is user input validated to prevent security vulnerabilities like SQL injection or XSS?
*   [ ] Are sensitive credentials or API keys avoided in the source code (no hardcoding)?

## 5. Performance & Resource Management

*   [ ] Are `StringBuilder` or `StringBuffer` used for extensive string concatenation within loops?
*   [ ] Are unnecessary objects being created, especially inside loops?
*   [ ] Are appropriate data structures and algorithms chosen for the task to avoid performance bottlenecks?
*   [ ] Are null checks performed to avoid common `NullPointerException` errors?
*   [ ] Is attention paid to concurrency and thread safety if applicable?

## 6. Documentation & Version Control

*   [ ] Is the relevant project documentation (e.g., README, API docs) updated with the changes?
*   [ ] Are commit messages clear, concise, and descriptive of the changes made?
*   [ ] Has the developer rebased on the latest master/main branch to ensure the changes are in sync?
*   [ ] Are external libraries and dependencies necessary, up-to-date, and free of conflicts?
