Order
Let’s introduce the concept of order, meaning that your API should also support:
● Placing an order
● Retrieving all orders within a given time period
Each order should have a list of product, unique id,
the buyer’s e-mail, and the time the order was placed. It should be possible to calculate
the total order amount, based on the price of the individual products.


RUN
------------------
./gradlew bootRun


SWAGGER-UI
--------------------------
http://localhost:8095/swagger-ui.html


UI   Thymeleaf
------------------------
http://localhost:8095/