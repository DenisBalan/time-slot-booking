db = db.getSiblingDB('calendar-database');
db.createUser(
    {
        user: 'user',
        pwd:  'user123456',
        roles: [{role: 'readWrite', db: 'calendar-database'}],
    }
);
