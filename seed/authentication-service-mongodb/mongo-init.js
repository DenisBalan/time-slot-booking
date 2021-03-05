db = db.getSiblingDB('authentication-database');
db.createUser(
    {
        user: 'user',
        pwd:  'user123456',
        roles: [{role: 'readWrite', db: 'authentication-database'}],
    }
);

db = db.getSiblingDB('account-database');
db.createUser(
    {
        user: 'user',
        pwd:  'user123456',
        roles: [{role: 'readWrite', db: 'account-database'}],
    }
);
