# OnlineBookStore
A simple online book store

## Tech Stack
* Springboot 
* Java 
* PostgreSQL

## Application RestAPIs

###### Main Link
* [ home / ](http://bookstore-env.eba-ugvdpymc.us-west-2.elasticbeanstalk.com/)

###### Get all order using this api
* Get: [api/orders](http://bookstore-env.eba-ugvdpymc.us-west-2.elasticbeanstalk.com/api/orders)

###### Create a single order using this RestAPI
* Post: [api/orders/order](http://bookstore-env.eba-ugvdpymc.us-west-2.elasticbeanstalk.com/api/orders/order)
    *   Use JSON format for the request body
    *   e.g. `{ "ISBN": "9783161484107", "quantity": "2" }`

###### Create multiple orders using this RestAPI
* Post: [api/orders](http://bookstore-env.eba-ugvdpymc.us-west-2.elasticbeanstalk.com/api/orders)
    *   Use JSON format for the request body
    *   e.g. `[{ "ISBN": "9783161484107", "quantity": "2" }, 
               { "ISBN": "9783161484102", "quantity": "5" },
               { "ISBN": "9783161484102", "quantity": "2" }
              ]`

##Authentication
* Auth Type: BasicAuth
* username: user
* password: pass

###Books

| ISBN           | title          | author               |
| -------------- | -------------- | -------------------- |
| 9783161484100  | SQL            | Teddy Martingale     |
| 9783161484101  | Liquibase      | John Madea           |
| 9783161484102  | Java           | John Scott           |
| 9783161484103  | Spring Boot    | Hilary Ford          |
| 9783161484104  | Postman        | Josh Fix             |
| 9783161484105  | JQuery         | Gary Champ           |
| 9783161484106  | Web Design     | Miles Fern           |
| 9783161484107  | Angular        | Courtney Mbalula     |
| 9783161484108  | Python         | Alex Mota            |
| 9783161484109  | C# Basics      | Alfred Zaine         |