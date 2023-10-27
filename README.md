# Assignment_1
project Hello_world and Calculator using RestAPI Springboot

#Hello_World

Request: GET http://localhost:8080/greetapi/v1/hello Response: Hello World!!

Request: GET http://localhost:8080/greetapi/v1/hello?name=rohini Response: Hello Rohini!!

#Calculator

1) Addition :- Request: GET http://localhost:8080/calculatorapi/v1/addition?number1=12&number2=15 Response: { "answer": 27, "detail": "12 + 15 = 27" }

2) Subtraction :- Request: GET http://localhost:8080/calculatorapi/v1/subtraction?number1=12&number2=15 Response: { "answer": -3, "detail": "12 - 15 = -3" }

3) Multiplication :- Request: GET http://localhost:8080/calculatorapi/v1/multiplication?number1=12&number2=15 Response: { "answer": 180, "detail": "12 * 15 = 180" }

4) Division :- Request: GET http://localhost:8080/calculatorapi/v1/division?number1=12&number2=15 Response: { "answer": 0.8, "detail": "12 / 15 = 0.8" }

5) Square :- Request: GET http://localhost:8080/calculatorapi/v1/square/5 Response: { "answer": 25, "detail": "square of 5 = 25" }

6) Squareroot :- Request: GET http://localhost:8080/calculatorapi/v1/squareroot/225 Response: { "answer": 15, "detail": "squareroot of 225 = 15" }

7) Factorial Request: GET http://localhost:8080/calculatorapi/v1/factorial/5 Response: { "answer": 120, "detail": "5! = 120" }

8) Min-Max :- Request: POST http://localhost:8080/calculatorapi/v1/min-max Body { "numbers" : [10,-5,7,15,-7,-6,16,19,-15,9] } Response: { "min": -15, "max": 19 }
