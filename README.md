# Timebooking software for small business
Select a business, select time internval, select service, book!

## To run the project (for now without orchestrator)
1. Make sure you have mongodb installed on port 27017
    1. create user: user, pass: user123456
    2. create authentication-database
    3. create account-database

2. Make sure you have rabbitmq on port 5672

3. Run projects in following order
    1. configuration
    2. eureka-registry
    3. turbine-stream-service
    4. hystrix-monitoring
    5. authentication-service
    6. account-service
    7. .. to be added

done.
