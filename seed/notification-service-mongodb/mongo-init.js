db = db.getSiblingDB('notification-database');
db.createUser(
    {
        user: 'user',
        pwd:  'user123456',
        roles: [{role: 'readWrite', db: 'notification-database'}],
    }
);
