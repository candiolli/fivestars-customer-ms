db.createUser(
    {
        user: "fivestars-user-db",
        pwd: "123456",
        roles: [
            {
                role: "readWrite",
                db: "fivestars-customer"
            }
        ]
    }
)