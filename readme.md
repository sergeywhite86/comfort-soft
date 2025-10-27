

Spring Boot сервис для поиска N-го минимального числа в XLSX файлах.

## Описание

Сервис предоставляет REST API для поиска N-го минимального числа в столбце целых чисел XLSX файла. Используется эффективный алгоритм QuickSelect без полной сортировки массива.

## Технологии

- **Java 21**
- **Spring Boot 3.5.7**
- **Apache POI 5.2.4** - работа с Excel файлами
- **SpringDoc OpenAPI 3.0** - Swagger документация
- **Maven** - сборка проекта

## Требования

- Java 21 или выше
- Maven 3.6 или выше

## Сборка и запуск
### 1. Клонирование репозитория
```bash
git clone https://github.com/sergeywhite86/comfort-soft
```
### 2. Сборка проекта
```bash
mvn clean package
```
### 3. Запуск проекта
```bash
java -jar target/comfort-soft-task-0.0.1-SNAPSHOT.jar
```
### После запуска откройте в браузере:

<http://localhost:8080/swagger-ui.html>
