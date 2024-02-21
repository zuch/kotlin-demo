# kotlin demo

Spring Boot Kotlin demo project using Spring WebFlux to call GitHub Public API

## API

### Get all public repositories of a user

```http
POST localhost:8080/users
```

Example Request Body
```json
{
  "logins" : [
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
      "login": "vinodtana",
      "name": "Vinod Tana",
      "company": "Xerve innovations pvt ltd",
      "location": "Bangalore",
      "public_repos": 12,
      "public_gists": 0,
      "followers": 1,
      "following": 2
    },
    {
      "login": "charlax",
      "name": "Charles-Axel Dein",
      "location": "New York",
      "bio": "Scaling teams, product and tech at a stealth startup",
      "public_repos": 104,
      "public_gists": 16,
      "followers": 1810,
      "following": 41
    },
    {
      "login": "tefra",
      "name": "Chris Tsou",
      "location": "Greece",
      "public_repos": 39,
      "public_gists": 7,
      "followers": 33,
      "following": 7
    },
    {
      "login": "ansarinaeemakhtar",
      "name": "Naeem Akhtar",
      "location": "Pune",
      "hireable": "true",
      "public_repos": 72,
      "public_gists": 6,
      "followers": 25,
      "following": 90
    },
    {
      "login": "cat",
      "name": "Nicola Bonelli",
      "location": "Italy",
      "public_repos": 1,
      "public_gists": 0,
      "followers": 27,
      "following": 1
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

