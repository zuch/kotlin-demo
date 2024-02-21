# Kotlin Demo

Spring Boot Kotlin demo project using Spring WebFlux to call GitHub Public API

## Design

![design](https://gist.githubusercontent.com/zuch/479b6c6b328af5253d313ce51e198152/raw/5c0829d4601e67a46658702b2c01e4864985b0ee/Kotlin_Demo_App_calling_Github_API_with_Spring_Webflux.png)

## API

### Get all public repositories of a user

```http
POST localhost:8080/users
```

Example Request Body
```json
{
  "usernames" : [
    "charlax",
    "vinodtana",
    "tefra",
    "ansarinaeemakhtar",
    "cat"
  ]
}
```

Example Response Body
```json
{
  "users": [
    {
      "username": "charlax",
      "name": "Charles-Axel Dein",
      "location": "New York",
      "bio": "Scaling teams, product and tech at a stealth startup",
      "public_repos": 104,
      "public_gists": 16,
      "followers": 1813,
      "following": 41
    },
    {
      "username": "ansarinaeemakhtar",
      "name": "Naeem Akhtar",
      "location": "Pune",
      "hireable": "true",
      "public_repos": 72,
      "public_gists": 6,
      "followers": 25,
      "following": 90
    },
    {
      "username": "cat",
      "name": "Nicola Bonelli",
      "location": "Italy",
      "public_repos": 1,
      "public_gists": 0,
      "followers": 27,
      "following": 1
    },
    {
      "username": "tefra",
      "name": "Chris Tsou",
      "location": "Greece",
      "public_repos": 39,
      "public_gists": 7,
      "followers": 33,
      "following": 7
    },
    {
      "username": "vinodtana",
      "name": "Vinod Tana",
      "company": "Xerve innovations pvt ltd",
      "location": "Bangalore",
      "public_repos": 12,
      "public_gists": 0,
      "followers": 1,
      "following": 2
    }
  ]
}
```


## Getting Started

### Reference Documentation

* [Coroutines section of the Spring Framework Documentation](https://docs.spring.io/spring/docs/6.1.3/spring-framework-reference/languages.html#coroutines)
* [Spring Reactive Web](https://docs.spring.io/spring-boot/docs/3.2.2/reference/htmlsingle/index.html#web.reactive)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a Reactive RESTful Web Service](https://spring.io/guides/gs/reactive-rest-service/)

