docker run -p 27017:27017 -v C:\denis\time-slot-booking\data\mongo:/data/db -v C:\denis\time-slot-booking\src\account-service-mongodb\mongo-init.js:/docker-entrypoint-initdb.d/mongo-init.js:ro mongo
docker run -p 5672:5672 -p 5673:5673 -p 15672:15672 -v C:\denis\time-slot-booking\data\rabbitmq:/data rabbitmq:3-management
