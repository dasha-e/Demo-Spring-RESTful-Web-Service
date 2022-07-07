# Demo Spring RESTful Web Service

Проект создан в рамках университетской практики. Цель его создания — знакомство с основными инструментами, используемыми
компанией Сбер при разработке, и создание с их помощью демо-приложение. Приложение представляет собой RESTful Web Service
на основе Spring Boot, связанный с базой данных PostgreSQL, которая содержит некоторый набор алгоритмов сортировки.
Основная функция приложения — сортировка заданного или случайного массива целых чисел выбранным алгоритмом из базы
данных.

## Содержание

- [Технологии](#технологии)
- [Использование](#использование)
- [Установка и запуск](#установка-и-запуск)
- [Реализация алгоритмов](#реализация-алгоритмов)
- [Тестирование](#тестирование)
- [Источники](#источники)

## Технологии

- [JDK 11](https://www.java.com/ru/)
- [Maven](https://www.postgresql.org/)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [PostgreSQL](https://www.postgresql.org/)
- [Swagger](https://projectlombok.org/)

## Использование

Данное приложение можно использовать в качестве демонстрационного материала по созданию REST API. Или для сравнительного
анализа относительной скорости работы различных алгоритмов сортировки, поскольку одним из выходных параметров является
время работы алгоритма.

## Установка и запуск

Перед запуском приложения необходимо исполнить [SQL-скрипты](src/main/resources/database) для создания пользователя,
базы данных и таблицы с алгоритмами и ее заполнения. После этого необходимо запустить DemoApplication. Теперь приложение
готово принимать HTTP-запросы по адресу:

```sh
http://localhost:8080/ ... /
```

## Реализация алгоритмов

Всего было реализованно 8 различных алгоритмов сортировки. Вызов выбранного алгоритма осуществляется с использованием 
паттерна Стратегия.

### 1. Bubble Sort

<img src="https://raw.githubusercontent.com/dasha-e/Demo-Spring-RESTful-Web-Service/development/src/main/resources/algorithms-visualizations/bubble_sort.gif" width="400" height="300"/>

### 2. Selection Sort

<img src="https://raw.githubusercontent.com/dasha-e/Demo-Spring-RESTful-Web-Service/development/src/main/resources/algorithms-visualizations/selection_sort.gif" width="400" height="300"/>

### 3. Insertion Sort

<img src="https://raw.githubusercontent.com/dasha-e/Demo-Spring-RESTful-Web-Service/development/src/main/resources/algorithms-visualizations/insertion_sort.gif" width="400" height="300"/>

### 4. Quick Sort

<img src="https://raw.githubusercontent.com/dasha-e/Demo-Spring-RESTful-Web-Service/development/src/main/resources/algorithms-visualizations/quick_sort_hoare.gif" width="400" height="300"/>

### 5. Merge Sort

<img src="https://raw.githubusercontent.com/dasha-e/Demo-Spring-RESTful-Web-Service/development/src/main/resources/algorithms-visualizations/merge_sort.gif" width="400" height="300"/>

### 6. Heap Sort

<img src="https://raw.githubusercontent.com/dasha-e/Demo-Spring-RESTful-Web-Service/development/src/main/resources/algorithms-visualizations/heap_sort.gif" width="400" height="300"/>

### 7. Binary Tree Sort

<img src="https://raw.githubusercontent.com/dasha-e/Demo-Spring-RESTful-Web-Service/development/src/main/resources/algorithms-visualizations/BSTinsertion.gif" width="400" height="250"/>

### 8. AVL Tree Sort

<img src="https://raw.githubusercontent.com/dasha-e/Demo-Spring-RESTful-Web-Service/development/src/main/resources/algorithms-visualizations/AVL_Tree_Sort.gif" width="400" height="200"/>

### Tree traversal

<img src="https://raw.githubusercontent.com/dasha-e/Demo-Spring-RESTful-Web-Service/development/src/main/resources/algorithms-visualizations/treeTraversal.gif" width="400" height="400"/>

## Тестирование

Реализации алгоритмов сортировки были покрыты JUnit [тестами](src/test/java/com/example/demo/SortingTest.java).
Тестирование самого приложение проводилось вручную с помощью [Swagger](https://projectlombok.org/) по адресу:

```sh
http://localhost:8080/swagger-ui/index.html
```

Ниже представлены результаты тестирования алгоритмов сортировок через эндпоинт **/sort-random-array** на несортированных 
и сортированных массивах случайных целых чисел, где "Array length" - длина массива, "Time" - среднее время сортировки в 
миллисекундах.

### Bubble Sort

Unsorted:

| Array length | 100 | 1000 | 10 000 | 100 000 | 
| :---: | :---: | :---: | :---: | :---: |   
| **Time (msec)** | 0,533 | 0,533 | 144,333 | 20445,8667 |  

Sorted:

| Array length | 100 | 1000 | 10 000 | 100 000 | 
| :---: | :---: | :---: | :---: | :---: |     
| **Time (msec)** | 0 | 0 | 0 | 0 |

### Selection Sort

Unsorted:

| Array length | 100 | 1000 | 10 000 | 100 000 | 
| :---: | :---: | :---: | :---: | :---: |   
| **Time (msec)** | 0 | 0,333 | 57,6 | 5367,333|  

Sorted:

| Array length | 100 | 1000 | 10 000 | 100 000 | 
| :---: | :---: | :---: | :---: | :---: |     
| **Time (msec)** | 0 | 0,133 | 50,733 | 4398,667 |

### Insertion Sort

Unsorted:

| Array length | 100 | 1000 | 10 000 | 100 000 | 
| :---: | :---: | :---: | :---: | :---: |   
| **Time (msec)** | 0 | 0,2 | 70,733 | 6955,467 |   

Sorted:

| Array length | 100 | 1000 | 10 000 | 100 000 | 
| :---: | :---: | :---: | :---: | :---: |     
| **Time (msec)** | 0 | 0 | 0 | 0 |

### Quick Sort

Unsorted:

| Array length | 100 | 1000 | 10 000 | 100 000 | 1 000 000
| :---: | :---: | :---: | :---: | :---: | :---: |   
| **Time (msec)** | 0 | 0 | 1 | 13,267 | 156,067 |

Sorted:

| Array length | 100 | 1000 | 10 000 | 100 000 | 1 000 000
| :---: | :---: | :---: | :---: | :---: | :---: |   
| **Time (msec)** | 0 | 0 | 0 | 3 | 37,267 |

### Merge Sort

Unsorted:

| Array length | 100 | 1000 | 10 000 | 100 000 | 1 000 000
| :---: | :---: | :---: | :---: | :---: | :---: |   
| **Time (msec)** | 0 | 0 | 1 | 17,6 | 178,533 |

Sorted:

| Array length | 100 | 1000 | 10 000 | 100 000 | 1 000 000
| :---: | :---: | :---: | :---: | :---: | :---: |   
| **Time (msec)** | 0 | 0 | 0,2 | 8,133 | 90,467 |

### Heap Sort

Unsorted:

| Array length | 100 | 1000 | 10 000 | 100 000 | 1 000 000
| :---: | :---: | :---: | :---: | :---: | :---: |   
| **Time (msec)** | 0 | 0 | 1 | 20,2 | 284,333 |

Sorted:

| Array length | 100 | 1000 | 10 000 | 100 000 | 1 000 000
| :---: | :---: | :---: | :---: | :---: | :---: |    
| **Time (msec)** | 0 | 0 | 1 | 14,867 | 147,4 |

### Binary Tree Sort

Unsorted:

| Array length | 100 | 1000 | 10 000 | 100 000 | 1 000 000
| :---: | :---: | :---: | :---: | :---: | :---: |   
| **Time (msec)** | 0 | 0 | 1,267 | 47,867 | 6473,467 |

Sorted:

| Array length | 100 | 1000 |10 000 | 100 000 | 1 000 000 | 
| :---: | :---: | :---: | :---: | :---: | :---: |   
| **Time (msec)** | 0 |    1 | 105,133 | 11103,933 | 1593855 |

### AVL Tree Sort

Unsorted:

| Array length | 100 | 1000 | 10 000 | 100 000 | 1 000 000
| :---: | :---: | :---: | :---: | :---: | :---: |   
| **Time (msec)** | 0 | 0 | 1,467 | 54,533 | 6467,933 |

Sorted:

| Array length | 100 | 1000 |10 000 | 100 000 | 1 000 000 | 
| :---: | :---: | :---: | :---: | :---: | :---: |    
| **Time (msec)** |0 | 1 | 104,067 | 10940,667 | 1617665 |

## Источники

- [Визуализация алгоритмов](https://emre.me/algorithms/sorting-algorithms/)
- [Руководство по созданию шаблона REST API](https://spring.io/guides/gs/rest-service/)
- [Справочная информация для работы с Spring Boot](https://www.baeldung.com/)
- [Паттерн Стратегия](https://refactoring.guru/ru/design-patterns/strategy)
