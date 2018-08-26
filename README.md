# GraphQL-Java nested mutations

Showing how to make nested mutations with [graphql-java](https://github.com/graphql-java/graphql-java) and [graphql-annotations](https://github.com/graphql-java/graphql-java-annotations).

Forked from [Baeldung's tutorials repo](https://github.com/eugenp/tutorials), specifically "[Introduction to GraphQL](http://www.baeldung.com/graphql)".

To run, use the launcher, then send a POST request to http://localhost:5050/users with the header
`Content-Type: application/json` and a GraphQL body, e.g:

``` json
{
  "query": "mutation a($name: String! $email: String! $age: String! ){ user { create ( name: $name email: $email age: $age) { id name email age } } }",
  "parameters": {
    "name": "John",
	"email": "john@email.com",
    "age": 34
  }
}
```