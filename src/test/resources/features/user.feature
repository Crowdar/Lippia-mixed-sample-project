Feature: Api Users
Como un usuario de la API
Quiero ejecutar un request
Para obtener respuestas apropiadas

@Example
Scenario Outline: Users
When I perform a '<operation>' to '<entity>' endpoint with the '<inputJson>' and '<inputJsonParameters>' 
Then I will get the proper status code '<statusCode>'

Examples:
  |operation	|inputJson 									|statusCode |entity		|inputJsonParameters	|
  |GET   			|/users/getUsers						|200        |USER		  ||
  |GET   			|/users/getUsersParam 			|200        |USER			||
  |GET   			|/users/getUsersByEmail			|200        |USER			||
  |PUT 				|/users/putUsersBlock				|200        |USER			|id:f9177d0b-172e-4bf6-b8dd-293ed25bade4|
  |PUT 				|/users/putUsersUnblock			|200        |USER			|id:f9177d0b-172e-4bf6-b8dd-293ed25bade4|
  |GET   			|/users/getUsersBulkByEmail	|400        |USER			||
  |GET   			|/users/getUsersBulkByCuit	|400        |USER			||
  |PATCH			|/users/patchUsers					|400        |USER			||  
  |POST				|/users/postUsers						|200        |USER			|id:f9177d0b-172e-4bf6-b8dd-293ed25bade4|
  |PUT 				|/users/putUsersRestore			|200        |USER			|id:f9177d0b-172e-4bf6-b8dd-293ed25bade4|
   


